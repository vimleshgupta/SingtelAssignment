package com.singlte.assignment;

import org.junit.Test;

import static com.singlte.assignment.InsectType.BUTTERFLY;
import static com.singlte.assignment.InsectType.CATERPILLAR;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class InsectTest {
    @Test
    public void butterfly_can_fly_walk_and_can_not_sound() {
        Insect butterfly = new Insect(BUTTERFLY);
        assertTrue(butterfly.canFly());
        assertTrue(butterfly.canWalk());
        assertFalse(butterfly.canSing());
        assertFalse(butterfly.canSwim());
    }

    @Test
    public void butterfly_can_not_fly_but_can_walk() {
        Insect caterpillar = new Insect(CATERPILLAR);
        assertFalse(caterpillar.canFly());
        assertTrue(caterpillar.canWalk());
        assertFalse(caterpillar.canSing());
        assertFalse(caterpillar.canSwim());
    }

}