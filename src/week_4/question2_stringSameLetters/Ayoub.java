package week_4.question2_stringSameLetters;

public class Ayoub {
    public static void main(String[] args) {
        same("abc", "cab");
        same("aic", "cab");
    }
        public static void same(String str1, String str2){
            int number =0;
            for (int i = 0; i < str1.length() ; i++) {

                if (str1.contains(str2.charAt(i)+"") && str1.length()==str2.length()){
                    number++;
                }
            }
            if(number ==str1.length() && number ==str2.length()){
                System.out.println(true);
            }else {
                System.out.println(false);
            }
        }


}
 /*
    String -- Same letters
Write a return method that check if a string is build out of the
same letters as another string.
Ex: same("abc", "cab"); -> true
same("abc", "abb"); -> false:
     */
