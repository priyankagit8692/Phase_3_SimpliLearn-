package com.springboot.web.service;

import java.util.ArrayList;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.web.model.Todo;
import com.springboot.web.repo.MyRepo;

@Service
public class TodoService {
	
	@Autowired
	private MyRepo repo;
	
    private static List<Todo> todos = new ArrayList<Todo>();
    private static int todoCount = 3;

    static {
        todos.add(new Todo(1, "amarjeet", "Learn Spring MVC", new Date(),
                false,"pk@gmail.com","Indore","12343"));
        todos.add(new Todo(2, "amarjeet", "Learn Struts", new Date(), false,"pk1@gmail.com","Indore","12343oo"));
        todos.add(new Todo(3, "amarjeet", "Learn Hibernate", new Date(),
                false,"pk2@gmail.com","Indore","ww12343"));
    }

    public List<Todo> retrieveTodos(String user) {
        List<Todo> filteredTodos = new ArrayList<Todo>();
        for (Todo todo : todos) {
            if (todo.getUser().equalsIgnoreCase(user)) {
                filteredTodos.add(todo);
            }
        }
        return filteredTodos;
    }
    
    public Todo retrieveTodo(int id) {
        for (Todo todo : todos) {
            if (todo.getId()==id) {
                return todo;
            }
        }
        return null;
    }

    public void updateTodo(Todo todo){
    		todos.remove(todo);
    		todos.add(todo);
    }

    public void addTodo(String name, String desc, Date targetDate,
            boolean isDone,String email,String city,String password) {
        //todos.add(new Todo(++todoCount, name, desc, targetDate, isDone,email,city,password));
    	repo.save(new Todo(++todoCount, name, desc, targetDate, isDone,email,city,password));
    	
    }

    public void deleteTodo(int id) {
        Iterator<Todo> iterator = todos.iterator();
        while (iterator.hasNext()) {
            Todo todo = iterator.next();
            if (todo.getId() == id) {
                iterator.remove();
            }
        }
    }
}