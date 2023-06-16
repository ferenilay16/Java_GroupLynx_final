package week_4.question1_frequencyCharactors;

import javax.xml.stream.events.Characters;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Medet {

    public static String frequencyOfCharacters(String input) {
        // Create a HashMap to store the frequency of characters
        Map<Character, Integer> frequencyMap = new HashMap<>();

        // Iterate over each character in the input string
        for (char c : input.toCharArray()) {
            // Check if the character is already present in the map
            if (frequencyMap.containsKey(c)) {
                // If present, increment the count by 1
                frequencyMap.put(c, frequencyMap.get(c) + 1);
            } else {
                // If not present, add the character to the map with count as 1
                frequencyMap.put(c, 1);
            }
        }

        // Create a StringBuilder to construct the formatted result string
        StringBuilder result = new StringBuilder();

        // Iterate over the entries in the frequency map
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            char c = entry.getKey();
            int frequency = entry.getValue();
            result.append(c).append(frequency);
        }

        // Return the formatted result string
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        String frequencyString = frequencyOfCharacters(input);
        System.out.println(frequencyString);
    }
}

/*
String -- Frequency of Characters
Write a return method that can find the frequency of
characters
Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */
