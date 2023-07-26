package week_9.Question1;

import java.util.Arrays;

public class Nilay {

    /*
    arraycopy() method copies an array from the specified source array, beginning at the specified position, to the specified position of the destination array. A subsequence of array components are copied from the source array referenced by src to the destination array referenced by dest.
 */
    public static int[] concatenateArrays(int[] arr1, int[] arr2) {
    int length1 = arr1.length;
    int length2 = arr2.length;

    // New array with the combined length of two input arrays
    int[] resultArray = new int[length1 + length2];

    // Copy elements from the 1st array to the new array
    System.arraycopy(arr1, 0, resultArray, 0, length1);

    // Copy elements from the 2nd array to the new array
    System.arraycopy(arr2, 0, resultArray, length1, length2);

    return resultArray;
}

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        int[] concatenatedArray = concatenateArrays(arr1, arr2);
        System.out.println( Arrays.toString(concatenatedArray));
    }
}
