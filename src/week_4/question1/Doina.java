package week_4.question1;

public class Doina {

    public static void main(String[] args) {

        String str = "AAABBCDD";
        String result = "";  // A3B2C1D2

        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j); // letter
            int count = 0;
            for (int i = 0; i < str.length(); i++) {

                if (str.charAt(i) == ch){
                    count++;
                }
            }
            if (result.contains("" + ch)){ //if the char is already included in the result
                continue; // skip that character
            }
            result += ch +""+ count;
        }
        System.out.println(result);

    }

}
/*
String -- Frequency of Characters
Write a return method that can find the frequency of
characters
Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */