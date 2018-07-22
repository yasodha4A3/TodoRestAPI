package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Todo;

public interface TodoService {
	
	public List<Todo> getAllTodos();

	public void deleteTodo(int id);

	public void saveTodo(Todo todo);

}
