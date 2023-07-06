package week_7.Question2;

public class Tetiana {

     /*
    Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
Ex: int[] arr = {10, 9, 8, 7};
arr = Sort(arr); ==>{ 7, 8, 9, 10};
     */

    public static void main(String[] args) {

        int i; // initializing an array
        int array[] = {10, 9, 8, 7};
        System.out.println("Array elements before sorting:\n");

        for (i=0; i< array.length; i++)
            System.out.println(array[i]); // invoking user defined method
        sortArray(array, array.length);
        System.out.println("Array elements after sorting:\n"); //accessing elements of the sorted array
        for (i=0; i<array.length; i++){
            System.out.println(array[i]);
        }


    }

    private static void sortArray(int array[], int n){

        for(int i = 1; i < n; i++){
            int j = i;
            int a = array[i];
            while ((j>0) &&(array[j-1] > a)){

                array[j] = array[j-1];
                j--;
            }

            array[j] = a;

        }
    }

}
