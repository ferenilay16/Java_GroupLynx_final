package week_4;

public class serhat3 {
    public static void main(String[] args) {
        String str = "aaabbbcccc";

        String result = "";  //"abc"

        for (int i = 0; i < str.length(); i++) { // index numbers of str
            System.out.println(str.charAt(i));


            char each = str.charAt(i); // each character of the string str


            if (!result.contains("" + each)){ // if the string result does not contain  the character of string str yet
                result += each; // then we will add the character to string result
            }
// if the character is not contained yet in the new string, then we will add it to new string
        }

        System.out.print(result);
    }
}
