package Condition;

public class ControlStatements {
    public static void main(String[] args) {

        //Control Statement 1
        /*

        int marks=74;
        if((marks>=70) && (marks<=100)){
            System.out.println("FCD");
        } else if((marks>=60)&&(marks<70)){
            System.out.println("FC");
        } else if ((marks>=50)&&(marks<60)) {
            System.out.println("SC");
        }
    }
}

         */

        //Control Statement 2 if and else statement
/*

        int a = 10;
        int b = 25;
        if (a + b > 30) {
            System.out.println(a+b+" Greater than 30");
        } else {
            System.out.println(a+b+" Less than 30");
        }
    }
}

 */

//Control Statement 3 if-else ladder statement
        /*

        String city="Bengaluru";
        if(city=="Delhi"){
            System.out.println("City is Delhi");
        } else if (city=="Noida") {
            System.out.println("City id Noida");
        } else if(city=="Mumbai"){
            System.out.println("City is Mumbai");
        } else {
            System.out.println("City is "+city);
        }
    }
}

         */

        //Control Statement 4 Nested if statement

        String address = "Bengaluru, Karnataka";
        if(address.endsWith("India")){
            if(address.contains("Delhi")){
                System.out.println("Address is Delhi, India");
            } else if (address.contains("Meerut")) {
                System.out.println("Address is Meerut, India");
            } else {
                System.out.println(address.split(",",0));}
            } else {
                System.out.println("You're not living in Karnataka");
            }
        }
    }
