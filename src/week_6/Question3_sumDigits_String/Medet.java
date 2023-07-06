package week_6.Question3_sumDigits_String;

public class Medet {
    public static int sumOfDigits(String input) {
        int sum = 0;

        for (char ch : input.toCharArray()) {
            if (Character.isDigit(ch)) {
                int digit = Character.getNumericValue(ch);
                sum += digit;
            }
        }
        // For loop uses input.toCharArray() method to convert the input string into a character array.
        // This allows us to directly iterate over each character in the string.

        return sum;
    }

    public static void main(String[] args) {
        String input = "A5v24"; // Replace with your own input string
        int digitSum = sumOfDigits(input);
        System.out.println("The sum of the digits in the string is: " + digitSum);
    }
}



/*
  Sum of digits in a string:
  Write a method that can return the sum of the digits in a string.

  Ex: "A3v15" = > 3 + 1 + 5 = 9
        return 9
*/
