package com.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.User;
import com.service.UserService;

@Controller
@RequestMapping("/myapp")
public class MyApp {
	
	@Autowired
	UserService userService;
	
	/*
 	@RequestMapping(value="/welcome",method=RequestMethod.GET) 
	@ResponseBody()
	public String sayWelcome() {
		return "welcome priyanka to the Simpli learn";
	}
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	@ResponseBody()
	public String sayLogin() {
		return "welcome to login";
	}
	
	@RequestMapping(value="/register",method=RequestMethod.GET)
	@ResponseBody()
	public String sayRegister() {
		return "welcome to Registration";
	}*/
	
	
	
	//@RequestMapping(value="/login",method=RequestMethod.POST)
	@PostMapping("/login")
	public String loginValid(@RequestParam("uname") String name,@RequestParam("pass") String password,ModelMap map) {
		if(userService.loginValid(name, password)) {
			return "user login success";
		}
		map.put("errorMsg", "Login Failed!!");
		return "login";
		
	}
	
	/*@PostMapping("/register")
	public String register(ModelMap map,@Valid User user,BindingResult result) {
		if(result.hasErrors()) {
			return "register";
		}
		return "success";
	}*/

	//@RequestMapping(value="/register",method=RequestMethod.POST)
	@PostMapping("/register")
	public String register(@RequestParam("uname") String name,@RequestParam("pass") String password,@RequestParam("mail") String
			email,@RequestParam("mobileno") String mobile,ModelMap map) {
		userService.addUser(name, password, email, mobile);
		return "success";
	}
	
	@GetMapping("/findAll")
	@ResponseBody
	public List<User> getAll(){
		return userService.loadUsers();
	}
	
	@GetMapping("/findUser/{name}")
	@ResponseBody
	public String findUser(@PathVariable("name") String name) {
		if(userService.findUser(name))
			return "user found";
		
		return "user not found";
	}
	
	@GetMapping("/delete/{name}")
	@ResponseBody
	public String deleteUser(@PathVariable("name") String name) {
		if(userService.deleteUser(name))
			return "user deleted";
		
		return "user not found";
	}
	
	@PostMapping("/update/{name}/{email}/{pass}/{mo}")
	@ResponseBody
	public String updateUser(@PathVariable("name") String name, @PathVariable("email") String email,@PathVariable("pass") String pass,
			@PathVariable("mo") String mo) {
		userService.updateUser(name, pass, email, mo);
			return "updated successfully";
		
	}
	
}
