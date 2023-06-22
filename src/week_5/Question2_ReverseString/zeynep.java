package week_5.Question2_ReverseString;

public class zeynep {

    /*
    Write a return method that can reverse  String
Ex: Reverse("ABCD"); ==> DCBA;
     */

    public static String reverse(String str){
        String reverse = ""; // to contain all the characters of the given string in reversed order

        for (int i = str.length()-1 ; i >= 0; i--) { // i: index number of the given string starting from last index to index 0
            reverse += str.charAt(i); // to get each character of the string starting from last index to index zero

        }

        return reverse;
    }

    public static void main(String[] args) {
        String str = "ABCD";
        String reverse = reverse(str);
        System.out.println(reverse);
    }

}
