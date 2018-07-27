package com.singlte.assignment;

import static com.singlte.assignment.BirdType.CHICKEN;

public class Chicken extends Bird {

    private final ChickenType chickenType;

    public Chicken(ChickenType chickenType) {
        super(CHICKEN);
        this.chickenType = chickenType;
        this.sound = chickenType.sound;
    }

    public ChickenType getChickenType() {
        return chickenType;
    }
}

enum ChickenType {
    ROOSTER("Cock-a-doodle-doo"), HEN("Cluck, cluck");

    String sound;

    ChickenType(String sound) {
        this.sound = sound;
    }
}
