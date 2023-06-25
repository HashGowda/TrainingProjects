import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class UploadDoc {

    public WebDriver driver;

    @BeforeClass
    public void uploadDownload() {
        /*System.setProperty("webdriver.http.factory", "jdk-http-client");
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origin=*");
        ChromeDriver driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        driver.manage().window().maximize();*/

        WebDriverManager.chromedriver().setup();
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(co);
        driver.manage().window().maximize();
    }

    @Test
    public void upload() {
        driver.get("https://demo.guru99.com/test/upload/");
        WebElement upload = driver.findElement(By.xpath("//input[@id='uploadfile_0']"));
        upload.sendKeys("E:\\Software Testing\\Notes\\LinkedIN\\Api Quick Reference.pdf");

        driver.findElement(By.xpath("//input[@id='terms']")).click();

        driver.findElement(By.xpath("//button[@id='submitbutton']")).click();

        System.out.println("File has been uploaded successfully");

    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
