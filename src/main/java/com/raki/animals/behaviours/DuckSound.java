package com.raki.animals.behaviours;

public class DuckSound extends SoundBehaviour {
    @Override
    public String makeSound() {
        System.out.println("Quack, quack");
        return  "Quack, quack";
    }
    
}
