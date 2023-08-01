package com.bridgelabz.arrays;

public class ElementsOfEvenPosition {
    public static void main(String[] args) {
        int[] arr = {10, 20, 12, 13, 14, 15, 17, 5, 25};
        toPrintElementsOfEvenPosition(arr);
    }

    public static void toPrintElementsOfEvenPosition(int[] arr) {
        for (int i = 1; i < arr.length; i += 2) {
            System.out.println(arr[i]);
        }
    }
}
