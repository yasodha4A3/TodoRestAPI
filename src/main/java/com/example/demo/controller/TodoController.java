package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Todo;
import com.example.demo.service.TodoService;

@RestController
@CrossOrigin
public class TodoController {
    @Autowired
	TodoService service;
	
	@GetMapping("/todo")
	public List<Todo> getTodos(){
		return service.getAllTodos();
	}
	
	@GetMapping("/deleteTodo/{id}")
	public void deleteTodo(@PathVariable int id) {
		service.deleteTodo(id);
	}
	
	@PostMapping("/addTodo")
	public void saveTodo(@RequestBody Todo todo) {
		service.saveTodo(todo);
	}
	
}
