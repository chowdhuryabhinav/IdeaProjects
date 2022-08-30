package DoSelectAssessmentQuestions;

public class Question4 {

    int x = 5;
    int y = 5;

    public static void main(String[] args) {
        new Question4().print(2);
    }

    public void print(int x) {
        System.out.println(x + y);
        int y = 4;
    }
}
