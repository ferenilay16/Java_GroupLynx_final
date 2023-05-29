package week_2.question1;

public class Antonio {

    public static void SwapNumbers(int a,int b){
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("--------");
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

}
