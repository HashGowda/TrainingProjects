package Dropdown;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SelectUsingSendkeys {
    public WebDriver driver;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origin=*");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(co);
    }


    @Test
    public void launch() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get("https://www.bstackdemo.com/");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//div[@class='sort']//select")).sendKeys("highestprice");
        Thread.sleep(2000);
        System.out.println("Selected ");


    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
