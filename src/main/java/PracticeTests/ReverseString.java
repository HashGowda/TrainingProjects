package PracticeTests;

public class ReverseString {
    void reverse(){
        String s="Virat";
        String r="";
        for (int i=s.length()-1;i>=0;i--){
            r=r+s.charAt(i);
        }
        System.out.println("Reversed string:"+r);
    }

    void reverseByChar(){
        String n="Kohli";
        String m="";
        char c[]=n.toCharArray();
        for (int i=n.length()-1;i>=0;i--){
            m=m+n.charAt(i);
        }
        System.out.println("Reversed string:"+m);
    }


    public static void main(String[] args) {
        ReverseString rev = new ReverseString();
        rev.reverse();
        rev.reverseByChar();
    }
}
