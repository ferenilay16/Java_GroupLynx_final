package week_3.question2;

public class Nilay {
    public static int reverseInteger(int number) {
        boolean isNegative = number<0;
        if (isNegative) {
            number = number * -1;
        }
        int reverse = 0;
        int lastDigit = 0;
        while (number >= 1) {
            lastDigit = number % 10; // gives us last digit
            reverse = reverse * 10 + lastDigit;
            number = number / 10; // get rid of last digit

        }

        return isNegative == true ? reverse * -1 : reverse;
    }

    public static void main(String[] args) {
        System.out.println(reverseInteger(-1234));
    }
}

/*Numbers -- Reverse Negative Number
    Write a return method that can reverse digits of a negative number and return it as int
    input: -123  output: -321

     */

// Iteration 1:
//number = 1234
//remainder = 1234 % 10 = 4
//reverse = 0 * 10 + 4 = 0 +4=4
//number = 1234 / 10 = 123

//Iteration 2:

//number = 123
//remainder = 123 % 10 = 3
//reverse = 4 * 10 + 3 = 40 + 3 = 43
//number = 123 / 10 = 12

//Iteration 3:

//number = 12
//remainder = 12 % 10 = 2
//reverse = 43 * 10 + 2 = 430 + 2 = 432
//number = 12 / 10 = 1

//Iteration 4:
//number = 1
//remainder = 1 % 10 = 1
//reverse = 432 * 10 + 1 = 4320 + 1 = 4321
//number = 1 / 10 = 0

