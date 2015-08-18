import org.openqa.selenium.WebDriver;
import pages.YandexPage;

/**
 * Created by def on 18.08.15.
 */
public class PageContainer {
    private WebDriver webDriver;
    private YandexPage yandexPage;
    public PageContainer(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public YandexPage atYandexPage(){
        if (yandexPage == null) {
            yandexPage = new YandexPage(webDriver);
        }
        return yandexPage;
    }
}
