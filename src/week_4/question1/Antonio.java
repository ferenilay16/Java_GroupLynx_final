package week_4.question1;

public class Antonio {

    public static String freqChar(String str){
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
            if (result.contains(ch+"")){  // to avoid duplication
                continue;
            }
            result+= ch+ "" +count+ " ";
        }
        return result;
    }
}
