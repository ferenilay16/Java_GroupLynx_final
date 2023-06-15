package week_3.question1_primeNumber;

public class Thi {

    public static String primeNumber(int num) {

        // a prime number can only be divided into a whole number by 1 and itself

        // num should be greater than 1, otherwise can't be prime
        if (num <= 1)
            return num + " is not prime";

        // for loop to iterate from 2 to num-1
        // if num can be divisible from 2 num-1 with remainder 0, then it's not prime
        for (int i = 2; i < num; i++) {
            if (num % i == 0)
                return num + " is not prime";
        }

        // otherwise it is prime (when num is divided by the iteration number it has 0 remainder)
        return num + " is prime";
    }


    public static void main(String[] args) {

        System.out.println(primeNumber(1));
        System.out.println(primeNumber(2)); //prime
        System.out.println(primeNumber(3)); //prime
        System.out.println(primeNumber(10));
        System.out.println(primeNumber(11)); //prime
        System.out.println(primeNumber(65));
        System.out.println(primeNumber(73)); //prime
        System.out.println(primeNumber(78));
        System.out.println(primeNumber(83)); //prime
        System.out.println(primeNumber(94));
        System.out.println(primeNumber(97)); //prime
    }

}
  /*

    Numbers -- PrimeNumber
    Write a method that can check if a number is prime or not

     */