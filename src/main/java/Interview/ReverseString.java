import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("Reverse of a string "+str+" is ");
        int l = str.length();
        while (l>0){
            System.out.print(str.charAt(l-1));
            l--;
        }
    }
}
