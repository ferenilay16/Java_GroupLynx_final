package week_4.Question3;

public class Doina {

    public static void main(String[] args) {

            String str = "AAABBBCCC";
            String result = "";  //ABC

            for (int i = 0; i < str.length(); i++) {
                char each = str.charAt(i);

                if (!result.contains("" + each)) {
                    result += each;
                }
            }
        System.out.println(result);
        }
    }
/*String -- Remove Duplicates
    Write a return method that can remove the duplicated values from
    String
    Ex: removeDup("AAABBBCCC") ==> ABC

     */