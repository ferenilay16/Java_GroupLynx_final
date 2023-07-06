package week_7.Question1;

public class Ayoub {

    public static void minimumNumberInArray(int[] arr){
        int minNumber =2147483647;

        for (int i = 0; i <arr.length; i++) {
            if(arr[i] <minNumber){
                minNumber=arr[i];
            }
        }
        System.out.println("minNumber = " + minNumber);
    }
    public static void main(String[] args) {

        int[] arr = {-9,10,7,5, 0,8, 7};

        minimumNumberInArray(arr);





    }



} /*
    Write a method that can find the minimum number from an int Array
     */
