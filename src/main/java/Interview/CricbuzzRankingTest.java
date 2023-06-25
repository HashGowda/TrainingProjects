import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Scanner;

public class CricbuzzRankingTest {

    static WebDriver driver;

    //Create a method which should take input as a player name and return the ranking of the player

    public static void main(String[] args) {
        /*System.setProperty("webdriver.http.factory", "jdk-http-client");
        ChromeOptions co = new ChromeOptions();
        co.addArguments("allow-remote-origin=*");
        ChromeDriver driver = new ChromeDriver(co);*/

        WebDriverManager.chromedriver().setup();

        ChromeOptions co = new ChromeOptions();
        /*co.setHeadless(false);
        co.addArguments("start-maximized"); // open Browser in maximized mode
        co.addArguments("disable-infobars"); // disabling infobars
        co.addArguments("--disable-extensions"); // disabling extensions
        co.addArguments("--disable-gpu"); // applicable to Windows os only
        co.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
        co.addArguments("--no-sandbox"); // Bypass OS security model
        co.addArguments("--disable-in-process-stack-traces");
        co.addArguments("--disable-logging");
        co.addArguments("--log-level=3");*/
        co.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(co);

        driver.manage().window().maximize();


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter player name: ");
        String playerName = scanner.nextLine();
        scanner.close();

        try {
            driver.get("https://www.cricbuzz.com/cricket-stats/icc-rankings/men/batting-odi");


//            WebElement table = driver.findElement(By.xpath("(//*[contains(@class,'cb-col cb-col-100 cb-padding-left0')])[1]"));
//            WebElement tBody = table.findElement(By.tagName("tbody"));
//            java.util.List<WebElement> rows = tBody.findElements(By.tagName("tr"));
//
//            for (WebElement row : rows){
//                WebElement playerCell = row.findElement(By.tagName("td"));
//                String player = playerCell.getText();
//
//                if(player.equalsIgnoreCase(playerName)){
//                    WebElement rankCell = row.findElement(By.xpath(".//preceding-sibling::td[1]"));
//                    String rank = rankCell.getText();
//
//                    System.out.println("Player: "+player);
//                    System.out.println("Ranking: "+rank);
//                    break;
//                }
//            }

            WebElement table = driver.findElement(By.className("engineTable"));
            WebElement tbody = table.findElement(By.tagName("tbody"));
            java.util.List<WebElement> rows = tbody.findElements(By.tagName("tr"));

            // Iterate over the rows to find the player's ranking
            for (WebElement row : rows) {
                WebElement playerCell = row.findElement(By.tagName("td"));
                String player = playerCell.getText();

                if (player.equalsIgnoreCase(playerName)) {
                    WebElement rankCell = row.findElement(By.xpath(".//preceding-sibling::td[1]"));
                    String rank = rankCell.getText();

                    System.out.println("Player: " + player);
                    System.out.println("Ranking: " + rank);
                    break;
                }
            }


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }

}
