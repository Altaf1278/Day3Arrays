package com.bridgelabz.arrays;

public class LargestElement {
    public static void main(String[] args) {
        int[] number = {10, 25, 35, 45, 50, 100};
        int max = number[0];
        for (int i = 1; i < number.length; i++) {
            if (number[i] > max) {
                max = number[i];
            }
        }
        System.out.println("The maximum element in the array is: " + max);
    }
}
