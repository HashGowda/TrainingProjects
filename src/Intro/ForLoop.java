package Intro;

public class ForLoop {
    public static void main(String[] args) {

        // Printing numbers from 1 to 10

        /*
        for (int i=1;i<=10;i++)
            System.out.println(i);

         */

        // Printing numbers from 10 to 1

        /*
        for (int i=10; i>=1;i--){
            System.out.println(i);
        }

         */

        // Nested for loop

        /*
        for (int i=1; i<=3; i++){
            for (int j=1; j<=3; j++){
                System.out.println(i+" "+j);

         */

        //Printing Right Triangle Star Pattern

/*
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();

 */

//Printing Right Triangle Star Pattern from bottom

/*
        int a=5;
        for (int i=1; i<=a; i++){
            for (int j=a; j>=i; j--){
                System.out.print(" * ");
            }
            System.out.println();

 */

//Printing Even numbers in first 10 numbers

/*
        for (int i=1; i<=10; i++)
        if (i%2==0){
            System.out.println(i);
        }

 */

//Printing the sum of first 10 numbers

        /*
        int sum=0;
        for (int i=1; i<=10; i++){
            sum=sum+i;
        }
        System.out.println(sum);

         */

        //Printing numbers from 1 to 8

/*
       for (int i=1; i<=10; i++){
           if (i==8){
               break;
           }
           System.out.println(i);
       }

 */

        //Printing numbers from 1 to 10 except 6

        /*
        for (int i=10; i>=1; i--){
            if (i==6){
                continue;
            }
            System.out.println(i);
        }

         */

        //Printing numbers from 21 to 31

        /*
        for (int i=21; i<=31; i++){
            System.out.println(i);
        }

         */

        //Printing numbers from 57 to 38

        /*
        for (int i=57; i>=38; i--){
            System.out.println(i);
        }

         */

        //Printing Odd numbers


        /*
        for (int i=1; i<=10; i++){
            if (i%2==1){
                System.out.println(i);
            }
        }

         */

        //Printing table

/*
        // number n for which we have to print the
        // multiplication table.
        int num=5;

        // looping from 1 to 10 to print the multiplication
        // table of the number.
        // using for loop
        for(int i=1; i<=10; i++){
            // printing the num*i,ie ith multiple of num.
           /* System.out.printf("%d * %d = %d \n", num, i, num*i); */

        /*
            System.out.println(num + " * " + i + " = " + num*i);
        }
        */

        //Printing Even numbers from 66 to 42

        /*
        for (int i=66; i>=42; i--){
            if (i%2==0){
                System.out.println(i);
            }
        }

         */

        //Printing table from descending order

/*
        int num=4;
        for (int i=10; i>=1; i--){
            System.out.println(num+"*"+i+"="+num*i);
        }

 */

        //Printing sum of even numbers in first 10 numbers

        /*
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);

         */

        //Printing a Hollow Square star

/*
        int n=3;
        for(int i=0;i<=n;i++) {
            for(int j=0;j<=n;j++) {
                if(i==0||j==0||i==n||j==n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

 */

//Printing Right Triangle star numbers

/*
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

 */

//Printing star triangle


        int n=3;
        for (int i=0;i<=n;i++){
            for (int j=n;j>=i;j--){
                System.out.print(" ");
            }
            for (int k=0; k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }


        }
    }


