package week_3.question2;

public class Antonio {

    public static int reverseInt(int number) {
        boolean isNegative = number < 0;
        if(isNegative){
            number = number * -1;
        }

        int reverse = 0;
        int lastDigit;
        while (number >= 1) {
            lastDigit = number % 10; // gives you last digit
            reverse = reverse * 10 + lastDigit;
            number = number / 10;  // get rid of last digit
        } return isNegative ? reverse*-1 : reverse;
    }

}
