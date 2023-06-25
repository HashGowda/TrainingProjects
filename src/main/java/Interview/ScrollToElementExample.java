import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollToElementExample {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");

        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        try {
            // Navigate to the webpage containing the element
            driver.get("https://www.example.com");

            // Find the element you want to scroll to
            WebElement element = driver.findElement(By.id("element-id"));

            // Scroll down to the element using JavaScript
            scrollToElement(driver, element);
        } finally {
            // Quit the WebDriver
            driver.quit();
        }
    }

    private static void scrollToElement(WebDriver driver, WebElement element) {
        // Create an instance of the JavascriptExecutor interface
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Execute the JavaScript code to scroll to the element
        js.executeScript("arguments[0].scrollIntoView();", element);
    }
}
