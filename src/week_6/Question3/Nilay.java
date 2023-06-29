package week_6.Question3;



public class Nilay {

    public static int sumOfDigits(String str)
    {
        int sum = 0;
        String temp;
        for (int i = 0; i < str.length(); i++)
        {
            if (Character.isDigit(str.charAt(i))) // for A3v15 , it gets 315
            {
                temp = str.substring(i,i+1); // gets each characters of the string "315" - They are string
                sum += Integer.parseInt(temp); // Converts string to primitive and adds to sum
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOfDigits("A3v15"));
    }

    }

/*
    Sum of digits in a string:
  Write a method that can return the sum of the digits in a string.

  Ex: "A3v15" = > 3 + 1 + 5 = 9
        return 9
     */