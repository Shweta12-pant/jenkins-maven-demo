package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    private final App app = new App();

    @Test
    void testGreetWithName() {
        assertEquals("Hello, Shweta!", app.greet("Shweta"));
    }

    @Test
    void testGreetWithoutName() {
        assertEquals("Hello, Guest!", app.greet(""));
    }

    @Test
    void testAdd() {
        assertEquals(10, app.add(4, 6));
    }

    @Test
    void testDivide() {
        assertEquals(5, app.divide(10, 2));
    }

    @Test
    void testDivideByZero() {
        assertThrows(
                IllegalArgumentException.class,
                () -> app.divide(10, 0)
        );
    }

    @Test
    void testAdult() {
        assertTrue(app.isAdult(21));
        assertFalse(app.isAdult(15));
    }
}
