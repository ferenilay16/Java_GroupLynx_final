package week_9.Question1;

import java.util.Arrays;

public class Antonio {

    // Concat two Arrays

        public static int[] twoArrays (int[]arr1, int[]arr2){

            int[] result = new int[arr1.length + arr2.length];

            for (int i = 0; i < arr1.length; i++) {
                result[i] = arr1[i];
            }
            for (int i = 0; i < arr2.length; i++) {
                result[arr1.length + i] = arr2[i];
            }
            return result;
        }

        public static void main(String[] args) {
            int[] first = {1,2,3};
            int[] second = {4,5,6};
            System.out.println(Arrays.toString(twoArrays(first, second)));
        }
}
