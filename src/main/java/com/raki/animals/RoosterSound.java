package com.raki.animals;

import com.raki.animals.behaviours.SoundBehaviour;

public class RoosterSound extends SoundBehaviour {

    @Override
    public String makeSound() {
        System.out.println("Cock-a-doodle-doo");
        return  "Cock-a-doodle-doo";
    }

}
