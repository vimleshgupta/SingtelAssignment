package com.singlte.assignment;

import static com.singlte.assignment.Color.GREY;
import static com.singlte.assignment.Color.ORANGE;
import static com.singlte.assignment.FishType.DEFAULT;
import static com.singlte.assignment.Size.LARGE;
import static com.singlte.assignment.Size.SMALL;

public class Fish extends AbstractFish {

    private final FishType fishType;
    private final Size size;
    private final Color color;
    private final boolean eatsFish;
    private final boolean makesJokes;

    public Fish() {
        this.fishType = DEFAULT;
        this.size = DEFAULT.size;
        this.color = DEFAULT.color;
        this.eatsFish = DEFAULT.eatsFish;
        this.makesJokes = DEFAULT.makesJokes;
    }

    public Fish(FishType fishType) {
        this.fishType = fishType;
        this.size = fishType.size;
        this.color = fishType.color;
        this.eatsFish = fishType.eatsFish;
        this.makesJokes = fishType.makesJokes;
    }

    public Size getSize() {
        return size;
    }

    public Color getColor() {
        return color;
    }

    public boolean canEatFish() {
        return eatsFish;
    }

    public boolean canMakeJokes() {
        return makesJokes;
    }
}


enum FishType {
    DEFAULT(SMALL, GREY, false, false),
    SHARK(LARGE, GREY, true, false),
    CLOWNFISH(SMALL, ORANGE, false, true);

    Size size;
    Color color;
    boolean eatsFish;
    boolean makesJokes;

    FishType(Size size, Color color, boolean eatsFish, boolean makesJokes) {
        this.size = size;
        this.color = color;
        this.eatsFish = eatsFish;
        this.makesJokes = makesJokes;
    }
}

enum Size {
    SMALL, LARGE
}

enum Color {
    GREY, ORANGE
}