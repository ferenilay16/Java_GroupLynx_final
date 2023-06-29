package week_5.Question2_ReverseString;

public class Thi {

    public static String reverse(String str) {
        // declare this variable to contain all the characters of the given string in reverse order
        String reverse = "";

        // i: index number of the given string starting from last index to index 0
        for (int i = str.length() - 1; i >= 0; i--) {

            // use charAt() to get each character of the string starting from last index to index 0
            reverse += str.charAt(i);
        }
        return reverse;

    }
}
    /*
    Write a return method that can reverse  String
Ex: Reverse("ABCD"); ==> DCBA
     */