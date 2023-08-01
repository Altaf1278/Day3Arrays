package com.bridgelabz.arrays;

public class FrequencyOfElements {

    public static void main(String[] args) {
        int[] arr = {5, 5, 5, 2, 3, 4, 1, 1, 99, 99, 11, 12, 13, 14, 15, 15};
        int[] frequencies = new int[arr.length];

        frequencyOfElements(arr, frequencies);
    }

    public static void frequencyOfElements(int[] arr, int[] frequencies) {
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            frequencies[i] = count;
        }

        for (int i = 0; i < frequencies.length; i++) {
            System.out.println("Element " + arr[i] + " occurs " + frequencies[i] + " times.");
        }
    }
}
