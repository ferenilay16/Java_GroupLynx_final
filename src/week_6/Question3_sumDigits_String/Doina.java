package week_6.Question3_sumDigits_String;

public class Doina {
    public static void main(String[] args) {

    String str = "A3v15";
        int sum = 0;

        for (char each : str.toCharArray()) {

            if (Character.isDigit(each)) {
                sum += Integer.parseInt("" + each);
            }
        }
        System.out.println("sum = " + sum); // sum of digits
    }
}
/*
    Sum of digits in a string:
  Write a method that can return the sum of the digits in a string.

  Ex: "A3v15" = > 3 + 1 + 5 = 9
        return 9
     */