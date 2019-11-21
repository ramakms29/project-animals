package com.raki.animals.behaviours;

public class ChickenSound extends SoundBehaviour {
    @Override
    public String makeSound() {
        System.out.println("Cluck, cluck");
        return  "Cluck, cluck";
    }
    
}
