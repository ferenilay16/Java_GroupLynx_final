package week_8.Question1;

import java.util.Arrays;

public class Antonio {

    public static int[] sumUpToZero(int n) {
        int[] res = new int[n];
        for (int i = 0; i < res.length - 1; i++) {
            res[i++] = i;
            res[i] = -i;
        }
        return res;
    }

    public static int[] generateArray(int N) {
        int[] arr = new int[N];
        // generating N/2 negative and N/2 positive
        for (int i = 0; i < N / 2; i++) {
            arr[i] = -(i + 1);
            arr[i + N / 2] = i + 1;
        }
        return arr;
    }



    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumUpToZero(4)));
        System.out.println(Arrays.toString(generateArray(7)));
    }
}