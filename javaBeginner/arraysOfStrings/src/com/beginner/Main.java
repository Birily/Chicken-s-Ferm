package com.beginner;

public class Main {

    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5,6,7,8};
        int sum = 0;
        for (int number : numbers){
            sum = sum+number;
            System.out.print(number+" ");
        }
        System.out.println("\n"+sum);

        String[] strings = new String[3];
        strings[0] = "Hi";
        strings[1] = "Bye";
        strings[2] = "Java";
        for (String string : strings){
            System.out.println(string);
        }

    }
}
