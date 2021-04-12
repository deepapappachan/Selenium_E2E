package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
    public WebDriver driver;
    public Properties prop;
   public WebDriver initializeDriver() throws IOException {
       prop = new Properties();
       FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"/src/main/java/resources/dataproperties.txt");
       prop.load(fis);
       String browser = prop.getProperty("browser");
       //String browser = System.getProperty("browser"); //to run using mvn test

       if(browser.contains("chrome"))
       {
           //System.setProperty("webdriver.chrome.driver","/Users/deepapappachan/Documents/SeleniumDependencies/drivers/chromedriver");
           System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/main/java/resources/chromedriver");
           ChromeOptions options = new ChromeOptions();
           if(browser.contains("headless"))
            options.addArguments("headless");
           driver = new ChromeDriver(options);
       }
       if(browser.equals("mozilla"))
           System.out.println("We are in mozilla");

       driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
       return driver;
   }
   @AfterClass
    public void test()
   {
        driver.quit();
   }
}
