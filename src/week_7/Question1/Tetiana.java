package week_7.Question1;

public class Tetiana {

    /*
    Write a method that can find the minimum number from an int Array
     */


    public static void main(String[] args) {

        int array[] = new int[]{10, 11, 88, 2, 12, 120};

        int min = getMin(array);
        System.out.println("Minimum value  = " + min);


    }

    public static int getMin(int[] inputArray){
        int minValue = inputArray[0];
        for (int i=1; i<inputArray.length; i++){
            if (inputArray[i] < minValue){
                minValue = inputArray[i];
            }
        }
        return minValue;
    }
}
