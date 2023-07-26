package week_9.Question2;

import java.util.ArrayList;
import java.util.List;

public class Medet {
    public static void main(String[] args) {
        List<String> listOfNames = new ArrayList<>();
        listOfNames.add("Ahmed");
        listOfNames.add("John");
        listOfNames.add("Eric");
        listOfNames.add("Ahmed");
        listOfNames.add("Mike");
        listOfNames.add("Peter");
        listOfNames.add("Ahmed");

        System.out.println("Original List: " + listOfNames);

        // Here we remove all occurrences of name "Ahmed"
        listOfNames.removeIf(name -> name.equals("Ahmed"));

        System.out.println("List after removing name 'Ahmed': " + listOfNames);
    }
}


/*
  ArrayList - Remove "Ahmed"
  Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....'
  Write a java operation to remove all the names named 'Ahmed'
*/
