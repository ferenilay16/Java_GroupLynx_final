package week_10.Question1;

import java.util.ArrayList;

public class Medet {
    public static void ascSort(ArrayList<Integer> list) {
        int n = list.size();
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    //Here we swap the elements
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);

                    swapped = true;
                }
            }

            //If no two elements were swapped in the inner loop, the list is already sorted
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(13);
        numbers.add(37);
        numbers.add(22);
        numbers.add(7);
        numbers.add(77);

        System.out.println("Original List: " + numbers);
        ascSort(numbers);
        System.out.println("Sorted List: " + numbers);
    }
}


/*
    ArrayList - sorting in ascending
    Write a method that can sort the ArrayList in Ascending order without using the sort method.
 */
/*
Input: The method ascSort takes an ArrayList of integers as input, named list.
Iteration: The algorithm uses two nested loops. The outer loop runs from index 0 to the second-to-last element of the list.
Comparison and Swap: In the inner loop, adjacent elements are compared. If the element at the current index is greater than the element at the next index, they are swapped.
Passes: The algorithm performs multiple passes through the list. In each pass, the largest unsorted element "bubbles up" to its correct position at the end of the list.
Exit Condition: If no swaps are made during an entire pass (inner loop), it means the list is already sorted, and the algorithm can exit early.
Sorted List: After all passes are completed, the list is sorted in ascending order.
 */