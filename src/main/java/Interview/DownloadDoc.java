import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;

public class DownloadDoc {

    public WebDriver driver= null;

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
        public void download () throws InterruptedException {

            driver.get("https://chromedriver.storage.googleapis.com/index.html?path=79.0.3945.36/");
            WebElement downloadButton = driver.findElement(By.xpath("//a[normalize-space()='chromedriver_win32.zip']"));
            downloadButton.click();
            Thread.sleep(2000);

        }

        @Test
        public void checkDownloadFile() throws InterruptedException {
        String path = "C:\\Downloads";
        String file = "chromedriver_win32.zip";

        File downloadedFile = new File(path+File.separator+file);
        boolean isFileDownloaded = downloadedFile.exists();

        if (isFileDownloaded){
            System.out.println("File was downloaded successfully");
        } else {
            System.out.println("File download failed");
        }
        Thread.sleep(2000);
        }

        @AfterClass
    public void tearDown(){
        driver.quit();
        }
    }

