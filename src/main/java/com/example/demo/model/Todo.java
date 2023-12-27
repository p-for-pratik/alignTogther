package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Todo {
@Id	
private String todo_id;
private String todo_detail;

public Todo() {
	
}

public String getTodo_id() {
	return todo_id;
}

public void setTodo_id(String todo_id) {
	this.todo_id = todo_id;
}

public String getTodo_detail() {
	return todo_detail;
}

public void setTodo_detail(String todo_detail) {
	this.todo_detail = todo_detail;
}


}
