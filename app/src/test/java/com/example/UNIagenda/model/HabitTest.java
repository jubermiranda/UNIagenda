package com.example.UNIagenda.model;

import static org.junit.Assert.*;

import com.example.UNIagenda.Utils;

import org.junit.Before;
import org.junit.Test;

import java.util.Date;

public class HabitTest {
    private Habit habit;

    private String stdTestName = "habit test";
    private Frequency stdFrequency = Utils.genericFrequency();
    private Date stdCreatedAt = new Date();
    private Date stdEndsAt = new Date();


    @Before
    public void setUp() throws Exception {
        this.habit = new Habit();

    }

    @Test
    public void habitsObjectShouldNotBeNull(){
        assertNotNull(this.habit);

    }

    @Test
    public void tesAttrName() {

        this.habit.name = this.stdTestName;
        assertEquals("habit test", this.habit.name);
    }

    @Test
    public void tesAttrFrequency() {
        this.habit.frequency = this.stdFrequency;

        assertNotNull(this.habit.frequency);
        assertEquals(this.habit.frequency, this.stdFrequency);
    }

    @Test
    public void testAttrCreatedAt(){
        this.habit.createdAt = this.stdCreatedAt;
    };

    @Test
    public void testAttrEndsAt(){
        this.habit.endsAt = this.stdEndsAt;
    };




}