package com.lab3;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AppTest {
    
    @Test
    public void testFactorialOfZero() {
        assertEquals(1, App.getFactorial(0));
    }

    @Test
    public void testFactorialOfFive() {
        // Факториал 5 должен быть 120 (1*2*3*4*5).
        // Но наш код из-за ошибки выдаст 24, и этот тест упадет!
        assertEquals(120, App.getFactorial(5));
    }
}
