package com.raki.animals;

public enum Living {
    
    DEFAULT("The Default Sound"), WITH_DOGS("Woof, woof"), WITH_CATS("Meow"), WITH_ROOSTER("Cock-a-doodle-doo");
   
    protected String sound;
    Living(String sound){
        this.sound = sound;
    }
    public String makeSound() {
        System.out.println(this.sound);
        return this.sound;
    }
}
