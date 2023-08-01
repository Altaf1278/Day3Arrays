package com.bridgelabz.arrays;

import java.util.Arrays;

public class SortingElements {
    public static void main(String[] args) {
     int[] arr = {10,20,11,16,17,15,12,13,14,19,18};
     SortingElements sortingElements = new SortingElements();
     sortingElements.toSortArrayElements(arr);
    }
    public void toSortArrayElements(int[] arr){
        Arrays.sort(arr);
        for (int i=0; i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }

}
