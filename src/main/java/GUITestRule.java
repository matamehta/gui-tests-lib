import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.openqa.selenium.WebDriver;

import java.lang.reflect.Method;

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
        Class testClass = description.getTestClass();
        try {
            Method m = testClass.getMethod(description.getMethodName());
            System.out.println(m.toString());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
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

    public PageContainer atPage(){
        return pageContainer;
    }
}
