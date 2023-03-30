package com.example.UNIagenda;

import com.example.UNIagenda.model.Frequency;
import com.example.UNIagenda.model.Habit;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Utils {

    public static Habit genericHabit(){
        Habit genericHabit = new Habit();
        genericHabit.name = "habit test";
        genericHabit.frequency = Utils.genericFrequency();
        genericHabit.createdAt = new GregorianCalendar(2023, Calendar.MARCH, 01).getTime();
        genericHabit.endsAt = new GregorianCalendar(2023, Calendar.APRIL, 01).getTime();

        return genericHabit;
    }


    public static Frequency genericFrequency(){
        //TODO:("atualizar a frequencia com uma frequencia estática")
        return new Frequency();
    }

}
