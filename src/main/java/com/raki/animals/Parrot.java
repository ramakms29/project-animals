package com.raki.animals;

public class Parrot extends Bird {
    private Living living = Living.DEFAULT;

    @Override
    public void makeSound() {
        this.activities.add(Activities.MAKESOUND + ":" + living.makeSound());
        
    }
    
    public void setLiving(Living living) {
        this.living = living;
    }
    
}
