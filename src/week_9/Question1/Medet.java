package week_9.Question1;

import java.util.Arrays;

public class Medet {
    public static int[] concatenateArrays(int[] arr1, int[] arr2) {
        int length1 = arr1.length;
        int length2 = arr2.length;

        // We create a new array with the combined length of two input arrays
        int[] combinedArray = new int[length1 + length2];

        // We copy elements from the 1st array to the combined array
        System.arraycopy(arr1, 0, combinedArray, 0, length1);

        // We copy elements from the second array to the combined array
        System.arraycopy(arr2, 0, combinedArray, length1, length2);

        return combinedArray;
    }

    public static void main(String[] args) {
        int[] array1 = {10, 20, 30};
        int[] array2 = {40, 50, 60};
        int[] concatenatedArray = concatenateArrays(array1, array2);
        System.out.println("Concatenated Array: " + Arrays.toString(concatenatedArray));
    }
}


/*
  Array - Concat two arrays
  Write a return method that can concatenate two arrays.
*/
