package week_5.Question1_UniqueChars;

public class Tetiana {

    public static void main(String[] args) {

        uniqueCharacter("AAABBBCCCDEF");

    }

    public static void uniqueCharacter(String str) {

        String unique = "";


        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j); // A
            int frequency = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ch) {
                    frequency++;
                }
            }

            if (frequency == 1) {
                unique += ch;
            }


        }

        System.out.println(unique);


    }
}
