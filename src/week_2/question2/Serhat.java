package week_2.question2;

public class Serhat {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            if (i % 3 ==0 & i % 5 ==0 & i % 15 ==0){
                System.out.print(" "+ i );
            }
        }
        System.out.println(" \n");

        for (int a = 1; a < 100; a++) {
            if (a % 3 == 0){
                System.out.print(" " + a);
            }
        }
        System.out.println("\n");

        for (int b = 1; b < 101; b++) {
            if (b %5 ==0 & b % 15!=0  ){
                System.out.print(" " + b);
            }

        }
    }
}
