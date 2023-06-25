import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sn.nextInt();

        System.out.println("Fibonacci series: ");
        printFibonacciSeries(n);

        sn.close();
    }

    public static void printFibonacciSeries(int n){
        int num1=0,num2=1;

        for (int i=1;i<=n;i++){
            System.out.print(num1+" ");
            int sum =num1+num2;
            num1=num2;
            num2=sum;
        }
    }
}
