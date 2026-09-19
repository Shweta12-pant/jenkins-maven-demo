package com.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.security.MessageDigest;

public class VulnerableApp {

    private static final String ADMIN_PASSWORD = "DemoPass456";

    public static void searchUser(String username) {

        String query = "SELECT * FROM users WHERE name = '" + username + "'";

        System.out.println(query);
    }

    public static String displayName(String name) {
        return "<html><body>Hello " + name + "</body></html>";
    }

    public static String generateHash(String password) throws Exception {

        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] hash = md.digest(password.getBytes());

        return hash.toString();
    }

    public static int getAge(String input) {

        int age = Integer.parseInt(input);
        return age;
    }

    public static void executeCommand(String command)
            throws IOException {

        Runtime.getRuntime().exec(command);
    }

    public static String readData(String fileName) {

        try {

            BufferedReader reader =
                    new BufferedReader(new FileReader(fileName));

            return reader.readLine();

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }

    public static int[] createBuffer() {

        int[] values = new int[5];

        for (int i = 0; i < 10; i++) {
            values[i] = i;
        }

        return values;
    }

    public static void main(String[] args) throws Exception {

        System.out.println("Security Analysis Demo");

        searchUser("guest");

        System.out.println("Password: " + ADMIN_PASSWORD);
    }
}
