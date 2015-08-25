import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by def on 25.08.15.
 */
public class PagesPool {
    private static List<Pages> pagesPool = Collections.synchronizedList(new ArrayList<Pages>());
    private static ThreadLocal<Pages> pagesThread;

    public static void init(){
        pagesThread = new ThreadLocal<Pages>() {
            @Override
            protected Pages initialValue(){
                Pages page = new Pages(WebDriverFactory.getWebdriver());
                pagesPool.add(page);
                return page;
            }
        };
    }

    public static Pages getPages(){
        return pagesThread.get();
    }

    public static void closePages(){
        pagesPool.stream().forEach((Pages p) -> p.getWebDriver().quit());
    }
}
