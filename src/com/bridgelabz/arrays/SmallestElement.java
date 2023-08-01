package com.bridgelabz.arrays;

public class SmallestElement {
    public static void main(String[] args) {
        int[] arr = {20,15,10,5,100};
        int min = arr[0];
        smallestElement(arr,min);
    }
    public static void smallestElement(int[] arr, int min){
        for (int i=0; i< arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("The smallest element of array is: " +min);
    }
}
