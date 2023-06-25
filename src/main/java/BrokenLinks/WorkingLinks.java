package BrokenLinks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class WorkingLinks {
    private static WebDriver driver = null;
    public static void main(String[] args) {
        String baseURL = "http://demo.guru99.com/test/newtours/";
        System.setProperty("webdriver.http.factory","jdk-http-client");
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origin=*");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        String underConsTitle = "Under Construction: Mercury Tours";
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get(baseURL);
        List<WebElement> links = driver.findElements(By.tagName("a"));
        String[] linkTexts = new String[links.size()];
        int i=0;

        //extract the link texts of each link element
        for (WebElement e: links){
            linkTexts[i]=e.getText();
            i++;
        }

        //test each link
        for (String t : linkTexts){
            driver.findElement(By.linkText(t)).click();
            if (driver.getTitle().equals(underConsTitle)){
                System.out.println("\""+ t + "\""+" is under construction");
            } else {
                System.out.println("\""+ t + "\""+" is working");
            }
            driver.navigate().back();
        }
        driver.quit();
    }
}
