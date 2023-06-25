package PracticeTests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class LaunchBrowser {
    WebDriver driver;

    @Test
    public void launch(){
        System.setProperty("webdriver.http.factory","jdk-http-client");
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origin=*");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.findElement(By.name("q")).sendKeys("Automation Testing");
        driver.findElement(By.name("btnK")).click();
        String actualTitle = driver.getTitle();
        String expectedTitle = "Automation Testing - Google Search";
        Assert.assertEquals(expectedTitle, actualTitle);
        driver.close();
    }
}
