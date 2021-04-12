package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class landingPage {

    WebDriver driver;
    @FindBy(xpath = "//span[text()='Login']")
    WebElement login;
    @FindBy(xpath = "//button[text()='NO THANKS']")
    WebElement popup;

    public landingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getLogin() {
        return login;
    }

    public List<WebElement> getPopupSize() {
        return (List<WebElement>) popup;
    }

    public WebElement getPopup()
    {
        return popup;
    }

}
