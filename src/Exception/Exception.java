package Exception;

/*

public class Exception {
    public static void main(String[] args) {
        try {
            int data = 100 / 0;
        } catch (ArithmeticException e) {
            System.out.println(e);
            System.out.println("Rest of the code");
        }
    }
}

 */

//As displayed in the above example, the rest of the code is executed, i.e., the rest of the code statement is printed.

/*

public class Exception {
    public static void main(String[] args) {
        try {
            int data = 100 / 0;
            System.out.println("Rest of the code");
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}

 */

/*

public class Exception {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(a + b);
        int c = 20;
        int d = 10;
        System.out.println(c - d);
        int g = 10;
        int f = 10;
        System.out.println(g * f);
        try {
            int x = 10;
            int y = 0;
            System.out.println(x / y);
        } catch(ArithmeticException e){
            e.printStackTrace();
            System.out.println("Exception is handled");
    }
        int i=100; int j=200;
        System.out.println(i+j);
        int k=200; int l=100;
        System.out.println(k-l);
}
    }

 */

/*

public class Exception {
    public static void main(String[] args) {
        try{
            int a=10/0;
        } catch (java.lang.Exception e){
            System.out.println("Catch block is executed");
            e.printStackTrace();
        }
        int b=10;
        System.out.println(b);
    }
}

 */

/*

public class Exception {
    void add(){
        try{
            int []a={1,2,3,4};
            System.out.println(a[4]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception is handled");
            e.printStackTrace();
        }
    }
    void display(){
        try{
            String s=null;
            System.out.println(s.length());
        } catch (NullPointerException e){
            System.out.println("Exception2 is handled");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Exception e2=new Exception();
        e2.add();
        e2.display();
    }
}

 */

/*
 public class Exception {
    public static void main(String[] args) {
        try {
            int i = 10 / 1;
            System.out.println(i);
            int a[] = {1, 2, 3, 4, 5};
            System.out.println(a[2]);
            String s = null;
            System.out.println(s.length());
        }catch (ArithmeticException e){
            System.out.println("Arithmetic Exception");
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        }catch (java.lang.Exception e){
            System.out.println("Parent Exception");
        }
        int b=10;
        System.out.println(b);
    }
}

 */

/*

public class Exception {
    public static void main(String[] args) {
        try{
            int a[]={1,2,3,4,5};
            System.out.println(a[3]);
            int i=10/0;
            System.out.println(i);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        } catch (java.lang.Exception e){
            System.out.println("Parent exception");
        }
        int b=10;
        System.out.println(b);
    }
}

 */

/*

public class Exception {
    public static void main(String[] args) {
        //if dont specify the exception it will catch parent exception
        try{
            String s=null;
            System.out.println(s.length());
        }catch (ArithmeticException e){
            System.out.println("ArithmeticException");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        } catch (java.lang.Exception e){
            System.out.println("Parent Exception");
        }
        int b=10;
        System.out.println(b);
    }
}

 */

/*

public class Exception {
    public static void main(String[] args) {
        try{
            try{
                int a[]={1,2,3};
                System.out.println(a[5]);
            } catch (ArrayIndexOutOfBoundsException e){
                e.printStackTrace();
                System.out.println("ArrayIndexOutOfBoundsException");
            } try{
                String s=null;
                System.out.println(s.length());
            }catch (ArithmeticException e){
                System.out.println(e);
                System.out.println("Arithmetic Exception");
            }
            } catch (ArithmeticException e){
            e.printStackTrace();
        } catch (java.lang.Exception e){
            e.printStackTrace();
            System.out.println("Handled parent exception");
        }
        int b=10;
        System.out.println(b);
    }
}

 */

/*

public class Exception {
    public static void main(String[] args) {
        try {
            try {
                try {
                    String a = "Messi";
                     System.out.println(a.length());
                    int i[] = {1, 2, 3};
                    System.out.println(i[5]);
                } catch (ArithmeticException e) {
                    System.out.println("ArithmeticException: inner catch block 2");
                }
            } catch (ArithmeticException e) {
                System.out.println("ArithmeticException: inner catch block 1");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("ArrayIndexOutOfBoundsException: outer catch block");
        } catch (java.lang.Exception e) {
            System.out.println("Parent exception: outer try block");
        }
    }
}

 */


public class Exception {
    public static void main(String[] args) {
        try{
            int a=10/0;
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Arithmetic exception handled");
        } finally {
            System.out.println("Finally block is always executed");
        }
        int b=10;
        System.out.println(b);
    }
}

