package com.beginner;

import java.util.Scanner;

public class LoopDoWhile {

    public static void main(String[] args) {

        int value = rnd(0,10);
        int printNum;

        System.out.println("Загадал случайное число от 0 до 10");
        System.out.println("Попробуй угадай");
        do {
            Scanner scanner = new Scanner(System.in);
            if(scanner.hasNextInt()){
                printNum = scanner.nextInt();
                } else {
                printNum = 11;
                System.out.println("Попробуй ещё раз, клоун..");
            }
            if (value!=printNum){
                System.out.println("Не угадал)");
            }
        } while (value!=printNum);

        System.out.println("Мои поздравления!");
    }

    public static int rnd(int min, int max){
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

}
