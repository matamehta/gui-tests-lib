import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

/**
 * Created by def on 18.08.15.
 */
public class Rules1Test extends AbstractTest {

    @Test
    public void test1() throws Exception {
        make.atPage().yandex()
                .open("http://www.yandex.ru/")
                .fillTextField("TestWatcher junit")
                .clickSearchButton()
                .waitForResult("habrahabr.ru");
    }

    @Test
    public void test2() throws Exception {
        make.atPage().yandex()
                .open("http://www.yandex.ru/")
                .fillTextField("СКА спб")
                .clickSearchButton()
                .waitForResult("ska.ru");
    }

    @Test
    public void test3() throws Exception {
        make.atPage().yandex()
                .open("http://www.yandex.ru/")
                .fillTextField("TestWatcher junit")
                .clickSearchButton()
                .waitForResult("habrahabr.ru");
    }

    @Test
    public void test4() throws Exception {
        make.atPage().yandex()
                .open("http://www.yandex.ru/")
                .fillTextField("СКА спб")
                .clickSearchButton()
                .waitForResult("ska.ru");
    }

    @Test
    public void test5() throws Exception {
        make.atPage().yandex()
                .open("http://www.yandex.ru/")
                .fillTextField("TestWatcher junit")
                .clickSearchButton()
                .waitForResult("habrahabr.ru");
    }

    @Test
    public void test6() throws Exception {
        make.atPage().yandex()
                .open("http://www.yandex.ru/")
                .fillTextField("СКА спб")
                .clickSearchButton()
                .waitForResult("ska.ru");
    }

    @Test
    public void test7() throws Exception {
        make.atPage().yandex()
                .open("http://www.yandex.ru/")
                .fillTextField("TestWatcher junit")
                .clickSearchButton()
                .waitForResult("habrahabr.ru");
    }

    @Test
    public void test8() throws Exception {
        make.atPage().yandex()
                .open("http://www.yandex.ru/")
                .fillTextField("СКА спб")
                .clickSearchButton()
                .waitForResult("ska.ru");
    }

    @Test
    public void test9() throws Exception {
        make.atPage().yandex()
                .open("http://www.yandex.ru/")
                .fillTextField("TestWatcher junit")
                .clickSearchButton()
                .waitForResult("habrahabr.ru");
    }

    @Test
    public void test10() throws Exception {
        make.atPage().yandex()
                .open("http://www.yandex.ru/")
                .fillTextField("СКА спб")
                .clickSearchButton()
                .waitForResult("ska.ru");
    }

    @Test
    public void test11() throws Exception {
        make.atPage().yandex()
                .open("http://www.yandex.ru/")
                .fillTextField("TestWatcher junit")
                .clickSearchButton()
                .waitForResult("habrahabr.ru");
    }

    @Test
    public void test12() throws Exception {
        make.atPage().yandex()
                .open("http://www.yandex.ru/")
                .fillTextField("СКА спб")
                .clickSearchButton()
                .waitForResult("ska.ru");
    }

    @Test
    public void test13() throws Exception {
        make.atPage().yandex()
                .open("http://www.yandex.ru/")
                .fillTextField("TestWatcher junit")
                .clickSearchButton()
                .waitForResult("habrahabr.ru");
    }

    @Test
    public void test14() throws Exception {
        make.atPage().yandex()
                .open("http://www.yandex.ru/")
                .fillTextField("СКА спб")
                .clickSearchButton()
                .waitForResult("ska.ru");
    }
}
