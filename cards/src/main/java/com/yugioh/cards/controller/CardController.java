package com.yugioh.cards.controller;


import com.yugioh.cards.model.Card;
import com.yugioh.cards.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CardController {

    @Autowired
    CardService cardService;


    @PostMapping("/create")
    public ResponseEntity<?> createCard(@RequestBody Card card){

        cardService.createCard(card);
        return new ResponseEntity<>(card, HttpStatus.OK);
    }

    @GetMapping("/getAll")
    public ResponseEntity<?> getAll(){
        List<Card> cards = cardService.readAllCards();
        return new ResponseEntity<> (cards, HttpStatus.OK);
    }
}
