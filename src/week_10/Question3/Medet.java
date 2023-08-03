package week_10.Question3;

import java.util.*;

public class Medet {
    public static Map<String, Integer> sortMapByValue(Map<String, Integer> map) {
        // We convert the Map entries to a List
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(map.entrySet());

        // Next we sort the List using a custom comparator based on values in ascending order
        entryList.sort(Map.Entry.comparingByValue());

        //if we want sort values in descending:
        //entryList.sort(Collections.reverseOrder(Map.Entry.comparingByValue()));

        // After we create a LinkedHashMap to store the sorted entries while preserving the insertion order
        Map<String, Integer> sortedMap = new LinkedHashMap<>();

        // Finally, we put the sorted entries into the LinkedHashMap
        for (Map.Entry<String, Integer> entry : entryList) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        return sortedMap;
    }

    public static void main(String[] args) {
        Map<String, Integer> unsortedMap = new HashMap<>();
        unsortedMap.put("James", 23);
        unsortedMap.put("Lauren", 35);
        unsortedMap.put("Mike", 28);
        unsortedMap.put("Donald", 65);
        unsortedMap.put("Emma", 43);
        unsortedMap.put("Mary", 33);

        System.out.println("Unsorted Map: " + unsortedMap);
        Map<String, Integer> sortedMap = sortMapByValue(unsortedMap);
        System.out.println("Sorted Map by Values (Ascending): " + sortedMap);
    }
}

/*
    Map - Sort the map by values
    Write a method that can sort the Map by values.
 */
