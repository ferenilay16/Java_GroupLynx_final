package week_7.Question2;

import java.util.Arrays;
public class Ayoub {

    public static void newSortMethod(int[] arr){
        for (int j = 0; j <arr.length-1 ; j++) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {

                    int n = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = n;

                }

            }
        }

        System.out.println(Arrays.toString(arr));
    }


    public static void main(String[] args) {
        int[] list = {10, 91,0,2, 8, 7};
        newSortMethod(list);


    }
}
 /*
    Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
Ex: int[] arr = {10, 9, 8, 7};
arr = Sort(arr); ==>{ 7, 8, 9, 10};
     */