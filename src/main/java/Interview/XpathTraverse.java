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

public class XpathTraverse {

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
    public void click() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get("https://www.google.com/search?q=lady+gaga&rlz=1C1GIVA_enIN1003IN1003&ei=HaBsZPCoKri74-EPn-SjCA&ved=0ahUKEwiwq7Txp4v_AhW43TgGHR_yCAEQ4dUDCA8&uact=5&oq=lady+gaga&gs_lcp=Cgxnd3Mtd2l6LXNlcnAQAzIKCC4QigUQsQMQQzILCAAQgAQQsQMQgwEyBQgAEIAEMggIABCABBCxAzIFCC4QgAQyBQgAEIAEMggIABCABBCxAzIFCAAQgAQyBQgAEIAEMgUIABCABDIYCC4QigUQsQMQQxCXBRDcBBDeBBDfBBgBOgcILhCKBRBDOhEILhCABBCxAxCDARDHARDRAzoLCAAQigUQsQMQgwE6DgguEIAEELEDEMcBENEDOggIABCKBRCxAzoVCC4QigUQQxCXBRDcBBDeBBDfBBgBOgcIABCKBRBDOgsILhCKBRCxAxCDAToNCC4QigUQsQMQ1AIQQzoLCC4QgAQQsQMQgwE6CAgAEIAEEMkDOggIABCKBRCSAzoOCC4QgAQQsQMQgwEQ1AI6CAguEIAEELEDOgsILhCABBCxAxDUAjoLCC4QgAQQxwEQrwE6BwgAEIAEEAo6DQgAEIAEELEDEIMBEAo6CggAEIAEELEDEAo6BwguEIAEEApKBAhBGABQAFiMGWCPG2gCcAF4AIABoQGIAaQJkgEDNC43mAEAoAEBwAEB2gEGCAEQARgU&sclient=gws-wiz-serp");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//div[@class='DBLJSb']")).click();

        //Using Xpath axes - following
        driver.findElement(By.xpath("//div[@class='j2antf IZfnjc']//following::div[@class='DBLJSb']")).click();

        driver.findElement(By.xpath("//div[@class='j2antf IZfnjc']//following::div[@class='u96bed GTERze']")).click();

        driver.findElement(By.xpath("//div[@class='j2antf IZfnjc']//following::span[@class='zwVERd iJddsb']")).click();

        driver.findElement(By.xpath("//div[@class='j2antf IZfnjc']//following::a[@class='sgySOc']")).click();

        Thread.sleep(2000);

        System.out.println("Clicked successfully");
    }


    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
