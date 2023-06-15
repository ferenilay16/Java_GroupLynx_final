package week_4.Question3_removeDuplicates;

public class Antonio {

    public static String noDuplication(String str){
        String result = "";
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (result.contains(str.charAt(i)+"")){
                continue;
            }
            result+= str.charAt(i);
        }
        return result;
    }
}
