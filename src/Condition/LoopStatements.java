package Condition;

public class LoopStatements {
    public static void main(String[] args) {

        //for loop - sum of first 10 numbers
        /*

        int sum=00;
        for(int i=1;i<=10;i++){
            sum+=i;
        }
        System.out.println("Sum of first 10 numbers is "+sum);
    }
}

         */

        //for each loop
        /*

String[]s={"Java", "Python","Testing","Automation","Manual"};
        System.out.println("Printing the content of the array names:\n");
        for (String s1:s){
            System.out.println(s1);
        }
    }
}

         */

        //for loop 3 - Reverse printing
        /*

        for(int i=10;i>=1;i--){
            System.out.println(i);
        }
    }
}

         */

        //for loop 4 - Even number
/*

        for(int i=1;i<=10;i++){
            if(i%2==0){
                System.out.println("Even number: "+i);
            }
        }
    }
}

 */

        //for loop 5 - Odd number
/*

        for(int i=1;i<=10;i++){
            if(i%2==1){
                System.out.println("Odd number: "+i);
            }
        }
    }
}

 */

        //Nested for loop - Square start pattern
        /*

        for(int i=0;i<=4;i++){
            for(int j=1;j<=4;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

         */

        //While loop - Printing the first 10 numbers
        /*

        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }
}

         */

        //While loop - Printing first 10 even numbers
/*

        int i=0;
        System.out.println("Printing the first 10 even numbers:\n");
        while(i<=10) {
            System.out.println(i);
            i+=2;
        }
    }
}

 */

        //While loop - Printing first 10 odd numbers
/*

        int i=1;
        System.out.println("Priting the first 10 odd numbers:\n");
        while(i<=10){
            System.out.println(i);
            i+=2;
        }
    }
}

 */

        //While loop - Reverse printing
        /*

        int j=10;
        while(j>=1){
            System.out.println(j);
            j--;
        }
    }
}

         */

        //While loop - Even numbers
/*

        int i=0;
        while(i<=10){
            if(i%2==0){
                System.out.println("Even number: "+i);
            }
            i++;
        }
    }
}

 */

        //While loop - Odd numbers
/*

        int i=0;
        while(i<=10){
            if(i%2==1){
                System.out.println("Odd number: "+i);
            }
            i++;
        }
    }
}

 */

        //Do-While loop - Printing the first 10 numbers
/*

        int i=1;
        System.out.println("Printing the first 10 numbers:\n");
        do {
            System.out.println(i);
            i++;
        } while (i<=10);
    }
}

 */

        //Do-While loop - Printing the first 10 Even numbers
/*

        int i=0;
        do {
            if (i%2==0){
                System.out.println("Even number: "+i);
            }
            i++;
        } while(i<=10);
        }
    }

 */

        //Do-While loop - Printing the first 10 Odd numbers
/*

        int i=1;
        do {
            if (i%2==0){
                System.out.println("Odd number: "+i);
            }
            i++;
        } while(i<=10);
    }
}

 */

        //Do-While loop - Reverse printing
/*

        int i = 10;
        System.out.println("Printing the first 10 number sin descending numbers:");
        do {
            System.out.println(i);
            i--;
        } while (i >= 1);
    }
}

 */

//Break statement
/*

        for(int i=1;i<=10;i++){
            if(i==6){
                break;
            }
            System.out.println(i);
        }
    }
}

 */

        //Continue statement

        for(int i=1;i<=10;i++){
            System.out.println(i);
            if(i==6){
                continue;
            }
        }
    }
}
