package week_9.Question3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class serhat {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 150; i++) {
            numbers.add(i);
        }

        removeValuesGreaterThan100(numbers);
        System.out.println(numbers);
    }
    public static void removeValuesGreaterThan100(ArrayList<Integer> list) {
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer num = iterator.next();
            if (num < 100) {
                iterator.remove();
            }
        }
    }

}
