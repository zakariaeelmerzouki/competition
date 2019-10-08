package com.carrefour.kata.competitor;

import com.carrefour.kata.equipement.Buckler;
import com.carrefour.kata.weapen.Sword;

public class Swordsman extends Competitor {

    public Swordsman() {
        super(100, new Sword());
    }
    public Swordsman equip(String equipement){
        this.setBuckler(new Buckler());
        this.setHasBuckler(true);
        return this;
    }
}