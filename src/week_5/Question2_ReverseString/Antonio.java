package week_5.Question2_ReverseString;

public class Antonio {

    public static String rev(String str){

        String result ="";
        for (int i = str.length()-1; i >=0 ; i--) {
            result+= str.charAt(i);
        }
        return  result;
    }

    public static void main(String[] args) {
        System.out.println(rev("emoclew"));

        StringBuilder reverseMe = new StringBuilder("emoclew");
        System.out.println(reverseMe.reverse());
    }
}
