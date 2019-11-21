package com.raki.animals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.raki.animals.behaviours.SoundBehaviour;
import com.raki.animals.behaviours.WalkingBehaviour;

public class Animal {

    protected List<String> activities = new ArrayList<>();

    protected WalkingBehaviour walkingBehaviour = new WalkingBehaviour();
    protected SoundBehaviour soundBehaviour = new SoundBehaviour();

    public void walk() {
        this.activities.add(Activities.WALK + ":" + walkingBehaviour.walk());
    }
    
    public void makeSound() {
        this.activities.add(this.soundBehaviour.makeSound());
    }

    public void setWalkingBehaviour(WalkingBehaviour walkingBehaviour) {
        this.walkingBehaviour = walkingBehaviour;
    }
    
    public void setSoundlkingBehaviour(WalkingBehaviour walkingBehaviour) {
        this.walkingBehaviour = walkingBehaviour;
    }

    public List<String> getActivities() {
        return Collections.unmodifiableList(activities);
    }
}
