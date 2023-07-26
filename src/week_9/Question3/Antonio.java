package week_9.Question3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Antonio {

    //ArrayList remove some values
    public static List<Integer> removeNumbers (List<Integer> listName, Integer countDownNumber){
        listName.removeIf(digits -> digits > countDownNumber);
        return listName;
    }

    public static void main(String[] args) {

        List<Integer> winnerNumbers = new ArrayList<>(Arrays.asList(1,2,458,745,8,65,32,87,14,69,589,456,148,357,54,18));
        System.out.println(removeNumbers(winnerNumbers, 100));
    }
}
