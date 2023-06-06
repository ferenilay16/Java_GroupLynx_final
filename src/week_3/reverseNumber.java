package week_3;

import java.util.Scanner;

public class reverseNumber {


    public static void main(String[] args) {

        int num =1994,reverse =0;

        while (num!=0){
            int temp = num % 10; // reminders is 4
            reverse = reverse*10+temp;
            num=num/10;
        }

        System.out.println(reverse);





    }


}
