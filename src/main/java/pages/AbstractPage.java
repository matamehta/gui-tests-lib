package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by def on 18.08.15.
 */
public class AbstractPage {
    protected WebDriver webDriver;
    protected WebDriverWait wait;

    public AbstractPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        this.wait = new WebDriverWait(webDriver, 10);
    }

}
