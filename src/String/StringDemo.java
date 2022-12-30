package String;

import javax.sound.midi.Soundbank;
import java.util.SortedMap;

public class StringDemo {
    public static void main(String[] args) {
        uppercase();
        lowercase();
        length();
        compare();
        replace();
        split();
        splitBy();
        trim();
        startsAndEndsWith();
        valueOf();
    }

        static void uppercase () {
            String S = new String("java");
            System.out.println("Uppercase " + S.toUpperCase());
        }
        static void lowercase () {
            String S = new String("JAVA");
            System.out.println("Lowercase " + S.toLowerCase());
        }

        static void length () {
            String S = new String("JavaProgramming");
            System.out.println("Length is " + S.length());
        }

        static void compare () {
            String S1 = "java";
            String S2 = "programming";
            System.out.println("Compare " + S1.compareTo(S2));
        }
        static void replace () {
            String S = "I am from Karnataka";
            System.out.println(S.replace("Karnataka", "India"));
        }
        static void split () {
            String S1 = "N$S, 500, 008";
            String S[] = S1.split("\\,$");
            for (String S2 : S) {
                System.out.println(S2 + " ");
            }
            System.out.println();
        }
        static void splitBy () {
            String S1 = "AA BB CC DD";
            String S[] = S1.split(" ");
            for (int i = 0; i < S.length; i++) {
                System.out.println(S[i]);
            }
            System.out.println();
        }
        static void trim () {
            String S = "  Java  ";
            System.out.println(S);
            System.out.println("Trim " + S.trim());
        }
        static void startsAndEndsWith () {
            String S = "JavaProgram";
            System.out.println("Starts with " + S.startsWith("Ja"));
            System.out.println("Ends with " + S.endsWith("m"));
        }
        static void valueOf () {
            int a = 10;
            String S = String.valueOf(a);
            System.out.println(S);
            char c = 'C';
            String S1 = String.valueOf(c);
            System.out.println(S1);
        }
    }
