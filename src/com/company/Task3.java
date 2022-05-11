package com.company;

public class Task3 {
    public static void main(String[] args) {
        int a = (int)(Math.random() * 101);
        if(0 <= a && a < 10){
            System.out.println("В числі: " + a + " - 1 цифра!");
        }else if(10 <= a && a < 100){
            System.out.println("В числі: " + a + " - 2 цифри!");
        }else{
            System.out.println("В числі: " + a + " - 3 цифри!");
        }
    }
}
