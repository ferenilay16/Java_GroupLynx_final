package week_4.Question3;

public class Tetiana {


    public static void main(String[] args) {

        removeDuplicates("AAABBBCCC");

    }


    public static void removeDuplicates(String input){

        String result = "";
        for (int i = 0; i < input.length(); i++) {
            if (!result.contains((String.valueOf(input.charAt(i))))){
                result += String.valueOf(input.charAt(i));
            }
        }

        System.out.println(result);


    }


     /*String -- Remove Duplicates
    Write a return method that can remove the duplicated values from
    String
    Ex: removeDup("AAABBBCCC") ==> ABC

     */

}
