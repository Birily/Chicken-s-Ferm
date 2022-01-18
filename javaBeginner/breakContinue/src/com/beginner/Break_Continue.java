package com.beginner;

public class Break_Continue {

    public static void main(String[] args) {

         for (int i = 0; i<20;i++){
            if(i%2==0){
                continue;
            }
            System.out.println("Это нечетное число "+i);
            if(i==15){
            break;
            }
        }
        System.out.println("Всё");

    }
}
