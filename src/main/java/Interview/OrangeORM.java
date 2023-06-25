import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class OrangeORM {

    public WebDriver driver;
    String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
    String name = "John.Smith";

    @Test(priority = 0)
    public void launchApp() {
        /*System.setProperty("webdriver.http.factory","jdk-http-client");
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origin");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(co);
        driver.manage().window().maximize();*/

        WebDriverManager.chromedriver().setup();
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(co);
        driver.manage().window().maximize();
        driver.get(url);
    }

    @Test(priority = 1)
    public void enterCredentials() throws InterruptedException {
        Thread.sleep(2000);
        WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement username = driver.findElement(By.xpath("//input[@placeholder='Username']"));
        wait.until(ExpectedConditions.visibilityOf(username));
        username.sendKeys("Admin");
        WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        wait.until(ExpectedConditions.visibilityOf(password));
        password.sendKeys("admin123");
        WebElement loginButton = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
        wait.until(ExpectedConditions.elementToBeClickable(loginButton));
        loginButton.click();
    }

    @Test (priority = 2)
    public void clickOnAdminTab() throws InterruptedException{
        Thread.sleep(2000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement adminTab = driver.findElement(By.xpath("//span[normalize-space()='Admin']"));
        wait.until(ExpectedConditions.visibilityOf(adminTab));
        adminTab.click();
    }

    @Test(priority = 3)
    public void clickOnCheckBox() throws InterruptedException {
        Thread.sleep(2000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement checkBox = driver.findElement(By.xpath("//div[text()='" + name + "']/parent::div/preceding-sibling::div/child::div"));
//        WebElement checkBox = driver.findElement(By.xpath("//div[@role='cell']/preceding::input[@value='3']"));
//        WebElement checkBox = driver.findElement(By.xpath("//div[@class='oxd-table-card-cell-checkbox']/following::input[@value='3']"));
//        WebElement checkBox = driver.findElement(By.xpath("//input[@value='3']"));
        wait.until(ExpectedConditions.elementToBeClickable(checkBox));
        checkBox.click();
        Thread.sleep(2000);
    }

    @Test(priority = 4)
    public void tearDown(){
        driver.quit();
    }
}
