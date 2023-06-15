package week_4.question2;

import java.util.Arrays;
import java.util.TreeSet;

public class Nilay {
    public static boolean Same(String str1, String str2) {
       str1 = new TreeSet<String>(Arrays.asList( str1.split("") ) ).toString( ); // we used treeSet since Tree Set maintains sorted order. We used asList() method to convert array to list of elements. We used toString to transform an abject into String.
        str2 = new TreeSet<String>(Arrays.asList( str2.split("") ) ).toString( );
        return str1.equals(str2);

    }

    public static void main(String[] args) {
        System.out.println(Same("abc","abb"));
    }
}

/*
    String -- Same letters
Write a return method that check if a string is build out of the
same letters as another string.
Ex: same("abc", "cab"); -> true
same("abc", "abb"); -> false:
     */