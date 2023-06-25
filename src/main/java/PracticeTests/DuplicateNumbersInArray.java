package PracticeTests;

public class DuplicateNumbersInArray {
    public static void main(String[] args) {
        int a[]={2,3,4,5,1,6,7,4,2,1,5,7,8};
        for (int i=0;i<a.length;i++){
            for (int j=i+1;j<a.length;j++){
                if (a[j]==a[i]){
                    System.out.print(a[i]+" ");
                }
            }
        }
    }
}
