package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static java.lang.Thread.sleep;

public class GooglePage extends BasePage {

    public GooglePage(WebDriver driver) {
        super(driver);
    }

    //лого Google на главной
    @FindBy(xpath = "//img[@id='hplogo']")
    WebElement googleLogo;

    // поле поиска для ввода значения
    @FindBy(xpath = "//input[@title='Поиск']")
    WebElement searchInput;

    public void checkElementVisiblePage() {
        checkElementVisiblePage(googleLogo);
    }


    public void fillInputSearchPage(String text) {
        fillElement(searchInput, text);
    }

    public void clickSearchButton(String textButton) {
        click(By.xpath("//input[@value='" + textButton + "']"));
    }

    public void clickSearchResultLinks(String textLinks) {
        click(By.xpath("//h3[contains( text(),'" + textLinks + "')]"));
    }
}
