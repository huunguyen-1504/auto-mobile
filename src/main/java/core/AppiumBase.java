package core;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;

public class AppiumBase {

    public static AndroidDriver driver;
    public static WebDriverWait wait;

    public void createDriver() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("udid","8679c84e");
        capabilities.setCapability("automationName","UiAutomator2");
        capabilities.setCapability("appPackage", "com.todoist");
        capabilities.setCapability("appActivity", ".module.home.MainActivity");
        capabilities.setCapability("newCommandTimeout",700);

        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),capabilities);
        wait = new WebDriverWait(driver, 20);
    }

    public void tearDown(){
        driver.closeApp();
    }
}
