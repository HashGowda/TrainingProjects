package Pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseClass {
    public WebDriver driver;
    public Properties property;
    public String url= "qwerty";


    public WebDriver initializeDriver() throws IOException {


        String BrowserName = property.getProperty("browser");

        if(BrowserName.equals("chrome"))
        {
            System.setProperty("webdriver.http.factory", "jdk-http-client");
            ChromeOptions co = new ChromeOptions();
            co.addArguments("--remote-allow-origins=*");
            driver = new ChromeDriver();
            WebDriverManager.chromedriver().setup();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            driver.get("https://in.pinterest.com/");

        }
        else if(BrowserName.equals("firefox"))
        {
            driver = new FirefoxDriver();
        }
        else if(BrowserName.equals("IE"))
        {
            //Executes IE
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        return driver;
    }

    public WebDriver verifyPage() {

        driver.get(url);
        String Expected = driver.findElement(By.xpath("//*[contains(@class,'lH1 dyH iFc H2s bwj c8S zDA')]")).getText();
        String Actual = "Sign in to start your session";
        Assert.assertEquals(Actual, Expected);
        System.out.println("Homepage is displayed");
        return driver;
    }
}
