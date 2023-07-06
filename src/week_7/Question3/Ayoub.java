package week_7.Question3;

import java.util.Arrays;

public class Ayoub {

    public static int[] sortDescending(int[]list){

        int[] group = week_7.Question2.Ayoub.ascendingMethod(list);

        int[] groupElement=new int[group.length];



        for (int i=group.length-1,j=0; i>0 ; i--,j++){
            groupElement[j]=group[i];
        }



        return groupElement;

    }

    public static void main(String[] args) {
        int[] arr = {10,20,7, 8, 90};

        System.out.println(Arrays.toString(sortDescending(arr)));


    }



}
/*
    Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
Ex: int[] arr = {10,20,7, 8, 90};
arr = Sort(arr); ==> {90, 20, 10, 8, 7};
     */




