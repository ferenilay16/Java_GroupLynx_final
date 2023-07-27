package week_9.Question1;

import java.util.Arrays;

public class serhat {

    public static void main(String[] args) {





        int[]first = {10,20,30,40,50};
        int[]second={60,70,80,90,100};

        int length = first.length+second.length;

        int[]merge = new int[length];

        int result=0;

        for ( int element : first){
            merge[result] = element;
            result++;
        }

        for (int element2 : second){
            merge[result] = element2;
            result++;
        }


        System.out.println(Arrays.toString(merge));



    }
}
