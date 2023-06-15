package week_2.question1_swapTwoWithoutThird;

public class Serhat {
    public static void main(String[] args) {

        int a = 30;
        int b = 50;


        a = a+ b; // 30+50 = 80
        b= a-b; // 80-50=30
        a = a - b; // 80-30 = 50

        System.out.println("----------------------------------");

        int x = 10;
        int y = 20;

        x = x*y; // 20*10 = 200
        y = x/y; //  200/20 = 10
        x = x/y; // 200/10 = 20

    }
}
