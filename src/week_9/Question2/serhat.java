package week_9.Question2;

import java.util.ArrayList;

public class serhat {

    public static void main(String[] args) {


        ArrayList<String> person = new ArrayList<String>();
        person.add("serhat");
        person.add("cydeo");
        person.add("bella");
        person.add("irmak");

        System.out.println("name = " + person.size());

        for (String name : person){
            System.out.println("name = " + name);
        }

        person.remove(1);
        System.out.println("person.size() = " + person.size());

        for (String name2 :person){
            System.out.println("name2 = " + name2);
        }




    }
}
