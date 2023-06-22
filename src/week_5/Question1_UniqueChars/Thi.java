package week_5.Question1_UniqueChars;

public class Thi {

    public static void uniqueCharacters(String str) {

        // create a variable to hold the unique characters
        String unique = "";

        // find frequency of character to see if it's equal to 1 (this means it will be unique)
        for (int j = 0; j < str.length(); j++) {
            // the following code needs to be inside a loop so it can check every index number
            // verify if first character of str to see if it's unique
            char ch = str.charAt(j);
            // index 0 is a, it will move to next character and if it's the same then it will add to the frequency value

            // default value so that it can be updated
            int frequency = 0;
            for (int i = 0; i < str.length(); i++) {
                // this will check char at i (as it changes and gets checked) to see if it is the same as ch
                if (str.charAt(i) == ch) {
                    frequency++;
                }
            }

            // this is outside of the loop
            // you could change frequency to account for tasks that ask for frequency of char
            // if frequency is 1 it means it's unique and the char will be added to the string unique
            if (frequency == 1) {
                unique += ch;
            }

        }

        System.out.println(unique);

    }


    public static void main(String[] args) {
        uniqueCharacters("AAABBBCCCDEF");
            //DEF

    }
}
    /*
    Write a return  method that can find the unique characters from the String
    Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";
     */