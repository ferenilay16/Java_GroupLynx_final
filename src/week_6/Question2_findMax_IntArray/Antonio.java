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

    public static void main(String[] args) {
        int[] numbers = {5,89,14,65,23,73};
        System.out.println(maxNum(numbers));
    }

}
