package week_5.Question2_ReverseString;

public class Medet {
    public static String reverseString(String input) {
        StringBuilder reversedStr = new StringBuilder();

        for (int i = input.length() - 1; i >= 0; i--) {
            reversedStr.append(input.charAt(i));
        }

        return reversedStr.toString();
    }

    public static void main(String[] args) {
        String input = "ABCDEF";
        String reversed = reverseString(input);
        System.out.println(reversed);  // Output:FEDCBA
    }

}

/*
Write a return method that can reverse  String
Ex: Reverse("ABCD"); ==> DCBA
*/
/*
The reverseString method takes a string input and iterates over each character from the end of the string to the
beginning.
It appends each character to the reversedStr StringBuilder, effectively reversing the order of the characters.
At the end it returns the reversed string by converting the StringBuilder back to a string using the toString method.
 */
