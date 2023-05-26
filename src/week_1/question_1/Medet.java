package week_1.question_1;

public class Medet {

    public static void identify(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is Even");
        } else {
            System.out.println(number + " is Odd");
        }
    }

    public static void main(String[] args) {
        identify(5);
        identify(8);
    }

}

/*
1. Numbers -- odd & even
Write a method which can identifies given number is even or odd

EX:
  identify(5) -> "Odd"
  identify(6) -> "Even"
 */
