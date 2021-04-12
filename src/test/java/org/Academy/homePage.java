package org.Academy;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObjects.landingPage;
import pageObjects.loginPage;
import resources.base;

import java.io.IOException;

public class homePage extends base {

    @Test(dataProvider = "getData")
    public void basePageNavigation(String username,String paswrd) throws IOException {
        driver = initializeDriver();
        driver.get(prop.getProperty("url"));
        //driver.get("http://www.qaclickacademy.com/");
        landingPage lp = new landingPage(driver);
        lp.getLogin().click();
        loginPage login = new loginPage(driver);
        login.getUsername().sendKeys(username);
        login.getPassword().sendKeys(paswrd);
        login.getLogin().click();
        String s ="madam";
    }

    @DataProvider
    public Object[][] getData()
    {
        Object data[][] = new Object[1][2];
        data[0][0] = "testusername";
        data[0][1] = "testpassword";
        return data;
    }
}
