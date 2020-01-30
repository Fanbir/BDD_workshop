package stepsDefs;

import cucumber.api.java.ru.Дано;
import cucumber.api.java.ru.И;
import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.Тогда;
import org.openqa.selenium.WebDriver;
import pages.GooglePage;
import pages.RosbankMainPage;

/**
 * Собрание аннотированных методов для связи между .feature файлом для Cucumber и методами классов PageObject
 */
public class MyStepdefs {
    private WebDriver driver = Hooks.getDriver();
    private GooglePage googlePage = new GooglePage(driver);
    private RosbankMainPage rosbankMainPage = new RosbankMainPage(driver);

    @Дано("^открывается страница Google")
    public void checkElementGoogle() {
        googlePage.checkElementVisiblePage();
    }

    @И("^пользователь заполняет поле Поиск значением \"([^\"]*)\"$")
    public void fillInput(String searchText) {
        googlePage.fillInputSearchPage(searchText);
    }

    @И("^пользователь нажимает кнопку \"([^\"]*)\"$")
    public void clickSearchButton(String textButton) {
        googlePage.clickSearchButton(textButton);
    }

    @Когда("^пользователь нажимает на заголовок с параметром \"([^\"]*)\"$")
    public void clickSearchResult(String textLinks) {
        googlePage.clickSearchResultLinks(textLinks);
    }

    @Тогда("^открывается страница Росбанк")
    public void checkElementRosbank() {
        rosbankMainPage.checkElementVisiblePage();
    }

    @И("^пользователь нажимает пункт меню \"([^\"]*)\"$")
    public void clickMainMenuButton(String text) {
        rosbankMainPage.clickElementHomeMenu(text);
    }

    @И("^пользователь скроллит до элемента 'Ставка по ипотеке в рублях'$")
    public void scrollToElementPage() {
        rosbankMainPage.scrollToElement();
    }

    @И("^пользователь скроллит до элемента 'Footer'$")
    public void scrollToElementFooterPage() {
        rosbankMainPage.scrollToFooterElement();
    }

    @Тогда("^пользователь проверяет ставку процента \"([^\"]*)\"$")
    public void isTextElement(String text) {
        rosbankMainPage.isPercentValue(text);
    }

    @Тогда("^пользователь проверяет номер телефона \"([^\"]*)\"$")
    public void isTextElementFooter(String text) {
        rosbankMainPage.isPhoneValue(text);
    }

    @Тогда("^пользователь проверяет заголовок \"([^\"]*)\"$")
    public void isTextElementZagolovok(String text) {
        rosbankMainPage.isZagolovokValue(text);
    }

}
