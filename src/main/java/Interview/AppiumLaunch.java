import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;

public class AppiumLaunch {
    AppiumDriver driver;
    public static WebDriverWait wait;

    @BeforeSuite
            public void launchFromAppium() throws MalformedURLException {

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("deviceName", "fd9d07b4");
        caps.setCapability("automationName","UiAutomator2");
        caps.setCapability("platform version", "12");
        caps.setCapability("ignoreHiddenApiPolicyError", "true");
        caps.setCapability("noReset", "true");
        caps.setCapability("appPackage", "com.cricbuzz.android");
        caps.setCapability("appActivity", "com.cricbuzz.android.lithium.app.view.activity.NyitoActivity");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
    }

}
