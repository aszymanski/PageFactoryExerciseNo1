package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by adria on 06.10.2015.
 */
public class GoogleSearchPage {
    final WebDriver driver;

    @FindBy(how = How.NAME, using = "q") private WebElement searchInput;
    @FindBy(how = How.NAME, using = "btnG") private WebElement searchButton;

    public GoogleSearchPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterText(String text){
        searchInput.clear();
        searchInput.sendKeys(text);
    }

    public void clickSearchButton() {
        searchButton.click();
    }


}
