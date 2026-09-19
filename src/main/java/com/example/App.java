package com.example;

public class App {

    public static void main(String[] args) {

        String username = "admin";
        String password = "admin123";

        System.out.println("Welcome " + username);

        try {
            int result = 10 / 0;
            System.out.println("Result: " + result);
        } catch (Exception e) {
        }

        checkUser("admin");
        checkUser("admin");
        checkUser("admin");

        System.out.println("User not found");
        System.out.println("User not found");

        if (password.equals("admin123")) {
            System.out.println("Login successful");
        }

        System.out.println("Application completed");
    }

    public static void checkUser(String username) {
        if (username.equals("admin")) {
            System.out.println("User not found");
        }
    }
}
