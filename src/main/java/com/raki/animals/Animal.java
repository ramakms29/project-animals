package com.raki.animals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.raki.animals.behaviours.WalkingBehaviour;

public class Animal {

    protected List<String> activities = new ArrayList<>();

    private WalkingBehaviour walkingBehaviour = new WalkingBehaviour();

    void walk() {
        this.activities.add(Activities.WALK + ":" + walkingBehaviour.walk());
    }

    public void setwalkingBehaviour(WalkingBehaviour walkingBehaviour) {
        this.walkingBehaviour = walkingBehaviour;
    }

    public List<String> getActivities() {
        return Collections.unmodifiableList(activities);
    }
}
