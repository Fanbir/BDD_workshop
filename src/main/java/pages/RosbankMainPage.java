package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static java.lang.Thread.sleep;

public class RosbankMainPage extends BasePage {

    public RosbankMainPage(WebDriver driver) {
        super(driver);
    }

    //лого Rosbank на главной
    @FindBy(xpath = "//img[@class='Logo__image Logo__image--desktop']")
    WebElement rosbankLogo;

//    @FindBy(xpath = "//div[@class='Possibilities']")
//    WebElement present;



    public void checkElementVisiblePage() {
        checkElementVisiblePage(rosbankLogo);
    }

    public void clickElementHomeMenu(String textNameButton) {
        click(By.xpath("//a[contains(text(), '" + textNameButton + "')]"));
    }

    public void scrollToElement(){
        scroll(findByXpath("//div[@class='AdditionalLinks']"));
    }

    public void scrollToFooterElement(){
        scroll(findByXpath("//div[@class='Footer__top']"));
    }


    /**
     * Проверка ставки процента. Ищем надпись "6,69%".
     */
    public void isPercentValue(String textTitle) {
        checkElementText(findByXpath("(//div[@class='Possibilities__item-title']//u)[1]"), textTitle);
        takeScreenshot();
    }


    /**
     * Проверка номера телефона
     */
    public void isPhoneValue(String textTitle) {
        checkElementText(findByXpath("//div[@class='Footer__contactsWrapper']/ul/li/a"), textTitle);
        takeScreenshot();
    }

    public void isZagolovokValue(String text) {
        checkElementText(findByXpath("//h1[@class='ComponentKit__title']"), text);
        takeScreenshot();
    }
}
