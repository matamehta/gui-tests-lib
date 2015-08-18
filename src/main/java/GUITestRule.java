import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.openqa.selenium.WebDriver;

/**
 * Created by def on 18.08.15.
 */
public class GUITestRule extends TestWatcher {

    private String name;
    private WebDriver webDriver;
    private PageContainer pageContainer;

    protected void starting(Description description) {
        name = description.getMethodName();
        init();
    }

    protected void finished(Description description) {
        webDriver.quit();
    }

    public String getName(){
        return name;
    }

    private void init(){
        webDriver = WebDriverFactory.getWebdriver();
        pageContainer = new PageContainer(webDriver);
    }

    public PageContainer getPages(){
        return pageContainer;
    }
}
