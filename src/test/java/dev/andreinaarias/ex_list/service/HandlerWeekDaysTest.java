package dev.andreinaarias.ex_list.service;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class HandlerWeekDaysTest {

    @Test
    void testCreateList() {
        HandlerWeekDays handlerWeekDays= new HandlerWeekDays(); //1 instancia
        //handlerWeekDays.createList();
        assertThat(handlerWeekDays.days.size(), is(7));
        
    }

    @Test
    void testGetDays() {
        HandlerWeekDays handlerWeekDays= new HandlerWeekDays();
        assertThat(handlerWeekDays.getDays().get(0), is("Lunes"));
    }

    @Test
    void testGetSizeList() {
        HandlerWeekDays handlerWeekDays= new HandlerWeekDays();
        assertThat(handlerWeekDays.getSizeList(), is(7));
        
        List<String> days = handlerWeekDays.getDays();
        assertThat(days, contains("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"));
        
        
    }

    @Test
    void testDeleteDay() {
        HandlerWeekDays handlerWeekDays= new HandlerWeekDays();
        assertThat(handlerWeekDays.getDays(), contains("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"));
        assertTrue(handlerWeekDays.deleteDay("Lunes"));
        assertThat(handlerWeekDays.getDays().size(), is(6));
        assertThat(handlerWeekDays.getDays(), not(contains("Lunes")));
        System.out.println("Week Days: " + handlerWeekDays.getDays());
        
    }

    @Test
    void testGetSpecificDayByName() {
        HandlerWeekDays handlerWeekDays= new HandlerWeekDays();
        assertEquals("Martes",handlerWeekDays.getSpecificDayByName("Martes"));
        
    }

    @Test
    void testDayExist() {
        HandlerWeekDays handlerWeekDays= new HandlerWeekDays();
        assertFalse(handlerWeekDays.dayExist("Sunday"));
        assertTrue(handlerWeekDays.dayExist("Jueves"));
        
    }

    @Test
    void testSortByAlphabet() {
        HandlerWeekDays handlerWeekDays= new HandlerWeekDays();
        handlerWeekDays.sortByAlphabet();
        //System.out.println(handlerWeekDays.getDays());
        
    }

    @Test
    void testEmptyList() {
        HandlerWeekDays handlerWeekDays= new HandlerWeekDays();
        assertFalse(handlerWeekDays.getDays().isEmpty(), "La lista no debe estar vacía al principio");
        handlerWeekDays.emptyList();

        
    }
}
