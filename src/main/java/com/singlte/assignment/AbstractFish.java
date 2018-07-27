package com.singlte.assignment;

public abstract class AbstractFish extends Animal{

    @Override
    public boolean canWalk() {
        return false;
    }

    @Override
    public boolean canSwim() {
        return true;
    }
}
