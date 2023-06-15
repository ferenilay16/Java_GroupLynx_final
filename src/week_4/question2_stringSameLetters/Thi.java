package week_4.question2_stringSameLetters;

import java.util.Arrays;

public class Thi {

    public static Boolean sameLetters(String str1, String str2){
        // 1. create char array, to get each character of the string
        // 2. apply toLowerCase() since you are using char A =/= a
        char [] ch1 = str1.toLowerCase().toCharArray();
        char [] ch2 = str2.toLowerCase().toCharArray();

        //3. sort the arrays, otherwise it will return false if the character at index is not the same
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        //4. use Arrays utility equals() method to compare the strings
        return Arrays.equals(ch1, ch2);

    }


    public static void main(String[] args) {
        System.out.println(sameLetters("Abc","cab"));
    }

}
    /*
    String -- Same letters
Write a return method that check if a string is build out of the
same letters as another string.
Ex: same("abc", "cab"); -> true
same("abc", "abb"); -> false:
     */