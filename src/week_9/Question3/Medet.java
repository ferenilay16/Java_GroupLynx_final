package week_9.Question3;

import java.util.ArrayList;
import java.util.List;

public class Medet {
    public static void main(String[] args) {
        List<Integer> listOfNum = new ArrayList<>();
        listOfNum.add(123);
        listOfNum.add(2);
        listOfNum.add(3);
        listOfNum.add(4);
        listOfNum.add(9);
        listOfNum.add(5);
        listOfNum.add(6);
        listOfNum.add(200);
        listOfNum.add(402);

        System.out.println("Original List: " + listOfNum);

        // Remove all values greater than 100
        listOfNum.removeIf(number -> number > 100);

        System.out.println("List of numbers after removing values greater than 100: " + listOfNum);
    }
}


/*
  ArrayList - Remove some values
  Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
*/
