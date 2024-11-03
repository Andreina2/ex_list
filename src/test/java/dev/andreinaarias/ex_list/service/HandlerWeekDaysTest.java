package dev.andreinaarias.ex_list.service;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

import org.junit.jupiter.api.Test;

public class HandlerWeekDaysTest {

    @Test
    void testCreateList() {
        HandlerWeekDays handlerWeekDays= new HandlerWeekDays(); //1 instancia
        //handlerWeekDays.createList();
        assertThat(handlerWeekDays.days.size(), is(7));
        
    }
}
