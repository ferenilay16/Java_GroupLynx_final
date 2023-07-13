package week_8.Question1;

import java.util.Arrays;

public class AK_47 {

    static class Main
    {
        // Function to move all zeros present in the array to the end
        public static void reorder(int[] A)
        {
            // `k` stores the index of the next available position
            int k = 0;

            // do for each element
            for (int i: A)
            {
                // if the current element is non-zero, put the element at the
                // next free position in the array
                if (i != 0) {
                    A[k++] = i;
                }
            }

            // move all 0's to the end of the array (remaining indices)
            for (int i = k; i < A.length; i++) {
                A[i] = 0;
            }
        }

        public static void main(String[] args)
        {
            int[] A = { 6, 0, 8, 2, 3, 0, 4, 0, 1 };

            reorder(A);
            System.out.println(Arrays.toString(A));
        }
    }


    /*
    Array - N unique integers that sum up to 0
    Write a function that given an integer N (1 < N < 100), returns an array
    containing N unique integers that sum up to 0. The function can return any such array.
    For example, given N = 4, the function could return [1,0, -3,2] or [-2,1, -4,5].
    The answer [1, - 1,1,3] would be incorrect (because value 1 occurs twice).
    For N = 3 one of the possible answers is [-1,0,1] (but there are many more correct answers).
     */

}
