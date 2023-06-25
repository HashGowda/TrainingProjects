package TestNG;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenersTest.class)
public class ListenersTest2{
    @Test
    public void sum(){
        //int sum=0;
        int a=10;
        int b=12;
        int sum=a+b;
        System.out.println(sum);
    }
    @Test
    public void testFail(){
        System.out.println("test case has been failed");
        Assert.assertTrue(false);
    }
}