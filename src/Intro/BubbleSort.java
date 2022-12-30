package Intro;

public class BubbleSort {
     static void bubble(int[]a){
         int temp=0;
         int n=a.length;
         for(int i=0; i<a.length;i++){
             for(int j=1; j<(n-1);j++){
                 if(a[j-1]>a[j]){
                     temp=a[j-1];
                     a[j-1]=a[j];
                     a[j]=temp;
                 }
             }
         }
     }

    public static void main(String[] args) {
        int a[]={23, 4, 1, 76, 34, 100, 76};

        System.out.println("Before sort");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }

        System.out.println();

        bubble(a);

        System.out.println("After sort");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
