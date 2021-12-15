package com.beginner;

public class If {

    public static void main(String[] args) {

        for (int i = 0;i<=10; i++){
            if(i==5){
                System.out.println(i+" equal 5");
            } else {
            if (i<5){
                System.out.println(i+" less than 5");
             } else {
                System.out.println(i+" more than 5");
               }
            }
        }
        System.out.println("It's a fact");
    }
}
