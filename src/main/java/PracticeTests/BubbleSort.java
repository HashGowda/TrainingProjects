package PracticeTests;

public class BubbleSort {
    static void bubbleSort(int a[]) {
        int n = a.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (a[j - 1] > a[j]) {
                    temp = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int a[]={3,30,10,13,50,19,2,40};
        System.out.println("Array before sorting: ");
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }

        System.out.println();
        bubbleSort(a);
        System.out.println("Array after sorting: ");

        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }

    }
}
