package core;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * Created by def on 18.08.15.
 */
public class WebDriverFactory {
    public static WebDriver getWebdriver() {
        return new ChromeDriver(DesiredCapabilities.chrome());
    }
}
