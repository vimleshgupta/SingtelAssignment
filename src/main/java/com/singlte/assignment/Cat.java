package com.singlte.assignment;

public class Cat extends Animal {

    private final AnimalType animalType = AnimalType.CAT;
    private final String sound;

    public Cat() {
        this.sound = animalType.sound;
    }

    @Override
    public String getSound() {
        return sound;
    }
}
