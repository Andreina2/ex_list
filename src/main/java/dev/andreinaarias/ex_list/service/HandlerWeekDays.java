package dev.andreinaarias.ex_list.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
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

    // Getter y Setter: modifican y recuperan los atributos de la clase :
    //Getter
    public List<String> getDays() {
        return days;
    }

    /*Setter
    public void setDays(List<String> days) {
    this.days = days;
    }*/

    public int getSizeList() {
        return getDays().size();
    }

    public boolean deleteDay(String day) {
        return days.remove(day);
    }

    public String getSpecificDayByName (String Day) {

        if (days.contains(Day)) {
            return Day;
        }
        
        
        else {
            return ("No se encuentra el día solicitado");
        }
    }

    public boolean dayExist(String Day){
        return days.contains(Day);
        
    }

    // Collections.sort : ordena una lista de elementos en orden ascendente
    public void sortByAlphabet() {
        Collections.sort(days);

    }

    public void emptyList() {
        days.clear();
    }


    // Scope de un método, Scope de una clase (lo Que esta dentro de la clase: dentro de las llaves)
    public void createList() {

        // 4 se ejecuta toda la logica
        days =  new ArrayList<String>();
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
