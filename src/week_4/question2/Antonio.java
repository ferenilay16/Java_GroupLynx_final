package week_4.question2;

import java.util.Arrays;

public class Antonio {

    public static Boolean compareStrings(String str1,String str2){
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        return Arrays.equals(chars1,chars2);
    }
}
