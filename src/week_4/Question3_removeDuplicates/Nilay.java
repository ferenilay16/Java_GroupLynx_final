package week_4.Question3_removeDuplicates;

public class Nilay {

    public static String RemoveDuplicate(String str) {

        String ExpectedResult = "";

        for (int i = 0; i < str.length(); i++) { // We iterate str in order to get each char of str

            char each = str.charAt(i); // each character of the str

            if (!ExpectedResult.contains("" + each)) { // if the Expected result does not contain  the character of  each char
                ExpectedResult += each; // then add this char to ExpectedResult

            }
        }
        return ExpectedResult;
    }

    public static void main(String[] args) {
        System.out.println(RemoveDuplicate("AAABBBCCC"));
    }

}

/*String -- Remove Duplicates
    Write a return method that can remove the duplicated values from
    String
    Ex: removeDup("AAABBBCCC") ==> ABC
      */
