package week_9.Question3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Nilay {

    public static List<Integer> removeNumbers (List<Integer> listName) {
        listName.removeIf(number -> number > 100 );
        return listName;
    }

    public static void main(String[] args) {

        List<Integer> listName = new ArrayList<>(Arrays.asList(1,2,150,45,67,89,122,7,9,12,552,956,456));
        System.out.println(removeNumbers(listName));
    }

}

/*
    ArrayList - Remove some values
  Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
     */