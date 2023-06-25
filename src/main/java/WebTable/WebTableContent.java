package WebTable;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Scanner;

public class WebTableContent {

    public WebDriver driver;

    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origin=*");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(co);
    }

    @Test
    public void launch() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/html/html_tables.asp");
        Thread.sleep(2000);
        WebElement table = driver.findElement(By.xpath("//table[@id='customers']"));
        Thread.sleep(2000);

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a company name: ");
//        String company = sc.nextLine();

        List<WebElement> rows = driver.findElements(By.tagName("tr"));
        Thread.sleep(2000);


        String company = "Ernst Handel";
        boolean companyFound = false;
//        boolean countryFound = false;
//
//        for (WebElement row : rows) {
//            List<WebElement> columns = row.findElements(By.tagName("td"));
//            for (WebElement column : columns) {
//                if (column.getText().contains(company)) {
//                    String country = column.getText();
//                    System.out.println("Country for " + company + " : " + country);
//                    countryFound = true;
//                    break;
//                }
//            }
//        }
//        if (!countryFound){
//            System.out.println("Country not found for "+company);
//        }
        for (WebElement row : rows) {
            if (row.getText().contains(company)) {
                String text = row.getText();
                System.out.println("Text : " + text);
                companyFound = true;
                break;
            }
        }
        if (!companyFound) {
            System.out.println("Not found");
        }
    }


    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
