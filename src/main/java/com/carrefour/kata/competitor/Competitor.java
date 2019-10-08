package com.carrefour.kata.competitor;

import com.carrefour.kata.equipement.Buckler;
import com.carrefour.kata.weapen.Axe;
import com.carrefour.kata.weapen.Weapen;

public class Competitor {

    private int hitPoints;
    private Weapen weapen;
    private Buckler buckler = null;
    private boolean hasBuckler = false;

    public Competitor() {
    }

    public Competitor(int hitPoints, Weapen weapen) {
        this.hitPoints = hitPoints;
        this.weapen = weapen;
    }

    public void engage(Competitor opponent){
        while(this.hitPoints > 0 && opponent.hitPoints > 0){
            this.hit(opponent);
            opponent.hit(this);
        }
    }

    private void hit(Competitor opponent) {

        if(opponent.hasBuckler && opponent.buckler().isActive()){
            if(this.getWeapen() instanceof Axe) {
                opponent.getHitsFromAnAxe();
            }
        } else {
            opponent.setHitPoints(opponent.hitPoints() - this.weapen.getDamage());
        }
        opponent.switchBucklerState();

        if(opponent.hitPoints < 0)
            opponent.setHitPoints(0);
    }

    private void switchBucklerState() {
        if (this.hasBuckler) {
            Buckler buckler = this.buckler();
            buckler.setActive(!this.buckler.isActive());
            this.setBuckler(buckler);

        }
    }
    private void getHitsFromAnAxe(){

        Buckler buckler = this.buckler();
        buckler.setAxeBlocker(this.buckler().getAxeBlocker() - 1);
        this.setBuckler(buckler);

        if(this.buckler().getAxeBlocker() <= 0) {
            this.setBuckler(null);
            this.setHasBuckler(false);
        }
    }

    public int hitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public Weapen getWeapen() {
        return weapen;
    }

    public void setWeapen(Weapen weapen) {
        this.weapen = weapen;
    }

    public Buckler buckler() {
        return buckler;
    }

    public void setBuckler(Buckler buckler) {
        this.buckler = buckler;
    }

    public boolean hasBuckler() {
        return hasBuckler;
    }
    public void setHasBuckler(boolean hasBuckler) {
        this.hasBuckler = hasBuckler;
    }
}