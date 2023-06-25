package Dropdown;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Scanner;

public class DirectLocator {
    public WebDriver driver;

    @BeforeTest
    public void setUp(){
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origin=*");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(co);
        driver.manage().window().maximize();
    }

    @Test
    public void launch() throws InterruptedException {
        driver.get("http://autopract.com/selenium/dropdown4/");
        driver.findElement(By.xpath("//button[@title='Afghanistan']")).click();
        Thread.sleep(2000);
//        Scanner scanner = new Scanner(System.in);
//        String country = scanner.nextLine();
        String country = "India";
        driver.findElement(By.xpath("//span[normalize-space()='" + country +"']")).click();
        Thread.sleep(2000);
        System.out.println("Selected country is "+country);
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}
