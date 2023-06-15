package week_4.question2_stringSameLetters;

public class zeynep {
    public static String removeDuplicates(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            if (!result.contains("" + each)) { // this condition does not accept char so we concated it to an emoty string for it to compile
                //If the string result does not contain the character of string str yet
                result += each; // then we will add the character to string result

            }
        }

        return result;
    }

    public static void main(String[] args) {
        String str = "AAABBBCCC";
        String result = removeDuplicates(str);
        System.out.println(result); // "abc"
    }












    /*
    String -- Remove Duplicates
Write a return method that can remove the duplicated values from String
Ex: removeDup("AAABBBCCC") ==> ABC

     */


}
