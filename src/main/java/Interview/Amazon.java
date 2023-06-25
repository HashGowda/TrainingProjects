import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amazon {

public WebDriver driver;

    @BeforeTest
    public void setUp() {
        /*System.setProperty("webdriver.http.factory", "jadk-http-client");
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origin");
        WebDriver driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        driver.manage().window().maximize();*/

        WebDriverManager.chromedriver().setup();
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(co);
        driver.manage().window().maximize();
    }


    @Test
    public void clickOnMobile() throws InterruptedException {

        // Open the Amazon website
        driver.get("https://www.flipkart.com/");
        Thread.sleep(2000);

        // Search for the product "Mobiles"
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("Mobiles");
        searchBox.submit();
        Thread.sleep(2000);

        // Click on "Mobiles under 20000"
        WebElement mobilesUnder20000 = driver.findElement(By.linkText("Mobiles under 20000"));
        mobilesUnder20000.click();
        Thread.sleep(2000);

        // Scroll down the page
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

        // Click on any mobile
        WebElement mobileItem = driver.findElement(By.xpath("//div[@data-asin][1]//a"));
        mobileItem.click();
        Thread.sleep(2000);

        // Add the item to the cart
        WebElement addToCart = driver.findElement(By.id("add-to-cart-button"));
        addToCart.click();
        Thread.sleep(2000);

        // Increase the quantity of the item
        WebElement quantityInput = driver.findElement(By.xpath("//span[contains(@class, 'a-dropdown-container')]//select"));
        Actions actions = new Actions(driver);
        actions.moveToElement(quantityInput).click().sendKeys("2").perform();
        Thread.sleep(2000);

        // Take a screenshot of the cart
        driver.findElement(By.id("nav-cart")).click();
        driver.findElement(By.id("hlb-view-cart-announce")).click();
        driver.manage().window().maximize();
    }


    @AfterTest
    public void tearDown() {
        // Close the browser
        driver.quit();
    }
}
