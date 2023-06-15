package week_1.question_3_finra;

public class Tetiana {

    public static void main(String[] args) {

        System.out.println(isOdd(6));
        System.out.println(isEven(100));

    }

    public static boolean isOdd(int number){

        if(number%2 != 0){
            return true;
        }else{
            return false;
        }
    }

    public static boolean isEven(int number){
        return !isOdd(number);
    }

}
