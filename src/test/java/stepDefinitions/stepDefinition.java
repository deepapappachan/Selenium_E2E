package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.landingPage;
import pageObjects.loginPage;
import resources.base;

public class stepDefinition extends base {
    @Given("^Initialize the browser with chrome$")
    public void initialize_the_browser_with_chrome() throws Throwable {
        driver = initializeDriver();
    }

    @Given("^Navigate to  \"([^\"]*)\" site\\.$")
    public void navigate_to_site(String arg1) throws Throwable {
        driver.get(arg1);
    }

    @Given("^Click on Login link in homepage to land on secure sign in page\\.$")
    public void click_on_Login_link_in_homepage_to_land_on_secure_sign_in_page() throws Throwable {
        landingPage lp = new landingPage(driver);
//        if(lp.getPopupSize().size()>0)
//            lp.getPopup().click();
        lp.getLogin().click();
    }

    @When("^User enters \"([^\"]*)\" and \"([^\"]*)\" and logs in$")
    public void user_enters_and_and_logs_in(String arg1, String arg2) throws Throwable {
        loginPage login = new loginPage(driver);
        login.getUsername().sendKeys(arg1);
        login.getPassword().sendKeys(arg2);
        login.getLogin().click();
    }

    @Then("^Verify that user closes the browser$")
    public void verify_that_user_closes_the_browser() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.quit();
    }

    @When("^User enters test(.+) and (.+) and logs in$")
    public void user_enters_test_gmail_com_and_and_logs_in(String arg1, String arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        loginPage login = new loginPage(driver);
        login.getUsername().sendKeys(arg1);
        login.getPassword().sendKeys(arg2);
        login.getLogin().click();
    }
}
