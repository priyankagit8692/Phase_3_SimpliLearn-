package com.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.model.Student;

@RestController
public class StudentController {
	
	private static Map<String,List<Student>> studMap = new HashMap<String, List<Student>>();
	
	static {
		
		List<Student> list = new ArrayList<Student>();
		Student s1 = new Student("priyanka", "pk@gmail.com");
		list.add(s1);
		s1 = new Student("piyush","pi@gmail.com");
		list.add(s1);
		studMap.put("dps", list);
		
		list = new ArrayList<Student>();
		s1 = new Student("priyank", "pk23@gmail.com");
		list.add(s1);
		s1 = new Student("piyushiya","p23i@gmail.com");
		list.add(s1);
		studMap.put("KVM", list);
	}
	
	@GetMapping("/getStudent/{schoolname}")
	public List<Student> getStudentList(@PathVariable("schoolname") String schoolname){
		
		List<Student> studList = studMap.get(schoolname);
		if(studList == null) {
			studList = new ArrayList<Student>();
			Student s1 = new Student("No Found", "NA");
			studList.add(s1);
		}
		return studList;
	}

}
