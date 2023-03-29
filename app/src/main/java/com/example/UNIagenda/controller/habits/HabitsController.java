package com.example.UNIagenda.controller.habits;

import com.example.UNIagenda.model.Habits;

public class HabitsController {
    private Habits habits;

    
    public HabitsController(){

    }

    private Integer getHabitsFrequencyFlag(String name){
        String value;
        switch(name){
            case "diário":
                return 1;

            case "semanal":
                return 2;

            case "mensal":
                return 3;

            case "anual":
                return 4;

        }
        return -1;
    }


}
