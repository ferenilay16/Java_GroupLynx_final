package week_7.Question3;

public class serhat {

    public static int[] sortDescending(int[] array) {
        int[] sortedArray = array.clone(); // Create a copy of the original array

        for (int i = 0; i < sortedArray.length - 1; i++) {
            for (int j = 0; j < sortedArray.length - i - 1; j++) {
                if (sortedArray[j] < sortedArray[j + 1]) {
                    // Swap elements if they are in the wrong order
                    int temp = sortedArray[j];
                    sortedArray[j] = sortedArray[j + 1];
                    sortedArray[j + 1] = temp;
                }
            }
        }

        return sortedArray;
    }

    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 3};
        int[] sortedArray = sortDescending(array);

        System.out.print("Original array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }

        System.out.print("\nSorted array (descending order): ");
        for (int num : sortedArray) {
            System.out.print(num + " ");
        }
    }
}
