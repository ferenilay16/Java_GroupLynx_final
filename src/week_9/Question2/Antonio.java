package week_9.Question2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Antonio {

    // ArrayList remove Ahmed
    public static List<String> removeName (List<String> listName, String nameToRemove){
        listName.removeIf(name -> name.equals(nameToRemove));
        return listName;
    }

    public static void main(String[] args) {

        List<String> ourGroup = new ArrayList<>(Arrays.asList("Thi","Ahmed","Ayoub","Ahmed","Serhat","Ahmed","Nilay","Ahmed","Michael","Ahmed","Zeynep","Ahmed","Doina","Ahmed","Medet","Ahmed","Tetiana","Ahmed","Anton","Ahmed"));

        System.out.println(removeName(ourGroup, "Ahmed"));
    }
}
