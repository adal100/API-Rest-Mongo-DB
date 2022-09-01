package com.yugioh.cards.service;

import com.yugioh.cards.model.Card;

import java.util.List;

public interface ICardsService {

    void createCard(Card card);

    List<Card> readAllCards();
}
