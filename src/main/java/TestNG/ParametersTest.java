package TestNG;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersTest {

    @Test(priority = 1)
    @Parameters({"a","b"})
    public void add(int a, int b){
        int sum=a+b;
        System.out.println("Addition="+sum);
    }

    @Test(priority = 2)
    @Parameters({"a","b"})
    public void sub(int a, int b){
        int dif=a-b;
        System.out.println("Subtraction="+dif);
    }

    @Test(priority = 3)
    @Parameters({"a","b"})
    public void mul(int a, int b){
        int mult=a*b;
        System.out.println("Multiplication:"+mult);
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("Before class");
    }

    @BeforeTest
    @Parameters("Mango")
    public void mango(String m){
        System.out.println("Fruit name:"+m);
    }

    @Parameters("Orange")
    @Test
    public void orange(String o){
        System.out.println("Fruit name:"+o);
    }
}
