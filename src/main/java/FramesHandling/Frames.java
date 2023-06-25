package FramesHandling;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;


public class Frames {
    public WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        Frames frames = new Frames();
        frames.launchBrowser();
        frames.handleFrames();
    }

    void launchBrowser() throws InterruptedException {
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/frames");
        Thread.sleep(3000);
    }

    void handleFrames() throws InterruptedException {
        WebElement frame = driver.findElement(By.id("frame1"));
        driver.switchTo().frame(frame);
        String text = driver.findElement(By.id("sampleHeading")).getText();
        System.out.println(text);
        driver.switchTo().defaultContent();
        driver.findElement(By.xpath("//*[text()='Alerts']")).click();
        Thread.sleep(3000);
        driver.quit();
    }


    private String name;

    //getter method for name
    public String getName() {
        return name;
    }

    //setter method for name
    public void setName(String name) {
        this.name = name;
    }

    @Test(dependsOnMethods = {"test3", "test2"})
    public void test1() {
        System.out.println("Test1");
    }

    @Test
    public void test2() {
        System.out.println("Test2");
    }

    @Test
    public void test3() {
        System.out.println("Test3");
    }

    @Test
    public void test4() {
        System.out.println("\nTest4");
    }

    @Test(priority = 2)
    public void test5() {
        System.out.println("Test5");
    }

    @Test(priority = 1)
    public void test6() {
        System.out.println("Test6");
    }
}

