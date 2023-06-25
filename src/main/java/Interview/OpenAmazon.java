import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class OpenAmazon {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        /*System.setProperty("webdriver.http.factory", "jdk-http-client");
        ChromeOptions co = new ChromeOptions();
        co.addArguments("allow-remote-origin=*");
        ChromeDriver driver = new ChromeDriver(co);
        WebDriverManager.chromedriver().setup();
        driver.manage().window().maximize();*/

        WebDriverManager.chromedriver().setup();
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(co);
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        // Search for the product "Mobiles"
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("Mobiles");
       //searchBox.submit();
        Thread.sleep(2000);

//        List<WebElement> list = driver.findElements(By.xpath("//*[@class='left-pane-results-container']"));
//        System.out.println("Suggestions: ");
//        for (WebElement lst : list){
//            System.out.println(lst.getText());9
//        }
//
//        WebElement desiredSugg = list.get(3);
//        desiredSugg.click();

        // Click on "Mobiles under 20000"
        WebElement mobilesUnder20000 = driver.findElement(By.xpath("//span[contains(text(), 'under 20000')]"));
        Thread.sleep(5000);
        mobilesUnder20000.click();


        // Scroll down the page
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Click on any mobile
       // WebElement mobileItem = driver.findElement(By.xpath("//div[@data-asin][1]//a"));

        WebElement mobileItem = driver.findElement(By.xpath("(//*[@class='a-size-medium a-color-base a-text-normal'])[3]"));
        js.executeScript("arguments[0].scrollIntoView();", mobileItem);
        Thread.sleep(2000);
        mobileItem.click();
        Thread.sleep(5000);

        // Add the item to the cart

        WebElement addToCart = driver.findElement(By.name("submit.add-to-cart"));


        //js.executeScript("arguments[0].scrollIntoView();", addToCart);
        addToCart.click();
        Thread.sleep(2000);

        WebElement cart = driver.findElement(By.xpath("//input[@class='a-button-input']//following::form[@id='attach-view-cart-button-form']"));
        cart.click();
        Thread.sleep(2000);

        // Increase the quantity of the item
        WebElement quantityInput = driver.findElement(By.xpath("//span[contains(@class, 'a-dropdown-container')]//select"));
        Actions action = new Actions(driver);
        action.moveToElement(quantityInput).click().sendKeys("2").perform();
        Thread.sleep(2000);

        // Take a screenshot of the cart
        driver.findElement(By.id("nav-cart")).click();
        Thread.sleep(2000);

        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        //Copy the file to a location and use try catch block to handle exception
        try {
            FileUtils.copyFile(screenshot, new File("C:\\projectScreenshots\\cartPageScreenshot.png"));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        Thread.sleep(2000);

        driver.quit();
    }
}
