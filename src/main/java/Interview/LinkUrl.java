import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LinkUrl {

    static WebDriver driver;
    public static String getLinkUrl(WebDriver driver, String linkText){
        WebElement linkElement = driver.findElement(By.linkText(linkText));
        if (linkElement!=null){
            return linkElement.getAttribute("href");
        }
        return null;
    }

    public static void main(String[] args) {
        /*System.setProperty("webdriver.http.factory", "jdk-http-client");
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origin=*");
        ChromeDriver driver = new ChromeDriver(co);
        WebDriverManager.chromedriver().setup();
        driver.manage().window().maximize();*/

        WebDriverManager.chromedriver().setup();
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(co);
        driver.manage().window().maximize();
        driver.get("https://en.wikipedia.org/wiki/Main_Page");

        String linkText = "click here";
        String linkUrl = getLinkUrl(driver, linkText);

        System.out.println("URL: "+linkUrl);

        driver.quit();
    }

}
