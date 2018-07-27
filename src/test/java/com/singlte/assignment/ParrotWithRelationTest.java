package com.singlte.assignment;

import org.junit.Test;

import static com.singlte.assignment.AnimalType.CAT;
import static com.singlte.assignment.AnimalType.DOG;
import static com.singlte.assignment.ChickenType.ROOSTER;
import static org.junit.Assert.*;

public class ParrotWithRelationTest {

    @Test
    public void parrot_living_with_dog_should_sound_like_dog() {
        ParrotWithRelation<Dog> parrot = new ParrotWithRelation<>(new Dog());
        assertEquals(DOG.sound, parrot.getSound());
    }

    @Test
    public void parrot_living_with_cat_should_sound_like_cat() {
        ParrotWithRelation<Cat> parrot = new ParrotWithRelation<>(new Cat());
        assertEquals(CAT.sound, parrot.getSound());
    }

    @Test
    public void parrot_living_near_the_rooster_should_sound_like_rooster() {
        ParrotWithRelation<Chicken> parrot = new ParrotWithRelation<>(new Chicken(ROOSTER));
        assertEquals(ROOSTER.sound, parrot.getSound());
    }
}