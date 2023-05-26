package week_1.question_3;

public class Antonio {

    public static void FINRA(){
        for (int i = 1; i <= 30 ; i++) {
            if (i%3 ==0 && i%5 ==0){
                System.out.println(("FINRA " + i));
            } else if (i%3 ==0) {
                System.out.println("FIN "+i);
            } else if (i%5 ==0) {
                System.out.println("RA "+i);
            }else {
                System.out.println("No such option for "+i);
            }
        }
    }
}
