package com.service;

import java.lang.StackWalker.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.User;
import com.repo.MyRepo;

@Service
public class UserService {
	
	@Autowired
	private MyRepo repo;
	
	ArrayList<User> al = new ArrayList<User>();
	
	public boolean loginValid(String name,String password) {
		if(name.equals("admin") && password.equals("manager")) {
			return true;
		}
		return false;
	}
	
	public void addUser(String name,String password,String email,String mobile) {
		//al.add(new User(name, password, email, mobile));
		repo.save(new User(name, password, email, mobile));
		//System.out.println(al);
		
	}
	
	public List<User> loadUsers(){
		return (List<User>)repo.findAll();
	}
	public boolean findUser(String name) {
		Optional<User> user = repo.findById(name);
		if(user.isPresent()) {
			System.out.println(user);
			return true;
		}
		return false;
		
	}
	
	public boolean deleteUser(String name) {
		Optional<User> user = repo.findById(name);
		if(user.isPresent()) {
			repo.deleteById(name);
			return true;
		}
		return false;
	}
	
	public boolean updateUser(String name,String pass, String email, String mo) {
		Optional<User> user = repo.findById(name);
		if(user.isPresent()) {
			repo.deleteById(name);
			repo.save(new User(name, pass, email, mo));
			return true;
		}
		return false;
	}

}
