package Patterns;

public class DiamondPattern {

    public static void printDiamondPattern(int n) {
        for (int i = 0; i < 2 * n; i++) {

            boolean k = true;

            int temp = n - 1;

            for (int j = 0; j < 2 * n; j++) {

                if (i <= n - 1) {
                    if (j >= n - 1 - i && j <= n - 1 + i && k) {
                        System.out.print("*");
                        k = false;

                    } else {
                        System.out.print(" ");
                        k = true;
                    }
                } else {

                    if (j >= i - temp && j <= 3 * n - 3 - i && k) {
                        System.out.print("*");
                        k = false;
                    } else {
                        System.out.print(" ");
                        k = true;
                    }

                }

            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        printDiamondPattern(5);

    }
}
