package PracticeTests;

public class Palindrome {
    public static void main(String[] args) {
        int r, sum=0, temp;
        int n=454;
        temp=n;
        while (n>0){
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        if (temp==sum)
            System.out.println(temp+" is a palindrome");
        else
            System.out.println(temp+" is not a palindrome");

        String in="Radar", out="";
        int m=in.length();
        for (int i=(m-1);i>=0;i--){
            out=out+in.charAt(i);
        }
        if (in.toLowerCase().equals(out.toLowerCase())){
            System.out.println(in+" is a palindrome string");
        } else {
            System.out.println(in+" is not a palindrome string");
        }

        String S = "nitin";
        String S1 = "";
        for (int i = S.length() - 1; i >= 0; i--) {
            S1 = S1 + S.charAt(i);
        }
        if (S1.equals(S)){
            System.out.println(S+" Palindrome");
        } else
            System.out.println(S+" Not palindrome");
        }
    }
