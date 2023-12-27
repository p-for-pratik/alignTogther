package com.example.demo.service;

import java.util.List;


import org.springframework.stereotype.Service;

import com.example.demo.model.Todo;

import com.example.demo.repository.TodoRepository;
@Service
public class TodoService {
TodoRepository todoRepository;



public TodoService(TodoRepository todoRepository) {
	
	this.todoRepository = todoRepository;
}
public String createTodo(Todo todo) {
	todoRepository.save(todo);
	return "todo created";
}
public Todo getTodo(String todo_id) {
	

	return todoRepository.findById(todo_id).get();
	
}

public String deleteUser(String todo_id) {

	todoRepository.deleteById(todo_id);
	return "deleted";
}
public List<Todo> getAllTodo() {
	return todoRepository.findAll();
	
}

}
