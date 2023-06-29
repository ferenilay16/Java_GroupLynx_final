package week_6.Question2_findMax_IntArray;

public class Nilay {

    public static void maxNumber(int[] numbers) {

        int max = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("max number is= " + max);

    }

    public static void main(String[] args) {
        maxNumber(new int[]{20,30,-500,1230,75});
    }

}

/*
    Find Maximum:
  Write a method that can find the maximum number from an int Array.
     */
