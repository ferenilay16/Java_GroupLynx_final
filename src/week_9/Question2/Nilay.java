package week_9.Question2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Nilay {
    public static List<String> removeNames (List<String>namesList){
        namesList.removeIf(names-> names.equals("Ahmed"));
                return namesList;
    }

    public static void main(String[] args) {
        List<String>EmployeeList= new ArrayList<>(Arrays.asList("Ahmed","Nilay","Mary","Tom","Mert","Ahmed","Leena","Muhtar","Gurhan","Ahmed"));

        System.out.println(removeNames(EmployeeList));
    }


}

 /*
    ArrayList - Remove "Ahmed"
  Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....'
  Write a java operation to remove all the names named 'Ahmed'
     */