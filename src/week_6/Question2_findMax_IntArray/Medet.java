package week_6.Question2_findMax_IntArray;

public class Medet {
    public static int findMaxNumber(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("The array cannot be null or empty!!!");
        }

        int max = numbers[0];
        // We assume the first element is the maximum

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i]; // We update the maximum if a larger number is found
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] numbers = {10, 200, 1, 5, -10}; // We can check our array of numbers
        int maximum = findMaxNumber(numbers);
        System.out.println("The maximum number is: " + maximum);
    }
}


/*
  Find Maximum:
  Write a method that can find the maximum number from an int Array.
*/
