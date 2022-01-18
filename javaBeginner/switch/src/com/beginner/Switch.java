package com.beginner;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vozrast");
        if (scanner.hasNextInt()){
            int age = scanner.nextInt();
            switch (age){
                case 0 -> System.out.println("yo");
                case 7 -> System.out.println("Пошёл в школу");
                case 17 -> System.out.println("Пошёл в универ");
                case 21 -> System.out.println("Пошёл нахуй");
                default -> System.out.println("Ясна");
            }
        } else {
            System.out.println("Клоун");
        }
    }
}
