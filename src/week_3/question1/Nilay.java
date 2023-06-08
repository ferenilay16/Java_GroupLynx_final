package week_3.question1;

public class Nilay {
public static boolean isPrime(int num){
    if(num<=1)
        return false; // prime number should be greater than 1
    for (int i = 2; i < num; i++) {
        if (num % i == 0) // if a number is divisible by other than itself or 1 ; it is not odd number.Ex:when number is 9 --- loop together with if condition here says that check 9 divisible by (2,3,4,5,6,7,8) and if the remainder is 0, then the number is not odd number
            return false;
    }return true;

}
    public static void main(String[] args) {

        System.out.println(isPrime(11));
        System.out.println(isPrime(98));
        System.out.println(isPrime(23));
        System.out.println(isPrime(18));
    }

}

 /*

    Numbers -- PrimeNumber
    Write a method that can check if a number is prime or not

     */