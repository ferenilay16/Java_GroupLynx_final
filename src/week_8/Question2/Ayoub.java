package week_8.Question2;

import java.util.Arrays;
public class Ayoub {
    public static void move_ZerosToTheEnd(int[] list1){

        for (int j = 0; j <list1.length-1 ; j++) {

            for (int i = 0; i < list1.length-1; i++) {      //// 1,2,0,0,3,0,4,0  i=0
                if(list1[i]==0){                              // 1,2,0,0,3,0,4,0  i=1
                                                              // 1,2,0,3,0,0,4,0  i=2
                    int h=list1[i];
                    list1[i]=list1[i+1];
                    list1[i+1]=h;
                }
            }
        }
        System.out.println(Arrays.toString(list1));

    }



    public static void main(String[] args) {
        int[] list={1,0,2,0,3,0,4,0};
        int []k= {1,8,2,8,3,0,4,0};
        move_ZerosToTheEnd(k);
        move_ZerosToTheEnd(list);
    }
}
 /*
    Array - Move Zeros to the End
    Write a method that can move all the zeros to last indexes of the array (Do Not Use Sort Method)
    Ex: input: {1,0,2,0,3,0,4,0}; output: [1, 2, 3, 4, 0, 0, 0,0]
     */