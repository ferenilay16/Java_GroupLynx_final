package week_1.question_3_finra;

public class Nilay {
    public static void main(String[] args) {
        for (int i = 1; i <= 30; i++) {
            if (i % 15 == 0) {
                System.out.println("FINRA");
                continue;
            }
            if (i % 3 == 0) {
                System.out.println("FIN");
                continue;
            }
            if (i % 5 == 0) {
                System.out.println("RA");
                continue;

            }
            System.out.println(i);


        }
    }
}

//    Write a method which prints out the numbers from 1 to 30 but for numbers which are a multiple of 3print "FIN" instead of the number and for numbers which are a multiple of 5, print "RA" instead of the number. for numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number.
//
