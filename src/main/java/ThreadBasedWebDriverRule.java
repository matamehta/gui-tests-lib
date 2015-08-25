import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

/**
 * Created by def on 25.08.15.
 */
public class ThreadBasedWebDriverRule extends TestWatcher {
    private Pages pages;

    protected void starting(Description description) {
        pages = PagesPool.getPages();
    }

    public Pages atPage(){
        return pages;
    }

    protected void failed(Throwable e, Description description) {
    }
}
