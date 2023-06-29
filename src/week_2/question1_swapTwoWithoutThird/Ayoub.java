package week_2.question1_swapTwoWithoutThird;

public class Ayoub {
    public static void main(String[] args) {
     swap(155555,-85);


    }

    public static void swap(int a, int b){
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a = " + a);;
        System.out.println("b = " + b);
    }

}
 /*
    Swap Numbers
    Swap two variable' values without using a third variable
     */
