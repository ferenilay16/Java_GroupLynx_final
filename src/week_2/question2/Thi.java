package week_2.question2;

import java.util.ArrayList;
import java.util.Arrays;

public class Thi {

    public static void divisible() {

        // 1-3. create empty strings to hold the values for each category
        String divisibleBy15 = "",
                divisibleBy3 = "",
                divisibleBy5 = "";
        for (int i = 1; i <= 100; i++) { // 4. iterate all numbers from 1-100
            if (i % 3 == 0 && i % 5 == 0 && i % 15 == 0) { // 5. if divisible by 3, 5, AND 15...update string with number and add space after
                divisibleBy15 += i+" ";
            } else if (i % 3 == 0) { // 6. if only divisible by 3...update string with number and add space after
                divisibleBy3 += i+" ";
            } else if (i % 5 == 0) { // 7. if only divisible by 5...update string with number and add space after
               divisibleBy5 += i+" ";
            }
        }//for loop

        // 8-10. print updated strings, use trim() to exclude the space after last number
        System.out.println("divisibleBy15 = " + divisibleBy15.trim());
        System.out.println("divisibleBy3 = " + divisibleBy3.trim());
        System.out.println("divisibleBy5 = " + divisibleBy5.trim());
    }//method

    public static void main(String[] args) {
        divisible();

    }//main
}//class
 /*
    Numbers -- Divisible by 3, 5, 15

     Write a program that can print the numbers between 1 ~ 100 that can be divisible by 3, 5, and 15.
     if the number can be divisible by 3, 5 and 15, then it should only be displayed in DivisibelBy15' section
     if the number can be divisible by 3 but cannot be divisible by 15, then it should only be displayed in DivisibelBy3' section
     if the number can be divisible by 5 but cannot be divisible by 15, then it should only be displayed in DivisibelBy5' section

    ex:
    OutPut:
    Divisible By 15 15 30 45 60 75 90
    Divisible By 5 5 10 20 25 35 40 50 55 65 70 80 85 95 100
    Divisible By 3 3 6 9 12 18 21 24 27 33 36 39 42 48 51 54 57 63 66 69 72 78 81 84 87 93 96 99
     */