package com.bridgelabz.arrays;

public class PrintElements {
    public static void main(String[] args) {
        int[] arr = {15,5,16,17,18,11,9,10};
        toPrintElements(arr);
    }
    public static void toPrintElements(int[] arr){
        for (int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
