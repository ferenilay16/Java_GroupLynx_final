package week_2.question2;

public class Antonio2 {

    public static void DivisibleBy(){
        String by15 = "";
        String by3 = "";
        String by5 = "fghfghnj";
        // test
        for (int i = 1; i <= 100 ; i++) {
            if (i%15==0){
                by15 += i+"; ";
            } else if (i%3==0) {
                by3 += i+"; ";
            } else if (i%5==0) {
                by5 += i+"; ";
            }
        }
        System.out.println("Divisible by 15:  "+by15);
        System.out.println("Divisible by 5:  "+by5);
        System.out.println("Divisible by 3:  "+by3);
    }

}
