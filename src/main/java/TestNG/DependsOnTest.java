package TestNG;

import org.testng.annotations.Test;

public class DependsOnTest {

    @Test(dependsOnMethods = "register")
    void login(){
        System.out.println("Login");
    }

    @Test
    void register(){
        System.out.println("Registering");
    }


    @Test(dependsOnMethods = "login")
    void logout(){
        System.out.println("Logout");
    }
}