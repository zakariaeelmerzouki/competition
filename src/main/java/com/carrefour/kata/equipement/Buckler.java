package com.carrefour.kata.equipement;

public class Buckler {

    private boolean active;
    private int axeBlocker;

    public Buckler(boolean active) {
        this.active = active;
    }

    public Buckler() {
        this.active = true;
        this.axeBlocker = 3;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getAxeBlocker() {
        return axeBlocker;
    }

    public void setAxeBlocker(int axeBlocker) {
        this.axeBlocker = axeBlocker;
    }
}
