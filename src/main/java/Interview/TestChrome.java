import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestChrome {
    WebDriver driver;
    @Test
    public void launch() throws InterruptedException {
        /*System.setProperty("webdriver.http.factory","jdk-http-client");
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origin=*");
        driver = new ChromeDriver(co);
        WebDriverManager.chromedriver().setup();*/

        WebDriverManager.chromedriver().setup();
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(co);
        driver.manage().window().maximize();




        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


        driver.findElement(By.name("q")).sendKeys("Automation Testing");
        driver.findElement(By.name("btnK")).click();
        String actualTitle = driver.getTitle();
        String expectedTitle = "Automation Testing - Google Search";
        Assert.assertEquals(expectedTitle,actualTitle);
        driver.close();
    }
}
