package com.singlte.assignment;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class DolphinTest {

    @Test
    public void dolphin_can_not_fly() {
        assertFalse(new Dolphin().canFly());
    }

    @Test
    public void dolphin_can_not_sing() {
        assertFalse(new Dolphin().canSing());
    }

    @Test
    public void dolphin_can_not_walk() {
        assertFalse(new Dolphin().canWalk());
    }

    @Test
    public void dolphin_can_swim() {
        assertTrue(new Dolphin().canSwim());
    }

}