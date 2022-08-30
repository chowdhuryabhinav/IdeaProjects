package DoSelectAssessmentQuestions;

import java.util.Arrays;

public class Question6 {

    public static void main(String[] args) {
        String[][] strings = {{"A", "Z"}, {"C", "D", "S"}, {"L"}};
        Arrays.sort(strings);

        for (String[] str : strings) {
            for (String s : str) {
                System.out.print(s);
            }
        }
    }
}
