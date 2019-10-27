package searchResult;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class ResultPage extends CommonAPI {

    public void validateSearchPageDisplayed(){
        WebElement element = getElement("//h1[@class='search-title']");
        Assert.assertEquals(element.isDisplayed(),true,"element isn't displayed");
    }
}
