package com.yugioh.cards.service;

import com.yugioh.cards.model.Card;
import com.yugioh.cards.repository.ICardsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardService implements ICardsService{

    @Autowired
    ICardsRepository cardsRepository;

    @Override
    public void createCard(Card card) {

        cardsRepository.save(card);

    }

    @Override
    public List<Card> readAllCards() {
        return cardsRepository.findAll();
    }
}
