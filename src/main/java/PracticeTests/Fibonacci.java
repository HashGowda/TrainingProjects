package PracticeTests;

public class Fibonacci {
    public static void main(String[] args) {

        //Fibonacci series
//        int a=0;
//        int b=1;
//        System.out.println("a="+a+" b="+b);
//        for (int i=2; i<10;i++){
//            int c=a+b;
//            System.out.println("c="+c);
//            a=b;
//            b=c;
//        }
//    }


        //Largest number
//        int max = 0;
//        int a[] = {2, 45, 10, 40, 50, 38};
//        for (int i = 0; i < a.length; i++) {
//            if (a[i] > max) {
//                max = a[i];
//            }
//        }
//        System.out.println(max);
//    }

        //Smallest number
        int a[] = {2, 45, 10, 40, 50, 38};
        int min = a[0];
        for (int i=0;i<a.length;i++){
            if (a[i]<min){
                min=a[i];
            }
        }
        System.out.println(min);

        //Swap numbers
//        int x=2;
//        int y=4;
//        System.out.println("Before swap:x="+x+" y="+y);
//        x=x+y;     //6
//        y=x-y;     //2
//        x=x-y;
//        System.out.println("After swap:x="+x+" y="+y);
//    }
//}

        //Triangle numbers
//        for (int i=0;i<=5;i++){
//            for (int j=1;j<=i+1;j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }
    }
}

