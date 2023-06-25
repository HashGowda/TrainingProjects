package Constructors;

public class DefParamCon {
    DefParamCon(){
        String name="VK";
        String city="Delhi";
        System.out.println("Name:"+name);
        System.out.println("city:"+city);
    }

    DefParamCon(String name, String city, int age){
        System.out.println("Name:"+name);
        System.out.println("City:"+city);
        System.out.println("age:"+age);
    }

    DefParamCon(String branch){
        System.out.println("Branch:"+branch);
    }

    void display(){
        int age=12;
        System.out.println("Age:"+age);
    }
    void addition(int a, int b){
        int sum=a+b;
        System.out.println("Sum="+sum);
    }

    public static void main(String[] args) {
        DefParamCon dp = new DefParamCon();
        DefParamCon dpc= new DefParamCon("Mechanical");
        dpc.display();
        dpc.addition(12,45);

        DefParamCon dcp = new DefParamCon("VK","Bengaluru",34);
    }
}
