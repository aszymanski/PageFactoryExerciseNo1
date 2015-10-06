package test;

import core.GoogleSearchPage;
import org.junit.Assert;
import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

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
        Assert.assertEquals(searchtext,searchPage.getInputValue());
    }

    @After public void tearDown() throws Exception {
        driver.quit();
    }

}
