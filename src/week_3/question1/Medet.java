package week_3.question1;

public class Medet {

    public static String isPrime(int number) {
        if (number <= 1) {
            return number + " is not prime";
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return number + " is not prime";
            }
        }
        return number + " is prime";

    }

    public static void main(String[] args) {
        System.out.println(isPrime(7));
        System.out.println(isPrime(8));
        System.out.println(isPrime(19));
        System.out.println(isPrime(112));
    }
}




/*
   Numbers -- PrimeNumber
    Write a method that can check if a number is prime or not
 */
