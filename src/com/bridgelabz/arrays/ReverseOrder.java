package com.bridgelabz.arrays;

public class ReverseOrder {
    public static void toReverseElements(int[] arr){
        for (int i = arr.length-1; i>=0; i--){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int[] arr = {100,150,175,500,1423,458};
        toReverseElements(arr);
    }
}
