package week_2.question3;

public class Thi {

    public static void iterateReplace(int n) {
        if (n > 0) { // 1. number is positive
            for (int i = 1; i < n; i++) { // 2. iterate from 1 until the given number
                if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0) { // 3. if number is divisible by 2, 3, AND 5...replace
                    System.out.println("CodilityTestCoders");
                } else if (i % 2 == 0 && i % 5 == 0) { // 4. if number is divisible only by 2 AND 5...replace
                    System.out.println("CodilityCoders");
                } else if (i % 3 == 0 && i % 5 == 0) { // 5. if number is divisible only by 3 AND 5...replace
                    System.out.println("TestCoders");
                } else if (i % 2 == 0 && i % 3 == 0) { // 6. if number is divisible only by 2 AND 3...replace
                    System.out.println("CodilityTest");
                } else if (i % 2 == 0) { // 7. if number is only divisible by 2...replace
                    System.out.println("Codility");
                } else if (i % 3 == 0) { // 8. if number is only divisible by 3...replace
                    System.out.println("Test");
                } else if (i % 5 == 0) { // 9. if number is only divisible by 5...replace
                    System.out.println("Coders");
                } else { // 10. if number is false for all prior conditions...keep
                    System.out.println(i);
                }
            }//for loop
        }//if condition
    }//iterateReplace

    public static void main(String[] args) {
        iterateReplace(-20); // negative number, no iteration
        iterateReplace(20);
            /*
            1
            Codility
            Test
            Codility
            Coders
            CodilityTest
            7
            Codility
            Test
            CodilityCoders
            11
            CodilityTest
            13
            Codility
            TestCoders
            Codility
            17
            CodilityTest
            19
             */

    }//main

}//class
 /*
           Numbers -- print consecutive numbers

            Write a function that, given a positive integer N, prints the consecutive numbers from 1 to N, each on a separate line. However, any number divisible by 2, 3 or 5 should be replaced by the word Codility, Test or Coders respectively. If a number is divisible by more than one of the numbers: 2,3 or 5, it should be replaced by a concatenation of the respective words Codility, Test and Coders in this given order. For example, numbers divisible by both 2 and 3 should be replacée by CodilityTest and numbers divisible by all three numbers: 2,3 and 5, should be replaced by CodilityTestCoders.

            For example, here is the output for N = 24:
            1
            Codility
            Test
            Codility
            Coders
            CodilityTest
            7
            Codility
            Test
            Codi1ityCoders
            11
            CodilityTest
            13
            Codility
            TestCoders
            Codility
            17
            ....
   */