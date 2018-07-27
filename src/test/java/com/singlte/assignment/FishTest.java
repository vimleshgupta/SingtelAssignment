package com.singlte.assignment;

import org.junit.Test;

import static com.singlte.assignment.Color.GREY;
import static com.singlte.assignment.Color.ORANGE;
import static com.singlte.assignment.FishType.CLOWNFISH;
import static com.singlte.assignment.FishType.SHARK;
import static com.singlte.assignment.Size.LARGE;
import static com.singlte.assignment.Size.SMALL;
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

    @Test
    public void shark_fish_are_large_and_grey() {
        Fish shark = new Fish(SHARK);
        assertFalse(shark.canFly());
        assertFalse(shark.canSing());
        assertFalse(shark.canWalk());
        assertTrue(shark.canSwim());
        assertEquals(LARGE, shark.getSize());
        assertEquals(GREY, shark.getColor());
        assertTrue(shark.canEatFish());
        assertFalse(shark.canMakeJokes());
    }

    @Test
    public void clown_fish_are_small_and_orange() {
        Fish clownFish = new Fish(CLOWNFISH);
        assertFalse(clownFish.canFly());
        assertFalse(clownFish.canSing());
        assertFalse(clownFish.canWalk());
        assertTrue(clownFish.canSwim());
        assertEquals(SMALL, clownFish.getSize());
        assertEquals(ORANGE, clownFish.getColor());
        assertFalse(clownFish.canEatFish());
        assertTrue(clownFish.canMakeJokes());
    }
}