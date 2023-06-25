package WebTable;

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

public class WebTableHandle {

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
    public void launch() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/html/html_tables.asp");
        Thread.sleep(2000);
        WebElement table = driver.findElement(By.xpath("//table[@id='customers']"));
        Thread.sleep(2000);

        //List<WebElement> rows = table.findElements(By.tagName("tr"));

        List<WebElement> rows = driver.findElements(By.xpath("//*[@id='customers']/tbody/tr"));
        Thread.sleep(2000);
        int rowCount = rows.size();
        System.out.println("Number of rows: "+rowCount);

        List<WebElement> columns = driver.findElements(By.xpath("//*[@id='customers']/tbody/tr[2]/td"));
        Thread.sleep(2000);
        int columnCount = columns.size();
        System.out.println("Number of columns: "+columnCount);

//        for (WebElement row:rows){
//            List<WebElement> columns = row.findElements(By.tagName("td"));
//            int columnCount = columns.size();
//            System.out.println("Number of columns: "+columnCount);
//        }
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}
