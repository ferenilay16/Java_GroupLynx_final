package week_1.question_1_evenOrOdd;

public class Ayoub {
    public static void main(String[] args) {

        identify(10);
    }

   public static void identify(int number){
        if(number%2==0 && number!=0){
            System.out.println(number+" number is even ");
        }else if(number%2!=0){
            System.out.println( number+ " number is odd ");
       }else {
            System.out.println("Number is equal "+number);
        }
   }


}
 /*
    1. Numbers -- odd & even
Write a method which can identifies given number is even or odd

     */
