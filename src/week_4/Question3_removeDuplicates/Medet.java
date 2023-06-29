package week_4.Question3_removeDuplicates;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Medet {

    public static String removeDuplicates(String str) {
        // Create a Set to store unique characters in the order of their appearance
        Set<Character> uniqueChars = new LinkedHashSet<>();

        // Iterate over each character in the string
        for (char c : str.toCharArray()) {
            // Add the character to the Set
            uniqueChars.add(c);
        }

        // Construct the resulting string from the unique characters in the Set
        StringBuilder result = new StringBuilder();
        for (char c : uniqueChars) {
            result.append(c);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        scanner.close();

        String result = removeDuplicates(input);
        System.out.println("Result: " + result);
    }
}

/*String -- Remove Duplicates
Write a return method that can remove the duplicated values from String
Ex: removeDup("AAABBBCCC") ==> ABC
*/
