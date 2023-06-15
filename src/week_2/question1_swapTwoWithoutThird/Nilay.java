package week_2.question1_swapTwoWithoutThird;

public class Nilay {
    public static void swapNumbers(int num1, int num2){

        num1 = num1 + num2; // 1 + 2 = 3...num1 is 3
        num2 = num1 - num2; // 3 - 2 = 1...num2 is 1
        num1 = num1 - num2; // 3 - 1 = 2...num1 is 2
        System.out.println("Swapped num1 = "+num1);
        System.out.println("Swapped num2 = " + num2);
    }

    public static void main(String[] args) {
        swapNumbers(1,2);

    }
}

      /*

    Swap two variable' values without using a third variable
     */

