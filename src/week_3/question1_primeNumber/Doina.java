package week_3.question1_primeNumber;

public class Doina {

    public static void main(String[] args) {

        int range = 100;

        boolean isPrime = true;

        for (int i = 2; i < range; i++) {
            //i is increasing number
            for (int j = 2; j < i; j++){
                //j is divisor & must be less than i, and increasing after each iteration

                if ((i % j) == 0){
                    isPrime = false;
                    break; // for loop of j
                }
            }
            if (isPrime){
                System.out.println(i + " is Prime");
            }
            isPrime = true;
        }

        }
    }

/*
Numbers -- PrimeNumber
    Write a method that can check if a number is prime or not
 */