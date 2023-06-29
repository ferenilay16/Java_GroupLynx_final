package week_3.question2_reverseNegativeNumber;

import java.util.Scanner;

public class Medet {
    public static int reverseNegativeNumber(int number) {
        int reversed = 0;
        boolean isNegative = false;

        if (number < 0) { // Convert negative number to positive number in order to reverse
            isNegative = true;
            number = -number;
        }

        while (number > 0) {
            int digit = number % 10; // Get the last digit
            reversed = reversed * 10 + digit; // Add the digit to the reversed number
            number /= 10; // Remove the last digit from the original number
        }

        return isNegative ? -reversed : reversed; // Restore the negative sign if needed
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int reversed = reverseNegativeNumber(number);
        System.out.println("Reversed number: " + reversed);
    }
}

 /*Numbers -- Reverse Negative Number
    Write a return method that can reverse digits of a negative number and return it as int
    input: -123  output: -321

     */
