package com.raki.animals;

import com.raki.animals.behaviours.FlyBehaviour;
import com.raki.animals.behaviours.SingingBehaviour;

public class Bird extends Animal {

    protected FlyBehaviour flyBehaviour = new FlyBehaviour();
    protected SingingBehaviour singingBehaviour = new SingingBehaviour();

    public Bird() {

    }

    public Bird(FlyBehaviour flyBehaviour, SingingBehaviour singingBehaviour) {
        this.flyBehaviour = flyBehaviour;
        this.singingBehaviour = singingBehaviour;
    }

    public void fly() {
        this.activities.add(Activities.FLY + ":" + this.flyBehaviour.fly());
    }

    public void sing(String song) {
        this.activities.add(Activities.SING + ":" + this.singingBehaviour.sing(song));
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setSingingBehaviour(SingingBehaviour singingBehaviour) {
        this.singingBehaviour = singingBehaviour;
    }

}
