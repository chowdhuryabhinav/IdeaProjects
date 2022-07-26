package String.Recursion;

public class Subsequences {

    public static void printSubsequences(String str, int idx, String newString) {

        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }

        char currentChar = str.charAt(idx);

        printSubsequences(str, idx + 1, newString + currentChar);

        printSubsequences(str, idx + 1, newString);

    }

    public static void main(String[] args) {
        String str = "abc";
        printSubsequences(str, 0, "");
    }
}
