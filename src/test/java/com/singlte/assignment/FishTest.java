package com.singlte.assignment;

import org.junit.Test;

import static org.junit.Assert.*;

public class FishTest {

    @Test
    public void fish_can_not_fly() {
        assertFalse(new Fish().canFly());
    }

    @Test
    public void fish_can_not_sing() {
        assertFalse(new Fish().canSing());
    }

    @Test
    public void fish_can_not_walk() {
        assertFalse(new Fish().canWalk());
    }

    @Test
    public void fish_can_swim() {
        assertTrue(new Fish().canSwim());
    }
}