package com.example.UNIagenda.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import java.util.Date;

public class HabitsTest {
    private Habits habits;
    private String stdTestName = "habit test";
    private Frequency stdFrequency = this.generateFrequency();
    private Date stdCreatedAt = new Date();
    private Date stdEndsAt = new Date();


    @Before
    public void setUp() throws Exception {
        this.habits = new Habits();

    }

    @Test
    public void habitsObjectShouldNotBeNull(){
        assertNotNull(this.habits);

    }

    @Test
    public void tesAttrName() {

        this.habits.name = this.stdTestName;
        assertEquals("habit test", this.habits.name);
    }

    @Test
    public void tesAttrFrequency() {
        this.habits.frequency = this.stdFrequency;

        assertNotNull(this.habits.frequency);
        assertEquals(this.habits.frequency, this.stdFrequency);
    }

    @Test
    public void testAttrCreatedAt(){
        this.habits.createdAt = this.stdCreatedAt;
    };

    @Test
    public void testAttrEndsAt(){
        this.habits.endsAt = this.stdEndsAt;
    };

    private Frequency generateFrequency() {
        return new Frequency();
    }



}