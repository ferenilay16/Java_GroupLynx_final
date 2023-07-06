package week_7.Question2;

public class Antonio {

    public static int[] sortASC(int[] arr) {
        // Perform selection sort
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            // Find the index of the minimum element in the remaining unsorted portion of the array
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the minimum element with the current element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}
