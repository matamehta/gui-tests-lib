import org.openqa.selenium.WebDriver;
import pages.YandexPage;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by def on 23.08.15.
 */
public class Pages {
    private WebDriver webDriver;
    private YandexPage yandexPage;

    public Pages(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public WebDriver getWebDriver() {
        return webDriver;
    }

    public YandexPage yandex() {
        if (yandexPage == null) {
            yandexPage = new YandexPage(webDriver);
        }
        return yandexPage;
    }
}
