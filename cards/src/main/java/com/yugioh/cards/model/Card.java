package com.yugioh.cards.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@ToString
@Document(collection = "MonsterCards")
public class Card {

    @Id
    public int id;
    public int ot;
    public int alias;
    public int setCode;
    public int type;
    public int atk;
    public int def;
    public int level;
    public int race;
    public int attribute;
    public int category;
    public String name;
    public String desc;
}
