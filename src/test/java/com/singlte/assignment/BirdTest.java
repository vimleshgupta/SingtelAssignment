package com.singlte.assignment;

import org.junit.Test;

import static com.singlte.assignment.BirdType.CHICKEN;
import static com.singlte.assignment.BirdType.DUCK;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

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

    @Test
    public void duck_should_sing_fly_and_swim() {
        Bird bird = new Bird(DUCK);
        assertTrue(bird.canSing());
        assertTrue(bird.canFly());
        assertTrue(bird.canSwim());
    }

    @Test
    public void chicken_should_sing_not_fly_and_not_swim() {
        Bird bird = new Bird(CHICKEN);
        assertTrue(bird.canSing());
        assertFalse(bird.canFly());
        assertFalse(bird.canSwim());
    }
}