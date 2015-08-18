import org.junit.Rule;
import org.junit.Test;

/**
 * Created by def on 18.08.15.
 */
public class RulesTest {

    @Rule
    public GUITestRule guiTest = new GUITestRule();

    @Test
    public void testRule1() throws Exception {
        PageContainer make = guiTest.getPages();
        make.atYandexPage()
                .open("http://www.yandex.ru/")
                .fillTextField("TestWatcher junit")
                .clickSearchButton();
        Thread.sleep(4000);
    }

    @Test
    public void testRule2() throws Exception {
        PageContainer make = guiTest.getPages();
        make.atYandexPage()
                .open("http://www.yandex.ru/")
                .fillTextField("СКА спб")
                .clickSearchButton();
        Thread.sleep(4000);
    }
}
