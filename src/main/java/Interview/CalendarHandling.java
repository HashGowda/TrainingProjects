package Interview;

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

public class CalendarHandling {

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
        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
        Thread.sleep(2000);

        //click on date picker so that we can get the calendar in view
        driver.findElement(By.id("datepicker")).click();
        System.out.println("Clicked on calendar");

        //this will find all matching nodes in calendar
        List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
        //Thread.sleep(2000);

        //now we will iterate all values and will capture the text. We will select when date is 28
        for (WebElement ele:allDates){
            String date = ele.getText();
            Thread.sleep(2000);

            //once date is 28 then click and break
            if (date.equalsIgnoreCase("28")){
                ele.click();
                System.out.println("Date: "+ele.getText());
                break;
            }
        }
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}
