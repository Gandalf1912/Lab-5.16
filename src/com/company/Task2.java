package com.company;

public class Task2 {
    public static void main(String[] args) {
        int a, b;
        a = 3;
        b = 4;
        double S, P;
        S = 0.5 * a * b;
        P = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)) + a + b;
        System.out.println("Площа: " + S);
        System.out.println("Периметр: " + P);
    }
}
