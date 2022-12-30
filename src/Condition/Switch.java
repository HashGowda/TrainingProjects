package Condition;

public class Switch {
    public static void main(String[] args) {

        //Switch statement 1
        /*

        int marks=70;
        switch (marks){
            case 70:
                System.out.println("FCD");
                break;
            case 60:
                System.out.println("FC");
                break;
        }
    }
}

         */


//Switch statement 2

        int num = 2;
        switch (num) {
            case 0:
                System.out.println("Number is 0");
                break;
            case 1:
                System.out.println("Number is 1");
                break;
            default:
                System.out.println("Number is "+num);
        }
    }
}