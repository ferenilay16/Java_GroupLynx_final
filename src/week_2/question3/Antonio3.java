package week_2.question3;

public class Antonio3 {

    public static void Codility(int N) {
        for (int i = 1; i <= N; i++) {
            StringBuilder result = new StringBuilder();
            if (i % 2 == 0) {
                result.append("Codility");
            }
            if (i % 3 == 0) {
                result.append("Test");
            }
            if (i % 5 == 0) {
                result.append("Coders");
            }
            if (result.length() == 0) {
                System.out.println(i);
            } else {
                System.out.println(result);
            }
        }
    }

}
