package week_7.Question2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ayoub {
    public static void main(String[] args) {

        int[] arr = {10,7,5, 8, 7};
        int [] newArray =new int [3];
        int minNumber =2147483647;
        int maxNumber =-2147483647;

        for (int i = 0; i <arr.length; i++) {

            if(arr[i] >maxNumber){
                maxNumber=arr[i];
            }
            if(arr[i] <minNumber){
                minNumber=arr[i];
            }

        }
        System.out.println("maxNumber = " + maxNumber);
        System.out.println("minNumber = " + minNumber);





    }

}
 /*
    Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
Ex: int[] arr = {10, 9, 8, 7};
arr = Sort(arr); ==>{ 7, 8, 9, 10};
     */