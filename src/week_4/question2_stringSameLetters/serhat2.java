package week_4.question2_stringSameLetters;

   /*
    String -- Same letters
Write a return method that check if a string is build out of the
same letters as another string.
Ex: same("abc", "cab"); -> true
same("abc", "abb"); -> false:
     */

import java.util.Arrays;
import java.util.Scanner;

public class serhat2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        boolean result = checkSameLetters(str1, str2);

        if (result) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    public static boolean checkSameLetters(String str1, String str2) {

        // Convert strings to char arrays and sort them
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Compare the sorted char arrays
        return Arrays.equals(arr1, arr2);
    }


    }



