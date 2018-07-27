package com.singlte.assignment;

import static com.singlte.assignment.BirdType.DUCK;
import static com.singlte.assignment.ChickenType.HEN;
import static com.singlte.assignment.ChickenType.ROOSTER;
import static com.singlte.assignment.FishType.CLOWNFISH;
import static com.singlte.assignment.FishType.SHARK;
import static com.singlte.assignment.InsectType.BUTTERFLY;
import static com.singlte.assignment.InsectType.CATERPILLAR;

public class Solution {
    public static void main(String[] args) {
//        Bird bird = new Bird();
//        bird.walk();
//        bird.fly();
//        bird.sing();


        Animal[] animals = new Animal[]{
                new Bird(),
                new Bird(DUCK),
                new Chicken(HEN),
                new Chicken(ROOSTER),
                new ParrotWithRelation<>(new Dog()),
                new Fish(),
                new Fish(SHARK),
                new Fish(CLOWNFISH),
                new Dolphin(),
                new Dog(),
                new Insect(BUTTERFLY),
                new Insect(CATERPILLAR),
                new Cat()
        };
        int totalAnimalCanFly = 0;
        int totalAnimalCanWalk = 0;
        int totalAnimalCanSing = 0;
        int totalAnimalCanSwim = 0;
            for (Animal animal : animals) {
            totalAnimalCanFly += animal.canFly() ? 1 : 0;
            totalAnimalCanWalk += animal.canWalk() ? 1 : 0;
            totalAnimalCanSing += animal.canSing() ? 1 : 0;
            totalAnimalCanSwim += animal.canSwim() ? 1 : 0;
        }

        System.out.println("Total animals can fly: " + totalAnimalCanFly);
        System.out.println("Total animals can walk: " + totalAnimalCanWalk);
        System.out.println("Total animals can sing: " + totalAnimalCanSing);
        System.out.println("Total animals can swim: " + totalAnimalCanSwim);
    }
}
