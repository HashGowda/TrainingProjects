package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    public WebDriver driver;

    By LogIn = By.xpath("//*[contains(@class,'tBJ dyH iFc sAJ xnr tg7 H2s')]");
    By Email = By.xpath("//input[@id='email']");
    By Password =By.xpath("//input[@id='password']");
    By LoginBtn = By.xpath("//button[@type='submit']");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public WebElement clickOnLogin(){
        return driver.findElement(LogIn);
    }

    public WebElement typeEmail(){
        return driver.findElement(Email);
    }

    public WebElement typePassword(){
        return driver.findElement(Password);
    }

    public WebElement clickButton(){
        return driver.findElement(LoginBtn);
    }

}
