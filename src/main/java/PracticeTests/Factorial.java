package PracticeTests;

public class Factorial {
    public static void main(String[] args) {
        int fact=1;
        int n=5;
        for (int i=n;i>=1;i--){
            fact*=i;
        }
        System.out.println("Factorial of "+n+" = "+fact);

        System.out.println("\nPrinting the fibonacci series:");
        int n1=0,n2=1,n3,i,count=10;
        System.out.println(n1+" "+n2);
        System.out.println();
        for (i=2;i<count;i++){
            n3=n1+n2;
            System.out.println(n3);
            n1=n2;
            n2=n3;
        }
    }
}
