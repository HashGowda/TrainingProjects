package Intro;

public class Array {
    public static void main(String[] args) {

        //Printing the array numbers

        /*

        int a[] = new int[5];
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        a[3] = 40;
        a[4] = 50;

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

         */


        //Printing an array of single line

        /*
        int a[]={1,2,3,4,5};
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }

         */

        //Printing 2 dimensional array

/*
        int a[]={2,4,6,8};
        int b[]= new int[4];
        b[0]=1;
        b[1]=3;
        b[2]=5;
        b[3]=7;

        for (int i=0; i<a.length;i++){
            System.out.println(a[i]);
        }
        for (int j=0;j<b.length;j++){
            System.out.println(b[j]);
        }

 */

        //Printing an array in descending order

        /*

        int a[] = {1, 2, 3, 4, 5, 6};
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.println(a[i]);
        }

        */


        //Printing multidimensional array

        /*


        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

         */

        //Printing string array

        /*

        String []S={"A","B","C","D","E"};
            System.out.println(S.length);
            for (int i=0; i<=S.length;i++){
                System.out.println(S[i]+" ");
            }

         */

        //Printing char array

        /*

        char []C={'a','b','c','d','e'};
        int i=0;
        while (i<C.length){
            System.out.println(C[i]+" ");
            i++;
        }

         */

        //Printing string array

        /*

        String[] S1={"Java","Automation","Selenium","Testing"};
        for(String S2:S1){
            System.out.println(S2);
        }

         */

        //Printing multidimensional array

        /*

        int[][]a= new int[3][3];
        a[0][0]=10;
        a[0][1]=20;
        a[0][2]=30;
        a[1][0]=40;
        a[1][1]=50;
        a[1][2]=60;
        a[2][0]=70;
        a[2][1]=80;
        a[2][2]=90;
        System.out.println("Length of an array = "+a.length);
for(int i=0; i<a.length;i++){
    for (int j=0; j<a[i].length;j++){
        System.out.print(a[i][j]+" ");
    }
    System.out.println();
}

         */

        int [][]a={{10,20,30},{40,50,60},{70,80,90}};
        for(int i=0; i<a.length;i++){
            for(int j=0; j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

        }
    }



