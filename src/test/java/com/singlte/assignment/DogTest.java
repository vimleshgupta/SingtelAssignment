package com.singlte.assignment;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class DogTest {
    @Test
    public void dog_can_sing_but_can_not_swim_and_fly() {
        Dog dog = new Dog();
        assertTrue(dog.canSing());
        assertFalse(dog.canFly());
        assertFalse(dog.canSwim());
    }
}