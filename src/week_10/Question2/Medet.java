package week_10.Question2;

import java.util.ArrayList;

public class Medet {
    public static void sortDesc(ArrayList<Integer> list) {
        int n = list.size();

        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (list.get(j) > list.get(maxIndex)) {
                    maxIndex = j;
                }
            }

            // Here we swap the elements
            int temp = list.get(i);
            list.set(i, list.get(maxIndex));
            list.set(maxIndex, temp);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(98);
        numbers.add(34);
        numbers.add(19);
        numbers.add(0);
        numbers.add(7);
        numbers.add(2);

        System.out.println("Original List: " + numbers);
        sortDesc(numbers);
        System.out.println("Sorted List in Descending Order: " + numbers);
    }
}


/*
    ArrayList - sorting in descending order
    Write a method that can sort the ArrayList in descending order without using the sort method.
 */

/*
Input: The method sortDesc takes an ArrayList of integers as input, named list.
Outer Loop: The algorithm uses an outer loop that runs from index 0 to the second-to-last element of the list.
Find Maximum: In each iteration of the outer loop, the algorithm searches for the maximum element in the unsorted part of the list, starting from the current index.
Inner Loop: The inner loop iterates through the unsorted part of the list to find the maximum element.
Swap: Once the maximum element is found, it is swapped with the element at the current index of the outer loop. This effectively moves the largest unsorted element to its correct position at the beginning of the list.
Sorted Part: With each iteration of the outer loop, the sorted part of the list increases from the end. Elements are gradually moved to their correct descending order positions.
Sorted List: After all iterations are completed, the list is sorted in descending order.
 */
