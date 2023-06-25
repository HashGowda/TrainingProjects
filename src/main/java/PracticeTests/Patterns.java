package PracticeTests;

public class Patterns {
    public static void main(String[] args) {

        //Right triangle start pattern
        System.out.println("Right triangle star pattern:");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        //Left triangle star pattern
        System.out.println("\nLeft triangle star pattern:");
        for (int i = 0; i < 6; i++) {
            for (int j = 2 * (6 - i); j >= 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        //Pyramid star pattern
        System.out.println("\nPyramid star pattern:");
        for (int i = 0; i < 6; i++) {
            for (int j = 6 - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        //Downward triangle star pattern
        System.out.println("\nDownward triangle star pattern:");
        for (int i = 6 - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        //Mirrored Right Triangle Star Pattern
        System.out.println("\nMirrored Right Triangle Star Pattern:");
        int n = 7;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        //Reverse Pyramid Star Pattern
        System.out.println("\nReverse Pyramid Star Pattern:");
        int r = 5;
        for (int i = 0; i <= r; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < r - i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        //Right down mirror star pattern
        System.out.println("\nRight down mirror star pattern:");
        int m = 5;
        for (int i = m; i >= 1; i--) {
            for (int j = m; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //Square Pattern
        System.out.println("\nSquare Pattern");
        int v = 3;
        for (int i = 0; i <= v; i++) {
            for (int j = 0; j <= v; j++) {
                if ((i == 0 || i == v) || (j == 0 || j == v)) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }
                System.out.println();
            }
        }
    }


