package week_4.question1_frequencyCharactors;

public class Thi {

    public static String frequencyOfCharacters(String str) {
        String result = "";

        // 5. create an outer loop and place statements under 1-4 within this loop
        for (int j = 0; j < str.length(); j++) {

            // 1. to get String result, we need to get the characters out AND their frequencies
            // 2. finding frequency of first character
            char ch = str.charAt(j); // 6. change this variable from i to j since it's now nested in the outer loop
            int count = 0;

            // 3. need to compare the first character to every other character to find its frequency
            // 4. create loop to get every character of str
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ch) {
                    count++;
                }
            }

            // 8. create if statement to exclude duplicates
            if (result.contains("" + ch)) { // checks if result already contains the ch
                continue; // skip that character
            }

            // 7. update String result
            result += ch + "" + count; // a2a2b1c3c3c3d1, includes duplicates
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(frequencyOfCharacters("AAABBCDD"));
    }


}
/*
String -- Frequency of Characters
Write a return method that can find the frequency of
characters
Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */