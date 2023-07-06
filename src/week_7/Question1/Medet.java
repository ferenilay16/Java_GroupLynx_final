package week_7.Question1;

public class Medet {
    public static int findMinNum(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("The array is empty or null.");
        }

        int min = array[0]; // We assume that the first element is the minimum

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i]; // We update the minimum if a smaller element is found
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] numbers = {10, 1, 100, 23, 5, 44};
        int minimum = findMinNum(numbers);
        System.out.println("The minimum number is: " + minimum);
    }

}

/*
    Write a method that can find the minimum number from an int Array
*/
