package Dropdown;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class DropDownWithoutSelect {
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

        driver.findElement(By.xpath("//div[@class='sort']//select")).click();
        List<WebElement> allOptions = driver.findElements(By.cssSelector("select option"));

        String option = "Lowest to highest";

        for (int i = 0; i < allOptions.size(); i++) {
            if (allOptions.get(i).getText().contains(option)) {
                Thread.sleep(2000);
                allOptions.get(i).click();
                System.out.println("Selected option is " + allOptions.get(i).getText());
                break;
            }
        }

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
