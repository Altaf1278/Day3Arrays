package com.bridgelabz.arrays;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {10,15,35,48,20,45,40,50};
        toPrintLargestElement(arr);
    }
    public static void toPrintLargestElement(int[] arr){
        int max = Math.max(arr[0],arr[1]);
        int secondmax = Math.min(arr[0],arr[1]);
        for (int i=1; i<arr.length;i++){
            if (arr[i]>max){
                secondmax = max;
                max=arr[i];
                //If the condition in if statement is true,it means that the current element arr[i] is greater than
                // the current maximum value max, so we need to update the second maximum and maximum values.
            } else if (arr[i]>secondmax) {
                secondmax=arr[i];
            }
        }
        System.out.println("Second largest Element is: " +secondmax);
    }
}
