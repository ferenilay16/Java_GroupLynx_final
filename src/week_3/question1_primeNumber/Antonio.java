package week_3.question1_primeNumber;

public class Antonio {

    public static boolean isPrime(int num){
        if (num<=1)
            return false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

}
