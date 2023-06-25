public class SecondHighestElementInArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 2, 6};

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int j : arr) {
            if (j > max) {
                secondMax = max;
                max = j;
            } else if (j > secondMax && j != max) {
                secondMax = j;
            }
        }
        System.out.println("Second highest element : " + secondMax);

        System.out.println();

        int []a = {3,6,2,7,8,5};

        int maxi = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;

        for (int i:a){
            if (i>maxi){
                secMax = maxi;
                maxi=i;
            } else if (i>secMax && i!=maxi) {
                secMax=i;
            }
        }
        System.out.println("Second highest element : "+secMax);
    }
}
