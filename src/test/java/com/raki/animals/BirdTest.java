package com.raki.animals;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.CoreMatchers.any;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.raki.animals.behaviours.FlyBehaviour;
import com.raki.animals.behaviours.SingingBehaviour;

@RunWith(MockitoJUnitRunner.class)
public class BirdTest {
    @Mock
    private FlyBehaviour flyBehaviour;

    @Mock
    private SingingBehaviour singingBehaviour;
    @InjectMocks
    private Bird bird;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testFly() throws Exception {
        when(flyBehaviour.fly()).thenReturn("I am flying...");
        bird.fly();
        List<String> activities = bird.getActivities();
        assertThat(activities.get(0)).isEqualTo(Activities.FLY + ":" + "I am flying...");
    }

    @Test
    public void testSing() throws Exception {
        when(singingBehaviour.sing(anyString())).thenReturn("You dont impress me much");
        bird.sing("You dont impress me much");
        List<String> activities = bird.getActivities();
        assertThat(activities.get(0)).isEqualTo(Activities.SING + ":" + "You dont impress me much");
    }

}
