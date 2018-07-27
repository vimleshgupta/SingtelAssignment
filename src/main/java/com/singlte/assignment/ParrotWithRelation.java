package com.singlte.assignment;

public class ParrotWithRelation<T> extends Bird {

    private T related;

    public ParrotWithRelation(T related) {
        super(BirdType.PARROT);
        this.related = related;
    }

    @Override
    public String getSound() {
        if (related instanceof Animal)
            return ((Animal) related).getSound();
        else
            return super.getSound();
    }
}
