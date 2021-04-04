package com.springboot.web.repo;

import org.springframework.data.repository.CrudRepository;

import com.springboot.web.model.Todo;

public interface MyRepo extends CrudRepository<Todo, Integer>{

}
