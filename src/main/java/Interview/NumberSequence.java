package Interview;

import java.util.Scanner;

public class NumberSequence {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the value of N: ");
            int N = scanner.nextInt();

            for (int i = 1; i <= N; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.print("HopSkip ");
                } else if (i % 3 == 0) {
                    System.out.print("Hop ");
                } else if (i % 5 == 0) {
                    System.out.print("Skip ");
                } else {
                    System.out.print(i + " ");
                }
            }

            scanner.close();
        }
    }

