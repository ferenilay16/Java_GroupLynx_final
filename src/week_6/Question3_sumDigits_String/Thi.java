package week_6.Question3_sumDigits_String;

public class Thi {

    public static void sumDigits(String str){
        // int variable sum to hold the sum
        int sum = 0;
        // iterate through string
        for (int i = 0; i < str.length(); i++) {
            // char variable ch for each character at index i
            char ch = str.charAt(i);
            // use wrapper class to access isDigit() method and pass ch
            if (Character.isDigit(ch)){
                // convert character to Integer
                int number = Integer.parseInt(""+ch);
                // update sum variable by adding number value
                sum += number;
            }
        }
        System.out.println(sum);
        }

    public static void main(String[] args) {
        sumDigits("a1b20c35");
    }
}
/*
    Sum of digits in a string:
  Write a method that can return the sum of the digits in a string.

  Ex: "A3v15" = > 3 + 1 + 5 = 9
        return 9
     */