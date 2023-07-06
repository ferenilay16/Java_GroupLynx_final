package week_7.Question2;

public class Medet {
    public static int[] sort(int[] array) {
        if (array == null || array.length <= 1) {
            return array; // Array is already sorted or empty
        }

        int[] sortedArray = array.clone(); // This line creates a copy of the array

        for (int i = 0; i < sortedArray.length - 1; i++) {
            for (int j = 0; j < sortedArray.length - i - 1; j++) {
                if (sortedArray[j] > sortedArray[j + 1]) {
                    // We gonna swap the elements if they are in the wrong order
                    int temp = sortedArray[j];
                    sortedArray[j] = sortedArray[j + 1];
                    sortedArray[j + 1] = temp;
                }
            }
        }
        return sortedArray;
    }

    public static void main(String[] args) {
        int[] numbers = {11, 25, 3, 5};
        int[] sortedNumbers = sort(numbers);

        System.out.print("Sorted array: ");
        for (int num : sortedNumbers) {
            System.out.print(num + " ");
        }
    }

}

/*
Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
Ex: int[] arr = {10, 9, 8, 7};
arr = Sort(arr); ==>{ 7, 8, 9, 10};
*/
