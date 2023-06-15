package week_2.question3_consecutiveNumbersCodility;

public class Serhat {
    public static void main(String[] args) {

        for (int num = 1; num < 101; num++) {
            if (num % 2 == 0) {
                System.out.println(num + " = codilidy");
            }
            if (num % 3 == 0) {
                System.out.println(num + " = Test");
            }
            if (num % 5 == 0) {
                System.out.println(num + " = Coders");
            }
            if (num % 2 == 0 & num % 3 == 0) {
                System.out.println(num + " = CodilityTest");
            }
            if (num % 2 == 0 & num % 3 == 0 & num % 5 == 0) {
                System.out.println(num + " = CodilityTestCoders");
            }
        }
    }
}