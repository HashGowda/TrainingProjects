package Interview;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationTest {

    public WebDriver driver;

    @Test
    public void testRegister() {
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origin=*");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://www.example.com/register");
        driver.manage().window().maximize();

        // Enter registration details
        driver.findElement(By.id("username")).sendKeys("john_doe");
        driver.findElement(By.id("password")).sendKeys("password123");
        driver.findElement(By.id("email")).sendKeys("john.doe@example.com");

        // Submit the registration form
        driver.findElement(By.id("registerButton")).click();

        // Verify successful registration
        String successMessage = driver.findElement(By.id("successMessage")).getText();
        Assert.assertEquals("Registration successful", "Thank you for registering!", successMessage);

        // Close the browser
        driver.quit();
    }
}
