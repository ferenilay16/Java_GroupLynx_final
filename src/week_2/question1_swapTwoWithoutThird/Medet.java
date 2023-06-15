package week_2.question1_swapTwoWithoutThird;

public class Medet {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        System.out.println("Before swapping: a = " + a + ", b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;
        //Swapping without using a third variable
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}

/*
 Swap Numbers

    Swap two variable' values without using a third variable
 */
