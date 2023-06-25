import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;



public class AmazonAddToCart {
    public static ChromeDriver driver;

    public static void main(String[] args) {
        launch();
        searchProduct();
        scrollDownAndClick();
        addToCart();
        takeScreenShot();
        tearDown();
    }


    public static void launch() {
        /*System.setProperty("webdriver.http.factory", "jdk-http-client");
        ChromeOptions co = new ChromeOptions();
        co.addArguments("allow-remote-origin=*");
        driver = new ChromeDriver(co);
        WebDriverManager.chromedriver().setup();
        driver.manage().window().maximize();*/

        WebDriverManager.chromedriver().setup();
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(co);
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public static void waitForElement(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void searchProduct() {

        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("Mobiles");
        waitForElement(searchBox);

        // Click on "Mobiles under 20000"
        WebElement mobilesUnder20000 = driver.findElement(By.xpath("//span[contains(text(), 'under 20000')]"));
        waitForElement(mobilesUnder20000);

        mobilesUnder20000.click();
    }

    public static void scrollDownAndClick() {

        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Click on any mobile
        WebElement mobileItem = driver.findElement(By.xpath("(//*[@class='a-size-medium a-color-base a-text-normal'])[3]"));
        js.executeScript("arguments[0].scrollIntoView();", mobileItem);
        waitForElement(mobileItem);
        mobileItem.click();
    }

    public static void addToCart() {
        WebElement addToCart = driver.findElement(By.xpath("//*[@id='add-to-cart-button']"));
        waitForElement(addToCart);
        addToCart.click();
        WebElement cart = driver.findElement(By.xpath("//input[@class='a-button-input']//following::form[@id='attach-view-cart-button-form']"));
        waitForElement(cart);
        cart.click();

    }

    public static void takeScreenShot() {
        WebElement cartButton = driver.findElement(By.id("nav-cart"));
        waitForElement(cartButton);

        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenshot, new File("C:\\projectScreenshots\\cartPageScreenshot.png"));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void tearDown() {
        driver.quit();
    }
}


