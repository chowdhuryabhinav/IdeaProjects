package DoSelectAssessmentQuestions;

public class Question3 {


    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("ab");
        sb.append("cd");
        String str = new String(sb);
        String str2 = str.concat("ef");

        System.out.println(str);
        System.out.println(str2);
    }
}
