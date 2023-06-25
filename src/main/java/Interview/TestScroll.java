package Interview;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestScroll {

    public WebDriver driver;

    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origin=*");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(co);
    }

    @Test
    public void scrollDown() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get("http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");
        Thread.sleep(2000);

        // Create instance of Javascript executor
        JavascriptExecutor js = (JavascriptExecutor) driver;

        //Identify the WebElement which will appear after scrolling down
        WebElement element = driver.findElement(By.xpath("//div[@id='content-8']//p[2]"));
        Thread.sleep(2000);

        //now execute query which actually will scroll until that element is not appeared on page
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(2000);

        //Extract the text and verify
        System.out.println(element.getText());
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}
