package week_6.Question3;

public class Antonio {

    public static int sumOfDigits(String str){

        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)){
                int digit = Character.getNumericValue(ch);
                sum += digit;
            }
        }
        return sum;
    }

}
