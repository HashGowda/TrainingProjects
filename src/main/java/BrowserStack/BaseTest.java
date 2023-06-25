package BrowserStack;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseTest {

    WebDriver driver;

    @Parameters({"browser","platform","version"})
    @BeforeMethod
    public void setUp(String browserName, String platformName, String versionName,  Method name) {

        System.out.println("browser name is : " + browserName);
        String methodName = name.getName();

        MutableCapabilities sauceOpts = new MutableCapabilities();
        sauceOpts.setCapability("name", methodName);
        sauceOpts.setCapability("build", "Java-W3C-Examples");
        sauceOpts.setCapability("seleniumVersion", "3.141.59");
        sauceOpts.setCapability("username", "harishgowda_NPWHGu");
        sauceOpts.setCapability("accessKey", "poVseN6zpztytRBk8Exc");
        sauceOpts.setCapability("tags", "w3c-chrome-tests");

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("sauce:options", sauceOpts);
        cap.setCapability("browserVersion", versionName);
        cap.setCapability("platformName", platformName);

        if (browserName.equals("Chrome")) {
            WebDriverManager.chromedriver().setup();
            cap.setCapability("browserName", "Chrome");
        } else if (browserName.equals("Edge")) {
            WebDriverManager.firefoxdriver().setup();
            cap.setCapability("browserName", "Edge");
        }


        try {
            driver = new RemoteWebDriver(new URL("https://ondemand.us-west-1.saucelabs.com:443/wd/hub"), cap);
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        driver.quit();
    }

}
