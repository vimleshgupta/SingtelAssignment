package com.singlte.assignment;

import static com.singlte.assignment.BirdType.DEFAULT;

public class Bird extends Animal {
    private final BirdType birdType;
    private boolean canFly;
    private boolean canSwim;
    private String sound;

    public Bird() {
        this.birdType = DEFAULT;
        this.canFly = DEFAULT.canFly;
        this.canSwim = DEFAULT.canSwim;
        this.sound = DEFAULT.sound;
    }

    public Bird(BirdType birdType) {
        this.birdType = birdType;
        this.canFly = birdType.canFly;
        this.canSwim = birdType.canSwim;
        this.sound = birdType.sound;
    }

    @Override
    public boolean canFly() {
        return canFly;
    }

    @Override
    public boolean canSing() {
        return sound != null && !sound.isEmpty();
    }

    @Override
    public boolean canSwim() {
        return canSwim;
    }

    @Override
    public String getSound() {
        return sound;
    }

    public BirdType getBirdType() {
        return birdType;
    }
}

enum BirdType {
    DEFAULT(true, false, "tweet"), DUCK(true, true, "Quack, quack"), CHICKEN(false, false, "Cluck, cluck");

    boolean canFly;
    boolean canSwim;
    String sound;

    BirdType(boolean canFly, boolean canSwim, String sound) {
        this.canFly = canFly;
        this.canSwim = canSwim;
        this.sound = sound;
    }
}