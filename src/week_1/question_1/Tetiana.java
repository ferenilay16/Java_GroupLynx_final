package week_1.question_1;

public class Tetiana {

    public static void main(String[] args) {

        System.out.println(division(40,5));

    }

    public static int division(int dividend, int divisor){

        if(dividend == 0){
            return 0;
        }else if(divisor == 0){
            System.out.println("Cannot divide by 0, check Math rules please");
            System.exit(1);
        }

        int x = Math.abs(dividend);
        int y = Math.abs(divisor);
        int sign = 1;

        int count = 0;

        while (x >= y){
            x = x - y;
            count++;
        }
        if( (dividend < 0 && divisor > 0) || (dividend > 0 && divisor < 0)){
            sign = -1;
        }
        return count*sign;
    }

}
