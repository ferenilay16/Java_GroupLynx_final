package week_6.Question2_findMax_IntArray;

import java.util.Arrays;

public class Thi {

    // Finds max number in an int array using for loop
    public static int maxNumberArray1(int[] arr){
        // declare int variable max with value 0
        int max = 0;

        // for loop to iterate through the array
        for (int i = 0; i < arr.length; i++) {
            // if the value of the element is greater than the current max
            if (arr[i]>max){
                // then update the max value to that element
                max=arr[i];
            }
        }
        return max;
    }

    //public static int maxNumberArray2(int[] arr){
    //use sort()
    //}

    public static void main(String[] args) {
        int[] arrTest = {3,100,5,2,40};
        System.out.println(maxNumberArray1(arrTest));


    }



}
    /*
    Find Maximum:
  Write a method that can find the maximum number from an int Array.
     */