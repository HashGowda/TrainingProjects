public class Palindrome {

    public static void main(String[] args) {
        int r, sum=0, t;
        int n=456;
        t=n;
        while(n>0){
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
            if (t==sum){
                System.out.println(t+ " is a palindrome");
            } else {
                System.out.println(t+ " is not a palindrome");
            }


        String s = "nitis";
        String s1="";
        for (int i=s.length()-1;i>=0;i--){
            s1=s1+s.charAt(i);
        }
        if (s1.equals(s)){
            System.out.println(s+" is a palindrome");
        } else {
            System.out.println(s+" is not a palindrome");
        }
    }
}
