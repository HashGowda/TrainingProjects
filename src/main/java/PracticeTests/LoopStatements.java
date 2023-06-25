package PracticeTests;

public class LoopStatements {
    public static void main(String[] args) {

        //for loop
        int sum=0;
        for (int i=0;i<10;i++){
            sum+=i;
        }
        System.out.println("Sum="+sum);

        //for each loop
        String []s={"Java", "Testing","Automation","Manual"};
        System.out.println("\nPrinting the content of the array names:");
        for (String s1:s){
            System.out.println(s1);
        }

        //for loop - Reverse printing
        System.out.println("\nReverse printing:");
        for (int i=10;i>=1;i--){
            System.out.println(i);
        }

        //Odd number
        System.out.println("\nOdd numbers:");
        for (int i=0;i<=10;i++){
            if (i%2!=0){
                System.out.print(i+" ");
            }
        }

        //Nested for loop - Square star pattern
        System.out.println("\nSquare star pattern:");
        for (int i=0;i<=4;i++){
            for (int j=1;j<=4;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        //While loop - printing the first 10 numbers
        System.out.println("\nPrinting the first 10 numbers using while loop");
        int i=1;
        while (i<=10){
            System.out.println(i);
            i++;
        }

        //While loop - printing the first 10 even numbers
        int j=0;
        System.out.println("\nPrinting the first 10 even numbers:");
        while (j<=10){
            System.out.print(j+" ");
            j+=2;
        }

        //While loop - printing the first 10 odd numbers
        int k=1;
        System.out.println("\nPrinting the first 10 odd numbers:");
        while (k<=10){
            System.out.print(k+" ");
            k+=2;
        }

        //While loop - Reverse printing
        int l=10;
        System.out.println("\nPrinting the first 10 numbers in reverse order:");
        while(l>=1){
            System.out.print(l+" ");
            l--;
        }

        //Do while - printing the first 10 numbers
        int m=1;
        System.out.println("\nPrinting the first 10 numbers using do while loop:");
        do {
            System.out.print(m+" ");
            m++;
        } while (m<=10);

        //Reverse order
        int n=10;
        System.out.println("\nReverse order:");
        do {
            System.out.print(n+" ");
            n--;
        } while (n>=1);

        //do while - even numbers
        int b=0;
        System.out.println("\nEven numbers:");
        do {
            if (b%2==0){
                System.out.print(b+" ");
            }
            b++;
        } while (b<=10);

        //do while - odd numbers
        System.out.println("\nOdd numbers:");
        int c=1;
        do {
            if (c%2==1){
                System.out.print(c+" ");
            }
            c++;
        } while (c<10);

        //Break statement
        for (int d=1;d<=10;d++){
            if (d==6){
                break;
            }
            System.out.print("\nBreak statement:"+d);
        }


        //Continue statement
        for (int x=1;x<=10;x++){
            if (x==5){
                continue;
            }
            System.out.println("\nContinue statement:"+x);
        }
    }
}
