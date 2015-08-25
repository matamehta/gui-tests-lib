package pages;

import annotations.PageName;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by def on 18.08.15.
 */
@PageName("yandex.ru")
public class YandexPage extends AbstractPage{

    private final String SEARCH_BUTTON_PATH = ".//button[*[text()='Найти']]";

    public YandexPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(name = "text")
    WebElement searchField;

    @FindBy(xpath = SEARCH_BUTTON_PATH)
    WebElement searchButton;

    public YandexPage open(String url){
        webDriver.get(url);
        wait.until((WebDriver d) -> d.findElement(By.xpath(SEARCH_BUTTON_PATH)).isDisplayed());
        return this;
    }

    public YandexPage fillTextField(String text) {
        searchField.clear();
        searchField.sendKeys(text);
        return this;
    }

    public YandexPage clickSearchButton() {
        searchButton.click();
        return this;
    }

    public YandexPage waitForResult(String url) {
        wait.until((WebDriver d) -> d.findElement(By.xpath(".//a[contains(@href, '" + url + "')]")));
        return this;
    }
}
