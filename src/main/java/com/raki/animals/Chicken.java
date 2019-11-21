package com.raki.animals;

import com.raki.animals.behaviours.ChickenSound;
import com.raki.animals.behaviours.Flightless;

public class Chicken extends Bird{
    public Chicken() {
        this.soundBehaviour = new ChickenSound();
        this.flyBehaviour = new Flightless();
    }


}
