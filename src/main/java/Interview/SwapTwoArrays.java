import java.util.Scanner;

public class SwapTwoArrays {

    private static Scanner sc;

    public static void main(String[] args) {

        int i, size;
        sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in an array: ");
        size = sc.nextInt();

        int[] a = new int[size];
        int[] b = new int[size];

        System.out.println("Enter elements of first array: ");
        for (i=0;i<size;i++){
            a[i]=sc.nextInt();
        }

        System.out.println("Enter elements of second array: ");
        for (i=0;i<size;i++) {
            b[i] = sc.nextInt();
        }

        for (i = 0;i<size;i++){
            a[i]=a[i]+b[i];
            b[i]=a[i]-b[i];
            a[i]=a[i]-b[i];
        }

        System.out.print("\nArray a elements after swapping: ");
        printArray(a, size);
        System.out.print("\nArray b elements after swapping: ");
        printArray(b, size);
    }

    public static void printArray(int[] array, int size){
        for (int number:array){
            System.out.print(number+" ");
        }
    }
}
