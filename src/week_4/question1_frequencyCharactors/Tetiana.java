package week_4.question1;

public class Tetiana {

    public static void main(String[] args) {

        String str = "AAABBCDD";
        String result = ""; //A3B2C1D2

        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j); // EACH CHARACTER FROM STRING
            int count = 0;

            for (int i = 0; i < str.length(); i++) { // TO FIND THE FREQUENCY OF EACH CHARACTER

                char each = str.charAt(i); //EACH CHARACTER OF STRING
                if (ch == each){
                    count++;
                }
            }

            if (result.contains(""+ch)){
                continue;
            }

            result += ch;
            result += count;

        }

        System.out.println(result);


    }


    /*
String -- Frequency of Characters
Write a return method that can find the frequency of
characters
Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */

}
