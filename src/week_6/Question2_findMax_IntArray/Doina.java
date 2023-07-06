package week_6.Question2_findMax_IntArray;

public class Doina {

    public static void maxNum(int[] numbers){

        int max = numbers[0]; // assume that first element is the maximum number

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) { // compares the element of the array with current maximum number
                max = numbers[i];
            }
        }
        System.out.println("max number is: " + max);
    }

    public static void main(String[] args) {
        maxNum(new int[] {100, 20, 85, 5, 350, -2000} );
    }

}
/*
    Find Maximum:
  Write a method that can find the maximum number from an int Array.
     */