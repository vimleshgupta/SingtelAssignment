package com.singlte.assignment;

import org.junit.Test;

import static com.singlte.assignment.ChickenType.HEN;
import static com.singlte.assignment.ChickenType.ROOSTER;
import static org.junit.Assert.*;

public class ChickenTest {

    @Test
    public void chicken_rooster_should_sing_not_fly_and_not_swim() {
        Chicken chicken = new Chicken(ROOSTER);
        assertTrue(chicken.canSing());
        assertFalse(chicken.canFly());
        assertFalse(chicken.canSwim());
        assertEquals("Cock-a-doodle-doo", chicken.getSound());
    }

    @Test
    public void chicken_hen_should_sing_not_fly_and_not_swim() {
        Chicken chicken = new Chicken(HEN);
        assertTrue(chicken.canSing());
        assertFalse(chicken.canFly());
        assertFalse(chicken.canSwim());
        assertEquals("Cluck, cluck", chicken.getSound());
    }
}