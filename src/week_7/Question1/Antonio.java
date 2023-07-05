package week_7.Question1;

public class Antonio {
    public static String minMaxNum(int[] arr){
        String result = "";
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]< min){
                min = arr[i];
            } else if (arr[i]>max) {
                max = arr[i];
            }
            result = "max = " + max + "\nmin = "+min;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] numbers = {54,2,65,-8,0,45,2};
        System.out.println(minMaxNum(numbers));
    }
}
