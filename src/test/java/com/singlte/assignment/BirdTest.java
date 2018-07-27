package com.singlte.assignment;

import org.junit.Test;

public class BirdTest {

    @Test
    public void bird_can_fly() {
        Bird bird = new Bird();
        bird.fly();
    }

    @Test
    public void bird_can_walk() {
        Bird bird = new Bird();
        bird.walk();
    }

    @Test
    public void bird_can_sing() {
        Bird bird = new Bird();
        bird.sing();
    }
}