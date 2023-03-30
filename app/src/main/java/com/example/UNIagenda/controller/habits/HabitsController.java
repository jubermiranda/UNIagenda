package com.example.UNIagenda.controller.habits;

import android.media.MediaCodec;

import com.example.UNIagenda.model.Habit;

import java.util.ArrayList;

public class HabitsController {
    private ArrayList<Habit> habits;

    public HabitsController(){
        this.habits = new ArrayList<>();
    }

    public void addHabit(Habit habit) {
        this.habits.add(habit);
    }

    public ArrayList<Habit> getHabits() {
        return this.habits;
    }
}

