package Intro;

public class WhileLoop {

    public static void main(String[] args) {

        /*
        for (int i=1; i<=10; i++)
            System.out.println(i);

     */

        /*
   int i=1;
   while (i<=10){
       System.out.println(i);
       i++;
   }

         */


        /*
        int j=10;
        while (j>=1){
            System.out.println(j);
            j--;
        }

         */

        /*
        int k=1;
        while (k<=10){
            if (k%2==1){
                System.out.println(k);
            }
            k++;
        }

         */

        /*
        int num=5;
        int i=1;
        while(i<=10){
            System.out.println(num+" * "+i+" = "+num*i);
            i++;
        }

         */

        int sum = 0;
        int i = 1;
        while (i <= 10) {
            if (i % 2 == 0) {
                sum += i;
            }
            i++;
        }
        System.out.println(sum);
    }
}
