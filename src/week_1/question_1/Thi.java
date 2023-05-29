package week_1.question_1;

public class Thi {

    // Method for identifying even or odd
    public static void identify(int number) {
        if (number % 2 != 0) {
            System.out.println(number + " is Odd");
        } else {
            System.out.println(number + " is Even");
        }
    }

    public static void main(String[] args) {
        identify(10); //10 is Even
        identify(11); //11 is Odd
        //test

    }


}
