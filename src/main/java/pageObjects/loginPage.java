package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {

    WebDriver driver;

    public loginPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(css="input[id='user_email']")
    WebElement username;

    @FindBy(css="input[id='user_password']")
    WebElement password;

    @FindBy(name="commit")
    WebElement login;

    public WebElement getUsername()
    {
        return username;
    }

    public WebElement getPassword()
    {
        return password;
    }

    public WebElement getLogin()
    {
        return login;
    }
}
