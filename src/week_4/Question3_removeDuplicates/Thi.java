package week_4.Question3_removeDuplicates;

public class Thi {

    public static String removeDuplicates1(String str){

        String result = "";

        // 1. iterate string with for loop and store in char "each"
        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            // 2. use if condition to not include characters that are already stored in each
            // 3. update "result" with characters from "each"
            if (!result.contains(""+each)){
                result += each;
            }
        }
        return result;

    }

    public static String removeDuplicates2(String str){

        String result = "";
        // 1. iterate string with for loop
        for (int i = 0; i < str.length(); i++) {
            // 2. if condition to check for duplicates
            // 3. skip if "result" contains the character already
            if (result.contains(""+str.charAt(i))){
                continue;
            }
            // 4. add iterated characters to "result"
            result += str.charAt(i);
        }
        return result;
    }



    public static void main(String[] args) {
        System.out.println(removeDuplicates1("AAABBBCCC"));
        System.out.println(removeDuplicates2("AAaaabbbbbBBcccccCCCccc"));
    }


}
 /*String -- Remove Duplicates
    Write a return method that can remove the duplicated values from
    String
    Ex: removeDup("AAABBBCCC") ==> ABC

     */