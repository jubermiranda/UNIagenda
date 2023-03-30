package com.example.UNIagenda.controller.habits;

import static org.junit.Assert.*;

import com.example.UNIagenda.Utils;
import com.example.UNIagenda.model.Habit;

import org.junit.Before;
import org.junit.Test;

public class HabitControllerTest {

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
    public void addHabitToController(){
        Habit habit = Utils.genericHabit();
        controller.addHabit(habit);
        assert

    }

}