package week_1.question_2_divideWithoutOperator;

import java.util.Scanner;

public class Medet {
    public static void main(String[] args) {
        int a, b, c, result = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first Number: ");
        a = scanner.nextInt();
        System.out.println("Enter second Number: ");
        b = scanner.nextInt();
        c = a + b;
        while (c > b) {
            c = c - b;
            result++;
        }
        System.out.println("Result is: " + result);
    }

}

/*
 Numbers - - Divide without / operator
Write a method that can divide two numbers without using division operator
 */
