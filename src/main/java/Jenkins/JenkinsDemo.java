package Jenkins;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JenkinsDemo
{
public WebDriver driver;

    @Test
    public void testGoogleSearch(){

        System.setProperty("webdriver.http.factory", "jdk-http-client");
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();


//it will open the Google page
        driver.get("http://google.in");

//we expect the title “Google “ should be present
        String ExpectedTitle = "Google";

//it will fetch the actual title
        String ActualTitle = driver.getTitle();
        System.out.println("Before Assertion " + ExpectedTitle + ActualTitle);

//it will compare actual title and expected title
        Assert.assertEquals(ActualTitle, ExpectedTitle);

//print out the result
        System.out.println("After Assertion " + ExpectedTitle + ActualTitle + " Title matched ");
    }
}
