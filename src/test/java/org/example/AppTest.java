package org.example;

import org.example.models.Student;
import org.junit.gen5.api.BeforeEach;
import org.junit.gen5.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    @BeforeEach
    public void init() {
        Student student = new Student();
    }

    @Test
    public void shouldReturnFalseWhenHourNotInHoursRange() {

    }
}
