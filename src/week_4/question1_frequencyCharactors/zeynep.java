package week_4.question1_frequencyCharactors;

import java.util.Arrays;

public class zeynep {

    /*Write a return method that check if a string is build out of the same letters as another string.
    Ex: same("abc", "cab"); -> true
    ame("abc", "abb"); -> false:
     */


        public static boolean same(String string1, String string2) {


            // Convert the strings to character arrays
            char[] charArray1 = string1.toCharArray();
            char[] charArray2 = string2.toCharArray();

            // Sort the character arrays
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            // Compare the sorted character arrays
            return Arrays.equals(charArray1, charArray2);
        }

        public static void main(String[] args) {
            System.out.println(same("abc", "cab"));  // true
            System.out.println(same("abc", "abb"));  // false
        }
    }



