package week_1.question_2;

import java.util.Scanner;

public class Serhat {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter  number");
        int num = input.nextInt();

        if (num >= 1 & num <= 30) {
            if (num % 3 == 0) {
                System.out.println("FIN");
            }
            if (num % 5 == 0) {
                System.out.println("RA");
            }
            if (num % 3 == 0 & num % 5 == 0) {
                System.out.println("FINRA");
            }
        }
    }
}