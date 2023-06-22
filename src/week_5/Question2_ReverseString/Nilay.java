package week_5.Question2_ReverseString;

public class Nilay {
    public static String reverse (String str){
        String reverse ="";
        for (int i=str.length()-1;i>=0;i--){
            reverse +=(str.charAt(i));
        }

        return reverse;
    }

    public static void main(String[] args) {
        System.out.println(reverse("ABCD"));
    }

}

/*
    Write a return method that can reverse  String
Ex: Reverse("ABCD"); ==> DCBA
     */