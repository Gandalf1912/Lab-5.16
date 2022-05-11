package com.company;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args){
        int s = 0;
        int prog[] = new int[3];
        int user[] = new int[3];

        for(int i = 0; i < prog.length; i++){
            prog[i] = 1 + (int) (Math.random() * 3);
        }
        System.out.println();
        while(s < 2) {
            for (int i = 0; i < user.length; i++) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Ведіть цифру(1-3): ");
                user[i] = sc.nextInt();
            }
            if (prog[0] == user[0] && prog[1] == user[1] && prog[2] == user[2]) {
                System.out.println("Ви виграли!");
                break;
            }
            s++;
            System.out.println();
            }
            if (prog[0] != user[0] || prog[1] != user[1] || prog[2] != user[2]) {
                System.out.println("Ви програли!");
                for(int i = 0; i < prog.length; i++){
                    System.out.print(prog[i]+" ");
            }
            System.out.println("- правильна комбінація");
        }
    }
}
