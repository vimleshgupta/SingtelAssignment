package com.singlte.assignment;

public class Fish extends Animal {

    @Override
    public boolean canWalk() {
        return false;
    }

    @Override
    public boolean canSwim() {
        return true;
    }
}