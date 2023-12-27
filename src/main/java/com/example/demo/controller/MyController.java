package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.message.Message;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Todo;

import com.example.demo.service.TodoService;


@RestController
@RequestMapping("/todo")
public class MyController {
 TodoService todoService;

public MyController(TodoService todoService) {

	this.todoService = todoService;
}

@PostMapping
public Todo createUserData(@RequestBody Todo todo) 
{
//	System.out.println("pppppppp");

	todoService.createTodo(todo);
	return todo;
}
@GetMapping("/all")
public List<Todo> getAllTodoData() 
{
//	System.out.println("hiii");

	
	return todoService.getAllTodo();
	
}
@GetMapping("{todo_id}")
public Todo GetUserData(@PathVariable("todo_id") String todo_id) 
{

	return todoService.getTodo(todo_id);
	
}

@DeleteMapping("{id}")
public String deleteUserData(@PathVariable("id") String id) 
{

	todoService.deleteUser(id);
	return "deleted";
}

}
