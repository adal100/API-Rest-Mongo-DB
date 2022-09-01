package com.yugioh.cards.repository;

import com.yugioh.cards.model.Card;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ICardsRepository extends MongoRepository<Card,String> {
}
