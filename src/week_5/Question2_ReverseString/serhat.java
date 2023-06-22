package week_5.Question2_ReverseString;

public class serhat {
    public static void main(String[] args) {


        String str = "serhat";
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        System.out.println(reverse);

    }
    public static String reverse(String str) {

        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return reverse;

    }
}
