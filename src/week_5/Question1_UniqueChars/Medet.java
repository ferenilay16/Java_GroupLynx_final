package week_5.Question1_UniqueChars;

public class Medet {
    public static String findUniqueCharacters(String input) {
        StringBuilder uniqueCharacters = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (input.indexOf(currentChar) == input.lastIndexOf(currentChar)) {
                uniqueCharacters.append(currentChar);
            }
        }

        return uniqueCharacters.toString();
    }

    public static void main(String[] args) {
        String input = "AAABBBCCCDEF";
        String unique = findUniqueCharacters(input);
        System.out.println(unique);  //Output: DEF
    }
}

 /*
    Write a return  method that can find the unique characters from the String
    Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";
*/
/*
The findUniqueCharacters method takes a string input and iterates over each character.
Then it checks whether the first occurrence index of the character is equal to the last occurrence index.
If they are the same, it means the character is unique in the string, so it appends the character to the
uniqueCharacters string.
At the end it returns the uniqueCharacters string.
 */

