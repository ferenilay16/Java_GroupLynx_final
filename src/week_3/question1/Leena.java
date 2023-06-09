package week_3.question1;

public class Leena {
    /*

    Numbers -- PrimeNumber
    Write a method that can check if a number is prime or not

     */
    public static void main(String[] args) {
        checkNumber(4);

    }
    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }


    public static void checkNumber(int n){

        if(n>=2){
            String result= n+" is a prime number";
            for (int i=2;  i<n ; i++) {
                if(n%i==0){

                    result=n+" is Not a prime number";
                }
            }
            System.out.println(result);

        }



    }

}
