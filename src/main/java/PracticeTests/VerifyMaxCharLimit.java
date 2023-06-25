package PracticeTests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class VerifyMaxCharLimit {
    public WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        driver.manage().window().maximize();
        driver.get("https://www.toolsqa.com/selenium-training/#enroll-form");
        Thread.sleep(2000);

        //location the firstname web element
        WebElement firstName = driver.findElement(By.id("first-name"));

        Thread.sleep(2000);
        firstName.sendKeys("Makeseleniumeasy");

        Thread.sleep(2000);
        String typedValue = firstName.getAttribute("value");
        System.out.println("Attribute:"+typedValue);

        Thread.sleep(2000);
        int size = typedValue.length();
        System.out.println("Size:"+size);

        if (size==10){
            System.out.println("Maximum character functionality is working fine");
        } else {
            System.out.println("No limit is set");
        }

        firstName.clear();

        Thread.sleep(2000);
        String maxLengthDefined = firstName.getAttribute("maxlength");
        System.out.println("Max length:"+maxLengthDefined);

        if (maxLengthDefined==null){
            System.out.println("No limit is set");
        } else {
            if (maxLengthDefined.equals("10")){
                System.out.println("Maximum character limit is set as expected");
            }
        }

        driver.quit();
    }
}
