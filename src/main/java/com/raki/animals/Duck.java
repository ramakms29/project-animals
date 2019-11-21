package com.raki.animals;

import com.raki.animals.behaviours.DuckSound;

public class Duck extends Bird implements Swimmer{
    public Duck() {
        this.soundBehaviour = new DuckSound();
    }

    @Override
    public String swim() {
        System.out.println("Duck Swimming");
        return "Duck Swimming" ;
    }
}
