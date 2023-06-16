package week_4.question2_stringSameLetters;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Medet {
    public static boolean sameLetters(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        // Create a frequency map for characters in str1
        Map<Character, Integer> frequencyMap = new HashMap<>();

        // Calculate the frequency of characters in str1
        for (char c : str1.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        // Check if str2 has the same frequency of characters as str1
        for (char c : str2.toCharArray()) {
            if (!frequencyMap.containsKey(c) || frequencyMap.get(c) == 0) {
                return false;
            }
            frequencyMap.put(c, frequencyMap.get(c) - 1);
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        scanner.close();

        boolean result = sameLetters(str1, str2);
        System.out.println(result);
    }
}

/*
String -- Same letters
Write a return method that check if a string is build out of the
same letters as another string.
Ex: same("abc", "cab"); -> true
same("abc", "abb"); -> false:
*/
