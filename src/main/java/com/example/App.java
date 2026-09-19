package com.example;

public class App {

    public String greet(String name) {
        if (name == null || name.isBlank()) {
            return "Hello, Guest!";
        }
        return "Hello, " + name + "!";
    }

    public int add(int first, int second) {
        return first + second;
    }

    public int divide(int dividend, int divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException("Divisor cannot be zero");
        }
        return dividend / divisor;
    }

    public boolean isAdult(int age) {
        return age >= 18;
    }
}
