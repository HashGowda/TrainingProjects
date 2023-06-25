package Dropdown;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;

public class SelectUsingList {
    public static String userName = "harishgowda_NPWHGu";
    public static String accessKey = "poVseN6zpztytRBk8Exc";
    public static final String URL = "https://"+ userName + ":" + accessKey + "@hub-cloud.browserstack.com/wd/hub";
    WebDriver driver;
    String url = "https://www.bstackdemo.com/";
    MutableCapabilities caps = new MutableCapabilities();
    HashMap<String, Object> browserstackOptions = new HashMap<>();

    @BeforeTest
    public void setUp() throws MalformedURLException, InterruptedException {
        browserstackOptions.put("browserName", "chrome");
        browserstackOptions.put("deviceName","Samsung Galaxy S22");
        browserstackOptions.put("realMobile", "true");
        browserstackOptions.put("osVersion", "12");
        caps.setCapability("bstack:options",browserstackOptions);

        System.setProperty("webdriver.http.factory", "jdk-http-client");
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origin=*");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(co);

        driver = new RemoteWebDriver(new URL(URL), caps);
        driver.manage().window().maximize();

        driver.get(url);
        Thread.sleep(2000);
    }

    @Test
    public void selectByList(){
        driver.findElement(By.xpath("//select")).click();
        List<WebElement> allOptions = driver.findElements(By.cssSelector("select option"));
        String option = "Highest to lowest";
        for (int i=0; i<allOptions.size();i++){
            if (allOptions.get(i).getText().contains(option)){
                allOptions.get(i).click();
                System.out.println("Clicked");
                break;
            }
        }
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }

}
