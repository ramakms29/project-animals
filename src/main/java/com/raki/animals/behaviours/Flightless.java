package com.raki.animals.behaviours;

public class Flightless extends FlyBehaviour {

    @Override
    public String fly() {
        System.out.println("Sorry, I can not fly :(");
        return "Sorry, I can not fly :(";
    }
    
}
