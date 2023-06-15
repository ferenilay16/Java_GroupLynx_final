package week_1.question_2_divideWithoutOperator;

public class Ayoub {

    public static void division(int numerator, int denominator){
        int c;
        int result1=0;
        c = numerator + denominator;
        while (c > denominator) {
            c = c -denominator;
            result1++;
        }
        System.out.println("result1 = " + result1);
    }


    public static void main(String[] args) {
        division(40,4);
    }

}
/*

2. Numbers - - Divide without / operator
Write a method that can divide two numbers without using division operator
 */
