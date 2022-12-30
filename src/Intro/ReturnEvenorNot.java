package Intro;

public class ReturnEvenorNot {
    boolean even (int i){
        if(i%2==0){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        ReturnEvenorNot r= new ReturnEvenorNot();
        boolean a=r.even(135);
        System.out.println(a);
    }
}
