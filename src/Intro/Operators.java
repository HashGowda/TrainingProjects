package Intro;

public class Operators {

    public static void main(String[] args) {

        int age=17;
        if (age>=18)
    {
        System.out.println("eligible for voting");
    }
        else
    {
        System.out.println("Not eligible for voting");
    }
        System.out.println("*******************");

        int n =21;
        if (n%2==0){
            System.out.println(n+" is even number");
        } else{
            System.out.println(n+" is not even number");
        }
        System.out.println("*******************");

        int i=14;
        if (i%2==0){
            System.out.println(i+" is even number");
        } else {
            System.out.println(i+" is not even number");
        }
        System.out.println("********************");

        int j=20;
        if (j%2!=0){
            System.out.println(j+" is not even number");
        } else {
            System.out.println(j+" is even number");
        }
        System.out.println("**************");
        int x=10;
        System.out.println(x++);
        int y=5;
        System.out.println(++y);
        int z=8;
        System.out.println(z--);
        int m=6;
        System.out.println(--m);

        System.out.println(10<<2);
        System.out.println(10<<3);
        System.out.println(10>>2);
        System.out.println(10>>3);

        int a=10;
        int b=5;
        int c=8;
        System.out.println(a<b&&a<c);
        System.out.println(a<b&a<c);

        int marks=35;

        /*FCD 70 TO 100
        FC 60 TO 70
        SC 50 TO 60
        PASS
        FAIL
         */

        if ((marks>=70) && (marks<=100)){
            System.out.println("FCD");
        } else if (((marks>=60) && (marks<=70))){
            System.out.println("FC");
        } else if (((marks>=50) && (marks<=60))){
            System.out.println("SC");
        } else if (((marks>=40) && (marks<=50))){
            System.out.println("Pass");
        } else if (marks<40) {
            System.out.println("Fail");
        }
    }
}
