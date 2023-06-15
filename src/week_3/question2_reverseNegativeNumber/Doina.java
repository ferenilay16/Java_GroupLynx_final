package week_3.question2_reverseNegativeNumber;

public class Doina {

    public static void main(String[] args) {

        int number = -123;
        int reverse = 0;

        while (number < 0){
            reverse = reverse * 10;
            reverse = reverse + number % 10;
            number = number / 10;
        }
        System.out.println(reverse);

    }

}
/*
/*Numbers -- Reverse Negative Number
    Write a return method that can reverse digits of a negative number and
    return it as int
             input: -123  output: -321

     */
