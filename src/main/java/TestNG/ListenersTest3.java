package TestNG;

import org.testng.annotations.Test;

public class ListenersTest3 {

    @Test
    public void loginWithEmail() {
        System.out.println("Login with email");
    }

    @Test
    public void loginWithFacebook() {
        System.out.println("Login with facebook");
    }
}
