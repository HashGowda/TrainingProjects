package ImpPrograms;

class Palindrome {

    /*

    public static void main(String[] args) {
        int r,sum=0,temp;
        int n=454;

        temp=n;
        while(n>0){
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        if(temp==sum){
            System.out.println("Number is palindrome");
        } else{
            System.out.println("Number is not plaindrome");
        }
    }
}

     */

    public static void main(String[] args) {
        String s = "nitin";
        String s1 = "";
        int l=s.length();
        for (int i = l - 1; i >= 0; i--) {
            s1 = s1 + s.charAt(i);
        }
        if (s1.equals(s)) {
            System.out.println("It is a palindrome");
        } else {
            System.out.println("It is not a palindrome");
        }
    }
}