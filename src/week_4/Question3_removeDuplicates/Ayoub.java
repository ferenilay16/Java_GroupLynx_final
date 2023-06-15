package week_4.Question3_removeDuplicates;

public class Ayoub {
    public static void main(String[] args) {
        removeDup("AAABBBCCC");

    }

    public static void removeDup(String str) {
        String newWord = "";

        for (int i = 0; i < str.length(); i++) {
            if (!(newWord.contains(str.charAt(i) + ""))) {
                newWord += str.charAt(i);
            }
        }
        System.out.println(newWord);

    }

}
/*String -- Remove Duplicates
    Write a return method that can remove the duplicated values from
    String
    Ex: removeDup("AAABBBCCC") ==> ABC

     */