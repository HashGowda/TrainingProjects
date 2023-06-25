package PracticeTests;

import java.util.Arrays;

public class SortBubble {
    public static void main(String[] args) {
        int a[]={23,43,13,65,11,62,76,83,9,71,84,34,96,80};
        System.out.println("Original array:"+Arrays.toString(a));
        int n=a.length;

        //iterate over the array comparing adjacent elements
        for (int i=0;i<n-1;i++){
            for (int j=0;j<n-i-1;j++){

                ////if elements not in order, swap them
                if (a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println("Reversed array:"+Arrays.toString(a));

    }
}
