package week_2.question1_swapTwoWithoutThird;

public class Thi {

    public static void swap(int num1, int num2){
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        num1 = num1 + num2; // 1 + 2 = 3...num1 has been updated to 3
        num2 = num1 - num2; // 3 - 2 = 1...num2 has been updated to 1
        num1 = num1 - num2; // 3 - 1 = 2...num1 has been updated to 2
        System.out.println("swapped num1 = "+num1);
        System.out.println("swapped num2 = " + num2);
    }//swap

    public static void main(String[] args) {
        swap(1,2);
            //num1 = 1
            //num2 = 2
            //swapped num1 = 2
            //swapped num2 = 1
    }//main
}//class
      /*
    Swap Numbers

    Swap two variable' values without using a third variable
     */