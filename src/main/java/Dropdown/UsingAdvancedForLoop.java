package Dropdown;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class UsingAdvancedForLoop {
    public WebDriver driver;

    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origin=*");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(co);
        driver.manage().window().maximize();
    }

    @Test
    public void launch() {
        driver.get("http://autopract.com/selenium/dropdown4/");

        List<WebElement> countryList = driver.findElements(By.xpath("//div[@role='combobox']"));
        for (WebElement country : countryList) {
            if (country.getText().contains("India")) {
                country.click();
            }
        }

    }


    @AfterTest
    public void tearDown() {
        driver.quit();
    }

}
