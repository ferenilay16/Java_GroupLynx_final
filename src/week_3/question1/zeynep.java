package week_3.question1;

public class zeynep {
    public static boolean isPrime(int n) { //whole number that is greater than 1
        if (n <= 1) {
            return false;
        }


        //if number is divisible by any other number than itself it is not prime
        for (int i = 2; i <= n; i++) { //n has to be divisible by itself only
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int number = 9;
        if (isPrime(number)) {
            System.out.println(number + " is prime.");
        } else {
            System.out.println(number + " is not prime.");
        }
    }
}
