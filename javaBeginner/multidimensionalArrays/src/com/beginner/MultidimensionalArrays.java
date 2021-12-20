package com.beginner;

public class MultidimensionalArrays {

    public static void main(String[] args) {

        int[][] matrice = {{1,2,3},
                           {4,5,6},
                           {7,8,9}};
        for (int[] ints : matrice) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.print("\n");
        }
    }
}
