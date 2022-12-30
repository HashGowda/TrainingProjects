package Intro;

public class LargeNumber {
    public static void main(String[] args) {
       int max=0;
       int a[]={1200,30423,500,6843,37845};
       for(int i=0;i<a.length;i++){
           if (a[i]>max){
               max=a[i];
           }
       }
        System.out.println("Largest number is "+max);
    }
}
