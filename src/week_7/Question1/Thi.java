package week_7.Question1;

import java.util.Arrays;

public class Thi {

    public static int minNumArray(int[] arr){
        int min = 2147483647;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] example= {6,7,5,2,0,4,3,22,100};

        System.out.println(minNumArray(example));
    }


}
    /*
    Write a method that can find the minimum number from an int Array
     */