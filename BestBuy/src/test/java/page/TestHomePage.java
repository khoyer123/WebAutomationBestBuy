package page;

import homepage.HomePageSearch;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import report.TestLogger;
import searchResult.ResultPage;

public class TestHomePage extends HomePageSearch {

    ResultPage resultPage = new ResultPage();

    @Test(enabled = true)
    public void validateSearchButtonWorks() {
        clickOnSearchBar();
        typeOnSearchBar("laptop ");
        sleepFor(3);
        clickOnSubmit();
        resultPage.validateSearchPageDisplayed();

        clickOnAccount();
        sleepFor(3);

        typeOnCreateAccount("Adam ");
        typeOnLastName("Pete ");
        typeOnEmail("adam11@gmail.com ");
        sleepFor(3);

       // typeOnValidEmail("Adam112@gmail.com");
        typeOnPassword("321456 ");
        typeOnConfirmPassword("321456 ");
        typeOnPhoneNumber("347 944 2121 ");
        sleepFor(3);

        clickOnCheckb0x();
        typeOnMemberId("11111 ");
        sleepFor(3);
      // resultPage.validateSearchPageDisplayed();


    }
}
