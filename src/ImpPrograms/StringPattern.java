package ImpPrograms;

public class StringPattern {
    public static void main(String[] args) {

        //Reverse triangle pattern
        /*

        char c[]={'P','R','O','G','R','A','M'};
        for(int i=c.length-1;i>=0;i--){
            for(int j=0;j<=i;j++){
                System.out.print(c[j]+" ");
            }
            System.out.println();
        }
    }
}

         */

        //Square pattern
/*

        char c[] = {'P', 'R', 'O', 'G', 'R', 'A', 'M'};
        for(int k=0;k<c.length;k++){
            for(int l=0;l<c.length;l++){
                System.out.print(c[l]+" ");
            }
            System.out.println();
        }
    }
}

 */

        //Right angle triangle pattern


        char c[] = {'P', 'R', 'O', 'G', 'R', 'A', 'M'};
        for(int i=0;i<c.length;i++){
            for(int j=0;j<=i;j++){
                System.out.print(c[j]+" ");
            }
            System.out.println();
        }
    }
}