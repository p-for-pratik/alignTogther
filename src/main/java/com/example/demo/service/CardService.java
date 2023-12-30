package com.example.demo.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.example.demo.model.Card;
import com.example.demo.repository.CardRepository;

@Service
public class CardService {
CardRepository cardRepository;



public CardService(CardRepository cardRepository) {
	
	this.cardRepository = cardRepository;
}
public String createCard(Card card) {
	cardRepository.save(card);
	return "card created";
}
//public Todo getTodo(String todo_id) {
//	
//
//	return todoRepository.findById(todo_id).get();
//	
//}

public String deleteCard(Integer id) {

	cardRepository.deleteById(id);
	return "deleted";
}
public List<Card> getAllCard() {
	return cardRepository.findAll();
	
}

}
