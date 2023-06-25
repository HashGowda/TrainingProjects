package Dropdown;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SelectHover {
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
        driver.get("https://www.browserstack.com/");
        Thread.sleep(2000);

        WebElement dropDown = driver.findElement(By.xpath("//span[@class='nav_item_name' and contains(text(), 'Developers')]"));
        Thread.sleep(2000);
        Actions act = new Actions(driver);
        Thread.sleep(2000);
        act.moveToElement(dropDown).perform();
        System.out.println("Moved to element " + dropDown.getText());
        Thread.sleep(2000);
        String option = "Support";
        WebElement customOption = driver.findElement(By.xpath("//li[@class='developers-menu-control']/a[contains(text(), '" + option + "')]"));
        Thread.sleep(2000);

        try {
            customOption.click();
            System.out.println("Option selected");
            Thread.sleep(2000);
        } catch (StaleElementReferenceException e) {
            e.printStackTrace();
        }

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
