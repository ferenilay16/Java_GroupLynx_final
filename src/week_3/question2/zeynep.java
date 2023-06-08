package week_3.question2;

public class zeynep {

    public static int reverseNegativeNum(int n) {
        // Check if the number is negative
        if (n < 0) {
            // change the number to a positive value
            n = -n;

            int reversed = 0;
            while (n > 0) {
                int remainder = n % 10;
                reversed = reversed * 10 + remainder;
                n /= 10;
            }

            // Return the reversed integer as a negative number
            return -reversed;
        } else {
            // If the number is positive or zero, return it as is
            return n;
        }
    }

    public static void main(String[] args) {
        int num = -123;
        int reversedNum = reverseNegativeNum(num);
        System.out.println(reversedNum);  // Output: -321
    }
}









