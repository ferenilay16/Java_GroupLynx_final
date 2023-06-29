package week_6.Question2_findMax_IntArray;

public class Antonio {

    public static int maxNum(int[] arr){

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

}
