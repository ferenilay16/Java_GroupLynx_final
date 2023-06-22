package week_5.Question1_UniqueChars;

import java.util.Scanner;

public class serhat {

    public static String UniqueCharacters(String str) {
        String unique = "";

        for (int i = 0; i < str.length(); i++) { //
            char each = str.charAt(i);

            if (str.indexOf(each) == str.lastIndexOf(each)) {
                unique += each;
            }
        }

        return unique;

    }

    public static void main(String[] args) {
        String str = "ssseeeerrrhhat";
        String unique = UniqueCharacters(str);
        System.out.println(unique);
    }
}