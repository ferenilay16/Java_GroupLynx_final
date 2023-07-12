package week_7.Question3;

import java.util.Arrays;

public class Medet {

    public static int[] sort(int[] desc_arr) {
        int n = desc_arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (desc_arr[j] < desc_arr[j + 1]) {
                    // Swap elements arr[j] and arr[j+1]
                    int temp = desc_arr[j];
                    desc_arr[j] = desc_arr[j + 1];
                    desc_arr[j + 1] = temp;
                }
            }
        }
        return desc_arr;
    }


    public static void main(String[] args) {
        int[] desc_arr = {10, 20, 7, 8, 90};
        desc_arr = sort(desc_arr);
        System.out.println(Arrays.toString(desc_arr));
    }


}

/*
Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
Ex: int[] arr = {10,20,7, 8, 90};
arr = Sort(arr); ==> {90, 20, 10, 8, 7};
*/
