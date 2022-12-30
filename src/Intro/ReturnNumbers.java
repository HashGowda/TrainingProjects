package Intro;

//To invoke the current class method

/*
public class ReturnNumbers {
    void add(){
        int a=10;
        int b=20;
        int sum=a+b;
        System.out.println(sum);
        multiply();
    }

    void multiply(){
        int a=3;
        int b=5;
        int mult=a*b;
        System.out.println(mult);
       // add();
    }

    public static void main(String[] args) {
        ReturnNumbers r=new ReturnNumbers();
        r.add();
    }
}

 */

//To invoke the current class constructor

/*
public class ReturnNumbers {
    ReturnNumbers(){
        System.out.println("Default constructor");
    }

    ReturnNumbers(String city){
        this();
        System.out.println("City:"+city);
    }

    public static void main(String[] args) {
        ReturnNumbers r=new ReturnNumbers("Mysore");
    }
}

 */

//Calling parameterized constructor from default constructor

/*

public class ReturnNumbers {
    ReturnNumbers(){
        this("Mysore");
        int age=12;
        String name="King";
        System.out.println("Age="+age+", "+"Name="+name);
    }

    ReturnNumbers(String city){
        System.out.println("City is "+city);
    }

    public static void main(String[] args) {
        ReturnNumbers r=new ReturnNumbers();
    }
}

 */

//Calling default constructor from parameterized constructor

/*

public class ReturnNumbers {
    ReturnNumbers(){
        int id=12;
        String coll="SJCIT";
        System.out.println("ID:"+id+", "+"CollegeName:"+coll);
    }

    ReturnNumbers(String city){
        this();
        System.out.println("City:"+city);
    }

    public static void main(String[] args) {
        ReturnNumbers r=new ReturnNumbers("Mysore");
    }
}

 */

//Return Numbers

/*
public class ReturnNumbers {
  int[]printNumbers(){
      int a[]=new int[11];
      int j=0;
      for(int i=20;i<=30;i++){
          a[j]=i;
          j++;
      }
      return a;
  }

  int[] retrunOdd(){
      int c[]=new int[5];
      int k=0;
      for(int i=0;i<10;i++){
          if (i%2==1){
              c[k]=i;
              k++;
          }
      }
      return c;
  }

    public static void main(String[] args) {
        ReturnNumbers r=new ReturnNumbers();
        int b[]=r.printNumbers();
        for(int k:b){
            System.out.println(k);
        }

        System.out.println("**********");

        int l[]=r.retrunOdd();
        for(int m:l){
            System.out.println(m);
        }
    }
}

 */

import com.sun.org.apache.regexp.internal.RE;

public class ReturnNumbers {
    int sum(int a, int b){
        int add=a+b;
        return add;
    }

    void sub(int a, int b){
        int diff=a-b;
        System.out.println(diff);
    }

    int multiply(int a, int b){
        int mult=a*b;
        return mult;
    }

    void division(int a, int b){
        int div=a/b;
        System.out.println(div);
    }

    public static void main(String[] args) {
        ReturnNumbers r=new ReturnNumbers();
        int op1=r.sum(20,30); //50
        int op2=r.multiply(5,2); //10
        r.sub(op1,op2); //40
        r.division(op1,op2); //5
    }
}




