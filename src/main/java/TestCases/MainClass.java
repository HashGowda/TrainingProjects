package TestCases;

import Pages.BaseClass;
import Pages.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class MainClass extends BaseClass {
    public WebDriver driver;
    HomePage hm;

    @BeforeTest
    public void setDriver(){
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://in.pinterest.com/");
    }

    @Test
    public void verifyLogin() throws IOException {
        driver = initializeDriver();
        hm = new HomePage(driver);

        WebElement loginBtn = hm.clickOnLogin();
        loginBtn.click();

        WebElement email = hm.typeEmail();
        email.sendKeys("testuser@gmail.com");

        WebElement password = hm.typePassword();
        password.sendKeys("testuser@gmail.com");

        WebElement button = hm.clickButton();
        button.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(hm.clickOnLogin())).click();

        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait1.until(ExpectedConditions.visibilityOf(hm.clickButton())).click();
    }

    @Test
    public void testCase() {

        WebElement email = hm.typeEmail();
        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait2.until(ExpectedConditions.visibilityOf(email));
        email.sendKeys("testuser@gmail.com");

        WebElement password = hm.typePassword();
        WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait3.until(ExpectedConditions.elementToBeSelected(password));
        password.sendKeys("testuser@123");
        hm.clickButton();
    }


    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}
