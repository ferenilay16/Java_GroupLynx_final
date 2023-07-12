package week_8.Question1;

import java.util.Arrays;
import java.util.Scanner;

public class Medet {

    public static int[] generateArray(int N) {
        int[] arr = new int[N];

        // We generate N-1 random integers between -N and N
        for (int i = 0; i < N - 1; i++) {
            arr[i] = (int) (Math.random() * (N + 1 - (-N))) + (-N);
        }

        // We calculate the last element to make the sum of the array equal to 0
        int sum = Arrays.stream(arr).sum();
        arr[N - 1] = -sum;

        return arr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();
        scanner.close();

        int[] arr = generateArray(N);
        System.out.println(Arrays.toString(arr));
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
