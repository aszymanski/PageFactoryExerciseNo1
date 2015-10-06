package test;

import core.GoogleSearchPage;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by adria on 06.10.2015.
 */
public class SearchTest extends TestCase {
    WebDriver driver;

    private static String searchtext = "test";

    @Before public void setUp() throws Exception {
        driver = new FirefoxDriver();
    }

    @Test public void testSearchForm() throws Exception {
        driver.get("http://www.google.pl");
        GoogleSearchPage searchPage = PageFactory.initElements(driver, GoogleSearchPage.class);
        searchPage.enterText(searchtext);
        searchPage.clickSearchButton();

    }

    @After public void tearDown() throws Exception {
        driver.wait(15000);
        driver.quit();
    }

}
