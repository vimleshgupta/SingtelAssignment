package com.singlte.assignment;

public enum AnimalType {

    DOG("Woof, woof"),
    CAT("Meow");

    String sound;

    AnimalType(String sound) {
        this.sound = sound;
    }
}
