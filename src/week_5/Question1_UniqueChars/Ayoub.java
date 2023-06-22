package week_5.Question1_UniqueChars;

import jdk.jfr.Frequency;

public class Ayoub {
    public static void main(String[] args) {
        System.out.println("unique(\"AAABBBCCCDEF\") = " + unique("AAABBBCCCDEF"));

    }
    public static String unique( String str){
        String newWord = "";

        for (int j = 0; j < str.length(); j++) {
            int freq = 0;
            char firstChar = str.charAt(j);
            for (int i = 0; i < str.length(); i++) {
                char charAt = str.charAt(i);
                if (charAt == firstChar) {
                    freq++;
                }
            }
            if (freq == 1) {
                newWord += firstChar;
            }
        }
        return newWord;

    }

}
/*
    Write a return  method that can find the unique characters from the String
    Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";
     */