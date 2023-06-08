package week_3.question2;

public class Tetiana {

    public static void reverse(int number){
        if(number < 10 && number > 0){
            System.out.println(number);
            return;
        } else if (number > 0) {
            System.out.println(number%10);
            reverse(number / 10);
        }else{
            System.out.println(number % 10);
            reverse((number / 10) * -1);
        }
    }

}
