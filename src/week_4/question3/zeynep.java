package week_4.question3;

public class zeynep {
    /*
    Write a return method that can find the frequency of characters
Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
     */

        public static String frequencyOfCharacters(String str) {
            String result = "";

            //For each character, it counts the number of occurrences in the string using a nested loop

            for (int j = 0; j < str.length(); j++) {
                char ch = str.charAt(j);
                int count = 0;

            //if the character is already present in the result string, it continues to the next iteration

                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) == ch) {
                        count++;
                    }
                }

                if (result.contains(ch + "")) {
                    continue;
                }

                result += ch + "" + count;
            }

            return result;
        }

        public static void main(String[] args) {
            String str = "AAABBCDD";
            String result = frequencyOfCharacters(str);
            System.out.println(result); // "A3B2C1D2"
        }
    }

    //made changes



