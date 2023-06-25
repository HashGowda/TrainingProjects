package Dropdown;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class DropdownOptions {
    public WebDriver driver;

    @Test
    public void launch() {
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origin=*");
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver(co);
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/select-menu");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Select s = new Select(driver.findElement(By.id("oldSelectMenu")));
        // getting the list of options in the dropdown with getOptions()
        List<WebElement> op = s.getOptions();
        System.out.println("Dropdown list are : ");
        for (WebElement options:op) {
            System.out.println(options.getText());
        }
        driver.quit();
    }
}
