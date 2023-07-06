package week_7.Question2;

public class serhat {


    public static int[] sortArray(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 3, 1};
        int[] sortedArray = sortArray(numbers);

        // Print the sorted array
        for (int num : sortedArray) {
            System.out.print(num + " ");
        }
    }
}
