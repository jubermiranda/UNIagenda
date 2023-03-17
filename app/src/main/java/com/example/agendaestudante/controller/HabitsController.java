package com.example.agendaestudante.model;

import java.util.Date;
import java.util.Map;

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
