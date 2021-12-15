package com.beginner;

import java.util.Scanner;

public class Input {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Write some number..");

        if (s.hasNextInt()){
            int x = s.nextInt();
            System.out.println(x);
        } else {
            System.out.println("Nixuya ti clown");
        }
    }

}
