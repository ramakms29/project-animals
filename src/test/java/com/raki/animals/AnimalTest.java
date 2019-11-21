package com.raki.animals;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.raki.animals.behaviours.WalkingBehaviour;

@RunWith(MockitoJUnitRunner.class)
public class AnimalTest {

    @Mock
    WalkingBehaviour walkingBehaviour;
    @InjectMocks
    Animal animal;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testWalk() throws Exception {
        //when(two.generateMessage(anyString())).thenReturn("Changed Greeting");
        when(walkingBehaviour.walk()).thenReturn("I am walking");
        animal.walk();
        List<String> activities = animal.getActivities();
        assertThat(activities.size()).isEqualTo(1);
    }
}
