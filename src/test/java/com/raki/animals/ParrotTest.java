package com.raki.animals;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;

public class ParrotTest {

    @Test
    public void testSoundForParrotLivingWithDogs() throws Exception {
        Parrot parrot = new Parrot();
        parrot.setLiving(Living.WITH_DOGS);
        parrot.makeSound();
        List<String> activities = parrot.getActivities();
        assertThat(activities.get(0)).isEqualTo(Activities.MAKESOUND + ":" + Living.WITH_DOGS.makeSound());
    }
    
    @Test
    public void testSoundForParrotLivingWithCats() throws Exception {
        Parrot parrot = new Parrot();
        parrot.setLiving(Living.WITH_CATS);
        parrot.makeSound();
        List<String> activities = parrot.getActivities();
        assertThat(activities.get(0)).isEqualTo(Activities.MAKESOUND + ":" + Living.WITH_CATS.makeSound());
    }
    
    @Test
    public void testSoundForParrotLivingWithRooster() throws Exception {
        Parrot parrot = new Parrot();
        parrot.setLiving(Living.WITH_ROOSTER);
        parrot.makeSound();
        List<String> activities = parrot.getActivities();
        assertThat(activities.get(0)).isEqualTo(Activities.MAKESOUND + ":" + Living.WITH_ROOSTER.makeSound());
    }
    
    
    @Test
    public void testSoundForParrotWithDefault() throws Exception {
        Parrot parrot = new Parrot();
        parrot.makeSound();
        List<String> activities = parrot.getActivities();
        assertThat(activities.get(0)).isEqualTo(Activities.MAKESOUND + ":" + Living.DEFAULT.makeSound());
    }

}
