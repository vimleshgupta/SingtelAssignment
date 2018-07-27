package com.singlte.assignment;

public abstract class Animal {

    void walk() {
        System.out.println("I am walking");
    }

    public void fly() {
        if (canFly()) {
            System.out.println("I am flying");
        }
    }

    public void sing() {
        if (canSing()) {
            System.out.println(getSound());
        }
    }

    public String getSound() {
        return "";
    }

    public boolean canFly() {
        return false;
    }

    public boolean canSing() {
        return getSound() != null && !getSound().isEmpty();
    }

    public boolean canSwim() {
        return false;
    }

}
