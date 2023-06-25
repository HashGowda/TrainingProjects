package TestNG;

import org.testng.annotations.*;

public class SimpleTest {

    @BeforeSuite
    void beforeSuite(){
        System.out.println("Before suite");
    }
    @BeforeTest
    void beforeTest(){
        System.out.println("Before test");
    }
    @BeforeClass
    void beforeClass(){
        System.out.println("Before class");
    }
    @BeforeMethod
    void beforeMethod(){
        System.out.println("Before method");
    }
    @Test
    void test1(){
        System.out.println("Test1");
    }
    @Test
    void test2(){
        System.out.println("Test2");
    }
    @AfterMethod
    void afterMethod(){
        System.out.println("After method");
    }
    @AfterClass
    void afterClass(){
        System.out.println("After class");
    }
    @AfterTest
    void afterSTest(){
        System.out.println("After test");
    }
    @AfterSuite
    void afterSuite(){
        System.out.println("After suite");
    }
}
