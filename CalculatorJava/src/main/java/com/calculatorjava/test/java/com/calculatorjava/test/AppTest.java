package com.calculatorjava.test;
import com.calculatorjava.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    @Test
    public void testAddition() {
        int result = Main.addition(5, 3);
        assertEquals(8, result);
    }

    @Test
    public void testSubtraction() {
        int result = Main.substraction(10, 4);
        assertEquals(6, result);
    }

    @Test
    public void testMultiply() {
        int result = Main.multiply(6, 7);
        assertEquals(42, result);
    }

    @Test
    public void testDivision() {
        int result = Main.division(12, 4);
        assertEquals(3, result);
    }

    @Test
    public void testModulus() {
        int result = Main.modulus(17, 5);
        assertEquals(2, result);
    }
}


