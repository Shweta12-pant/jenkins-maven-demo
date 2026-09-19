package com.example;

public class VulnerableApp {

    private final App app;

    public VulnerableApp() {
        this.app = new App();
    }

    public String processUser(String username, int age) {
        String greeting = app.greet(username);

        if (app.isAdult(age)) {
            return greeting + " You are an adult.";
        }

        return greeting + " You are a minor.";
    }

    public int calculateTotal(int price, int quantity) {
        if (price < 0 || quantity < 0) {
            throw new IllegalArgumentException(
                    "Price and quantity cannot be negative");
        }

        return price * quantity;
    }
}
