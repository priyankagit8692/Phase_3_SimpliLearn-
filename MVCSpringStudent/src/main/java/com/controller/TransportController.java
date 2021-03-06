package com.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.model.Student;
import com.model.Transport;

@RestController
public class TransportController {
	
	private static Map<String, List<Transport>> transMap = new HashMap<String, List<Transport>>();
	
	static {
		
		List<Transport> list = new ArrayList<Transport>();
		Transport trans = new Transport(21.4f, "Bus");
		list.add(trans);
		trans = new Transport(40.5f,"car");
		list.add(trans);
		transMap.put("xyz", list);
		

		list = new ArrayList<Transport>();
		trans = new Transport(25.4f, "auto");
		list.add(trans);
		trans = new Transport(10.5f,"bicycle");
		list.add(trans);
		transMap.put("abc", list);
	}
	
	@GetMapping("/loadroutes/{routes}")
	public List<Transport> getTransport(@PathVariable("routes") String routes){
		
		List<Transport> list = transMap.get(routes);
		if(list == null) {
			 list = new ArrayList<Transport>();
			 Transport trans = new Transport(0.0f, "NO Transport type");
			 list.add(trans);
		}
		return list;
	}

}
