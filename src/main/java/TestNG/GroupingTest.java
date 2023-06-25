package TestNG;

import org.testng.annotations.Test;

public class GroupingTest {

    @Test(groups = {"Sanity"})
    public void signUp() {
        System.out.println("Signup Test");
    }

    @Test(groups = {"Smoke", "Regression"})
    public void register() {
        System.out.println("Register test");
    }

    @Test(groups = {"Smoke"})
    public void signIn() {
        System.out.println("Signin test");
    }
}
