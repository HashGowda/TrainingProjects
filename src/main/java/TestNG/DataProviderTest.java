package TestNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
    // this will take data from dataprovider which we created
    @Test(dataProvider="testdata")
    public void TestChrome(String uname,String password){
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
// Maximize browser
        driver.manage().window().maximize();
// Load application
        driver.get("https://twitter.com/login");
// clear email field
        driver.findElement(By.name("//*[contains(@name,'text')]")).clear();
// Enter username
        driver.findElement(By.name("//*[contains(@name,'text')]")).sendKeys(uname);
        driver.findElement(By.xpath("//*[text()='Next']")).click();
// Clear password field
        driver.findElement(By.name("//*[contains(@name,'password')]")).clear();
// Enter password
        driver.findElement(By.name("//*[contains(@name,'password')]")).sendKeys(password);
    }
    @DataProvider(name="testdata")
    public Object[][] TestDataFeed(){

// Create object array with 2 rows and 2 column- first parameter is row and second is //column
        Object [][] twitterdata=new Object[2][2];

// Enter data to row 0 column 0
        twitterdata[0][0]="username1@gmail.com";
// Enter data to row 0 column 1
        twitterdata[0][1]="Password1";
// Enter data to row 1 column 0
        twitterdata[1][0]="username2@gmail.com";
// Enter data to row 1 column 0
        twitterdata[1][1]="Password2";
// return arrayobject to testscript
        return twitterdata;
    }
}
