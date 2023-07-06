package week_7.Question3;

public class Antonio {


    public static int[] sortDESC(int[] arr) {
        // Perform selection sort
        for (int i = 0; i < arr.length - 1; i++) {
            int maxIndex = i;
            // Find the index of the maximum element in the remaining unsorted portion of the array
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }
            // Swap the maximum element with the current element
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}
