package dev.andreinaarias.ex_list.service;

import java.util.ArrayList;
import java.util.List;

public class HandlerWeekDays {

    //atributo de clase
    // 5 se le asigna el valor
    public List<String> days;

    // 2 constructor
    public HandlerWeekDays() {
        // 3 ejecuto el método
        createList();
    }

    public void createList() {

        //4 se ejecuta toda la logica
        days =  new ArrayList();
        days.add("Lunes");
        days.add("Martes");
        days.add("Miercoles");
        days.add("Jueves");
        days.add("Viernes");
        days.add("Sabado");
        days.add("Domingo");

    }

    //public void render() {
        //System.out.println(days);
    //}

}
