package com.example.agendaestudante.model;

import static org.junit.Assert.*;

import org.junit.Before;

public class HabitsTest {
    private Habits habits;
    private String stdTestName = "habit test";
    private String getHabitsFrequencyFlag();

        

    @Before
    public void setUp() throws Exception {
        this.habits = new Habits();

    }

    @Test
    public void tesAttrName() {
        assertNotNull(this.habits);

        this.habits.name = this.stdTestName;
        assertEquals("habit test", this.habits.name)
    }

    @Test
    public void tesAttrFrequency() {


    }
    
}