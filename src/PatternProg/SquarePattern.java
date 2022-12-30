package PatternProg;

public class SquarePattern {
    public static void main(String[] args) {

//Square pattern
        /*

        int n=3;
        for(int i=0;i<=n;i++){
            for (int j=0;j<=n;j++){
                if(i==0||j==0||i==n||j==n){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

         */

//Pyramid star pattern
/*


        int n = 3;
        for (int i = 0; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

 */


        //Right Triangle Star Pattern
        /*

        int n = 4;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

         */

        //Left Triangle Star Pattern
        /*

        int n = 4;
        for (int i = 0; i < n; i++) {
            for (int j =2*(n-i); j >=0; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

         */

        //Downward triangle star pattern

        int n = 4;
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
