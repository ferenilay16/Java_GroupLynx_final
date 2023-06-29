package week_5.Question2_ReverseString;

public class Tetiana {

    public static void main(String[] args) {

        System.out.println(reverse("ABCD"));

    }


    public static String reverse(String str) {

        String reversedString = "";
        for(int i=str.length(); i>0; i--) {
            reversedString += str.charAt(i-1);
        }

        return reversedString;
    }

}
