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
import com.example.demo.model.Card;
import com.example.demo.service.CardService;

@RestController
@RequestMapping("/todo")
public class MyController {
 CardService cardService;

public MyController(CardService cardService) {

	this.cardService = cardService;
}

@PostMapping
public Card createUserData(@RequestBody Card card) 
{
	System.out.println("pppppppp");

	cardService.createCard(card);
	return card;
}
@GetMapping("/all")
public List<Card> getAllCardData() 
{
	System.out.println("hiii");

	
	return cardService.getAllCard();
	
}
@GetMapping("/")
public List<Card> getAllCard() 
{
	System.out.println("hiii");

	
	return cardService.getAllCard();
	
}
//@GetMapping("{todo_id}")
//public Todo GetUserData(@PathVariable("todo_id") String todo_id) 
//{
//
//	return todoService.getTodo(todo_id);
//	
//}

@DeleteMapping("{id}")
public String deleteCardData(@PathVariable("id") Integer id) 
{
	
	cardService.deleteCard(id);
	return "deleted";
}

}
