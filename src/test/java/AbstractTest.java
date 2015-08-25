import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Rule;

/**
 * Created by def on 23.08.15.
 */
public class AbstractTest {

    @Rule
    public ThreadBasedWebDriverRule make = new ThreadBasedWebDriverRule();

    @BeforeClass
    public static void createPages(){
        PagesPool.init();
    }

    @After
    public void clearCookies(){
        make.atPage().getWebDriver().manage().deleteAllCookies();
    }

    @AfterClass
    public static void closePages(){
        PagesPool.closePages();
    }
}
