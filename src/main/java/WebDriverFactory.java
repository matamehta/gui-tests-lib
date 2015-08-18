import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by def on 18.08.15.
 */
public class WebDriverFactory {
    public static WebDriver getWebdriver(){
        if (System.getProperty("webdriver.chrome.driver") == null) {
            System.setProperty("webdriver.chrome.driver", "/home/def/soft/chromedriver");
        }
        return new ChromeDriver();
    }
}
