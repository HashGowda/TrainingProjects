import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleNavigate {

        public WebDriver driver;
        String url = "https://www.google.com/";
        @Test
        public void validateBrowser(){
            /*System.setProperty("webdriver.http.factory","jdk-http-client");
            ChromeOptions co = new ChromeOptions();
            co.addArguments("--remote-allow-origin=*");
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver(co);
            driver.manage().window().maximize();*/

            WebDriverManager.chromedriver().setup();
            ChromeOptions co = new ChromeOptions();
            co.addArguments("--remote-allow-origins=*");
            driver = new ChromeDriver(co);
            driver.manage().window().maximize();
            driver.get(url);

            String expectedTitle = "Google";
            String actualTitle = driver.getTitle();
            System.out.println("Actual title = "+expectedTitle);
            //Assert.assertEquals(expectedTitle,"Google");
            boolean titleMatches = expectedTitle.equals(actualTitle);

            if (titleMatches){
                System.out.println("Title matches");
            } else {
                System.out.println("Title does not matches");
            }

            String URL = driver.getCurrentUrl();
            if (URL.equals(url)) {
                System.out.println("Url verification success");
            } else {
                System.out.println("Url verification failed");

            }

            driver.quit();
    }

    //Navigate to google.com
    //validate url
    //validate title


}
