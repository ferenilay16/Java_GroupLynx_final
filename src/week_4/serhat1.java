package week_4;

import java.util.Scanner;

public class serhat1 {

    /*
String -- Frequency of Characters
Write a return method that can find the frequency of
characters
Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */
    public static void main(String[] args) {

        System.out.println("Enter a string value :");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        System.out.println("Enter a particular character :");
        char character = input.nextLine().charAt(0);
        int count = 0;

        for (int i=0; i<str.length(); i++){
            if(character == str.charAt(i)){
                count++;
            }
        }
        System.out.println("Frequency of the give character:: "+count);





    }

}
