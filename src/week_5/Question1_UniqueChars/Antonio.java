package week_5.Question1_UniqueChars;

public class Antonio {

    public static String uniqChar(String str){
        String result = "";
        str = str.toLowerCase();
        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);
            int count = 0;
            for (int i =0; i< str.length(); i++){
                if (str.charAt(i) == ch ){
                    count++;
                }
            }
            if (count ==1){  // to avoid duplication
                result+= ch;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(uniqChar("gggeeejcccommmbyyy"));
    }
}
