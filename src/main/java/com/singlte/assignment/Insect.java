package com.singlte.assignment;

public class Insect extends Animal {

    private final InsectType insectType;
    private final boolean canFly;
    private final boolean canWalk;

    public Insect(InsectType insectType) {
        this.insectType = insectType;
        this.canFly = insectType.canFly;
        this.canWalk = insectType.canWalk;
    }

    @Override
    public boolean canFly() {
        return this.canFly;
    }

    @Override
    public boolean canWalk() {
        return this.canWalk;
    }
}

enum InsectType {
    BUTTERFLY(true, true);

    boolean canFly;
    boolean canWalk;

    InsectType(boolean canFly, boolean canWalk) {
        this.canFly = canFly;
        this.canWalk = canWalk;
    }
}