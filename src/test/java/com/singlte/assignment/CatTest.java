package com.singlte.assignment;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CatTest {
    @Test
    public void cat_can_sing_but_can_not_swim_and_fly() {
        Cat cat = new Cat();
        assertTrue(cat.canSing());
        assertFalse(cat.canFly());
        assertFalse(cat.canSwim());
    }
}