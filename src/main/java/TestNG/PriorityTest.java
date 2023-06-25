package TestNG;

import org.testng.annotations.Test;

public class PriorityTest {

    @Test(priority = 1)
    void test1() {
        System.out.println("Test1");
    }

    @Test(priority = 2)
    void test2() {
        System.out.println("Test2");
    }

    @Test(priority = 0)
    void test3() {
        System.out.println("Test3");
    }

    @Test(priority = -1)
    void test4() {
        System.out.println("Test4");
    }

    @Test(priority = -2)
    void test5() {
        System.out.println("Test5");
    }

    @Test(enabled = false)
    void test6() {
        System.out.println("Test6");
    }

    @Test(invocationCount = 2)
    void test7() {
        System.out.println("Test7");
    }

    @Test(alwaysRun = true)
    void test8() {
        System.out.println("Test8");
    }
}
