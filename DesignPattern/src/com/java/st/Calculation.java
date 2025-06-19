package com.java.st;

class Calculation {
    // Step 1: Create a private static instance of the class
    private static Calculation instance = null;

    // Step 2: Make the constructor private so this class cannot be instantiated from outside
    private Calculation() {}

    // Step 3: Provide a public static method to get the instance
    public static Calculation getInstance() {
        if (instance == null) {
            instance = new Calculation();
        }
        return instance;
    }

    public int sum(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int multi(int a, int b) {
        return a * b;
    }
}

