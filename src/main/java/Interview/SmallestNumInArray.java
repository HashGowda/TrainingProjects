public class SmallestNumInArray {
    public static void main(String[] args) {

        int numbers[] = {4, 5, 2, 6, 8,0};

        int smallest =numbers[0] ;

        for (int i=1;i<numbers.length;i++){
            if (numbers[i]<smallest){
                smallest=numbers[i];
            }
        }

        System.out.println( "The smallest number is "+smallest);

    }
}
