package com.bridgelabz.arrays;

public class ElementsOfOddPosition {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 8, 9, 15, 14};
        toPrintElementOfOdd(arr);
    }

    public static void toPrintElementOfOdd(int[] arr) {
        for (int i = 0; i < arr.length; i += 2) {
            System.out.println(arr[i]);
        }

    }
}
