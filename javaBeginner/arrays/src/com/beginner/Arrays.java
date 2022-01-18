package com.beginner;

public class Arrays {

    public static void main(String[] args) {

        int number = 10;
        int[] numbers = new int[5];
            for (int i =0; i<numbers.length; i++){
            numbers[i] = i*number;
            }
        for (int k : numbers) {
            System.out.print(k + " ");
        }
        System.out.print("\n");
        int[] numbers1 = {1,2,3,4,5};
        for (int j : numbers1) {
            System.out.print(j + " ");
        }

    }
}
