package week_3;

import java.util.Scanner;

public class primeNumber {

    public static void main(String[] args) {


        int temp;

        boolean isPrime = true;

        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        for (int i = 2; i <num ; i++) {

            temp=num %i;
            if (temp==0){
              isPrime = false;
            }

        }
if (isPrime){
    System.out.println(num + " is a prime number");
}else {
    System.out.println(num+ " is not a prime number");
}

    }

}
