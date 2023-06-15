package week_3.question1_primeNumber;

public class Tetiana {

    public static void main(String[] args) {

        System.out.println(isPrime(97));

    }

    static boolean isPrime(int n){
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;

    }

}
