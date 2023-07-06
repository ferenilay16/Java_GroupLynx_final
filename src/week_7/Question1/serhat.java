package week_7.Question1;

public class serhat {
    public static void main(String[] args) {

        int[] numbers = {100, 20 , 500, 40, -10, 30};
        int min = numbers[0];

        for (int i = 0; i < numbers.length; i++) {// i : 1, 2 , 3,....
            if (numbers[i] < min){// compares the element of the array with maximum number

                min = numbers[i];// replace the current maximum number
            }
        }

        System.out.println("min = " + min);



    }

}

