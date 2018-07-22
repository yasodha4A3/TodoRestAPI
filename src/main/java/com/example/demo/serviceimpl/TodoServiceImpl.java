package com.example.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.TodoRepository;
import com.example.demo.entity.Todo;
import com.example.demo.service.TodoService;

@Service
public class TodoServiceImpl implements TodoService{
	@Autowired
   TodoRepository todoRepository;
	
	@Override
	public List<Todo> getAllTodos() {
		return todoRepository.findAll();
	}

	@Override
	public void deleteTodo(int id) {
		 todoRepository.deleteById(id);
	}

	@Override
	public void saveTodo(Todo todo) {	
		todoRepository.save(todo);
	}

}
