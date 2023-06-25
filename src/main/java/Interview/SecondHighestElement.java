package Interview;

import java.util.Arrays;

public class SecondHighestElement {
    public static void main(String[] args) {

        //First method

        int[] arr = {1, 4, 3, 5, 6, 3, 8};

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int k : arr) {
            if (k > max) {
                secondMax = max;
                max = k;
            } else if (k > secondMax && k != max) {
                secondMax = k;
            }
        }
        System.out.println("Second highest element: " + secondMax);


        //Second method

        int temp, size;
        int[] array = {10, 20, 25, 63, 96, 57};
        size = array.length;

        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("Second highest element: " + array[size-2]);


        //Third method

        int[] numbers ={10, 20, 25, 63, 96, 97};
        int len = numbers.length;

        Arrays.sort(numbers);
//        System.out.println("Sorted array: "+Arrays.toString(numbers));
        int result = numbers[len-2];
        System.out.println("Second highest element: "+result);
    }
}
