package week_8.Question2;

import java.util.Arrays;

public class Antonio {

    public static int[] moveZerosToEnd(int[] arr) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {  // move non-zero elements to the front
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }
        while (index < arr.length) {  // Fill the remaining positions with zeros
            arr[index] = 0;
            index++;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] nums= {4,0,5,0,0,7,6,0,8,6};
        System.out.println(Arrays.toString(moveZerosToEnd(nums)));
    }
}
