package week_1.question_3;

public class Thi {

    // Method for iterating FINRA, 2 options
    public static void iterateFINRA() {
        for (int i = 1; i <= 30; i++) { // 1. iterate number from 1 until 30 (including 30), increase iteration by 1.

            if (i % 3 == 0 && i % 5 == 0) { // 2. check if the number is divisible by 3 AND 5. if true, print FINRA
                System.out.print("FINRA ");
            } else if (i % 3 == 0) { // 3. if number is not divisible by 3 AND 5, check if it's divisible by 3. if true, print FIN
                System.out.print("FIN ");
            } else if (i % 5 == 0) { // 4. if number is not divisible by 3 AND 5, or 3, check if it's divisible by 5. if true, print RA
                System.out.print("RA ");
            } else { // 5. if number is not divisible by 3 AND 5, or 3, or 5, then print number
                System.out.print(i + " ");
            }//if-else
            // I chose to put the condition divisible by 3 AND 5 first, bc it's an AND condition...if I placed it after the 3 or 5 conditions, the iteration would already be accounted for that condition (I would either get FIN or RA, not FINRA)
        }//for loop
        // I chose a For loop bc we needed to iterate a set of numbers that had start and end numbers with a one-digit increment

        System.out.println();
    }//method
    // I made this method PUBLIC so it can be accessed across all classes and packages, STATIC so it belongs to the class, and VOID bc we do not return a value

    public static void iterateFINRA2() {
        String result = " "; // 1. create String to hold values
        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result += "FINRA "; // 2. update String w/ FINRA
            } else if (i % 3 == 0) {
                result += "FIN "; // 2. update String w/ FIN
            } else if (i % 5 == 0) {
                result += "RA "; // 2. update String w/ RA
            } else {
                result += i + " "; // 2. update String w/ number
            }//if-else
        }//for loop

        System.out.println(result.trim()); // 3. print result w/o blanks on either end
    }//method

    public static void main(String[] args) {
        iterateFINRA(); //1 2 FIN 4 RA FIN 7 8 FIN RA 11 FIN 13 14 FINRA 16 17 FIN 19 RA FIN 22 23 FIN RA 26 FIN 28 29 FINRA
        iterateFINRA2(); //1 2 FIN 4 RA FIN 7 8 FIN RA 11 FIN 13 14 FINRA 16 17 FIN 19 RA FIN 22 23 FIN RA 26 FIN 28 29 FINRA
    }
}
/*
    Write a method which prints out the numbers from 1 to 30 but for numbers which are a multiple of 3print "FIN" instead of the number and for numbers which are a multiple of 5, print "RA" instead of the number. for numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number.
     */