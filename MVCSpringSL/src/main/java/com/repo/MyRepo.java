package com.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.model.User;

public interface MyRepo extends CrudRepository<User, String>{
	 
}
