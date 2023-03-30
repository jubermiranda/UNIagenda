package com.example.UNIagenda.controller.habits;

import static org.junit.Assert.*;

import com.example.UNIagenda.Utils;
import com.example.UNIagenda.model.Habit;

import org.junit.Before;
import org.junit.Test;

public class HabitsControllerTest {

    private HabitsController controller;

    @Before
    public void setUp() throws Exception {
        this.controller = new HabitsController();
    }


    @Test
    public void controllerShouldNotBeNull(){
        assertNotNull(this.controller);
    }


    @Test
    public void addFirstHabit(){
        Habit habit = Utils.genericHabit();
        int initialSize;
        int finalSize;

        initialSize = controller.getHabits().size();
        controller.addHabit(habit);
        finalSize = controller.getHabits().size();

        assertTrue(initialSize < finalSize);

    }


}