package week_5.Question2_ReverseString;

public class Mikhail
{
    public static void main(String[] args) {

            System.out.println(StReverse("AIDA"));
        }

        public static String StReverse (String str){
            String reverse = "";
            for (int i = str.length()-1; i>=0;i--)
                reverse+=str.toCharArray()[i];
            return reverse;
        }
    }
