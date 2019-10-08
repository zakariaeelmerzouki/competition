package com.carrefour.kata.competitor;

import com.carrefour.kata.equipement.Buckler;
import com.carrefour.kata.weapen.Axe;

public class Viking extends Competitor {

    public Viking() {
        super(120, new Axe());
    }
    public Viking equip(String equipement){
        this.setBuckler(new Buckler());
        this.setHasBuckler(true);
        return this;
    }
}