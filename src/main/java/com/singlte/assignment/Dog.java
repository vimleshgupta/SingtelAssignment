package com.singlte.assignment;

public class Dog extends Animal {

    private final AnimalType animalType = AnimalType.DOG;
    private final String sound;

    public Dog() {
        this.sound = animalType.sound;
    }

    @Override
    public String getSound() {
        return sound;
    }
}
