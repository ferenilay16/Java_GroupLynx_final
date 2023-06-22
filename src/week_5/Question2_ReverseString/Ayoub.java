package week_5.Question2_ReverseString;

public class Ayoub {
    public static void main(String[] args) {
        System.out.println("reverse(\"ABCD\") = " + reverse("ABCD"));
    }
    public static String reverse(String str){
        String reverseWord="";
        for (int i =str.length()-1; i>=0 ; i--) {
            reverseWord+=str.charAt(i);
        }
        return reverseWord;
    }

}
 /*
    Write a return method that can reverse  String
Ex: Reverse("ABCD"); ==> DCBA
     */