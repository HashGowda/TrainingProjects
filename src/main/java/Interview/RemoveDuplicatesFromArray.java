import java.util.*;

public class RemoveDuplicatesFromArray {


//    public static void main(String[] args) {
//        Integer[] array = {1, 2, 3, 4, 2, 3, 5, 1, 6, 7, 4};
//
//        // Convert the array to a Set to remove duplicates
//        Set<Integer> uniqueSet = new LinkedHashSet<>(Arrays.asList(array));
//
//        // Convert the Set back to an array
//        Integer[] resultArray = uniqueSet.toArray(new Integer[0]);
//
//        // Print the array without duplicates
//        System.out.println(Arrays.toString(resultArray));


    public static void removeDuplicateElements(int[] a) {
        HashSet<Integer> set = new HashSet<>();

        for (int i : a) {
            set.add(i);
        }
        System.out.println("Array : " + set);
    }

    public static void main(String[] args) {
        int[] a = {1, 3, 4, 2, 3, 5, 3, 2, 5, 6, 2, 4, 5};
        removeDuplicateElements(a);
    }
}


