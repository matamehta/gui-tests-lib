package core;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by def on 21.01.16.
 */
public class Suite {

    private static List<StepsContainer> stepsContainerPool = Collections.synchronizedList(new ArrayList<StepsContainer>());
    private static ThreadLocal<StepsContainer> stepsContainerThread;


    @BeforeClass
    public static void beforeClass(){
        stepsContainerThread = new ThreadLocal<StepsContainer>() {
            @Override
            protected StepsContainer initialValue() {
                final PagesContainer pagesContainer = new PagesContainer(WebDriverFactory.getWebdriver());
                final StepsContainer stepsContainer = new StepsContainer(pagesContainer);
                stepsContainerPool.add(stepsContainer);
                return stepsContainer;
            }
        };
    }

    public static StepsContainer steps() {
        return stepsContainerThread.get();
    }

    @AfterClass
    public static void afterClass(){
        for (StepsContainer stepsContainer : stepsContainerPool) {
            stepsContainer.pages.webDriver.quit();
        }
    }

    @After
    public void after(){
        steps().pages.webDriver.manage().deleteAllCookies();
    }
}
