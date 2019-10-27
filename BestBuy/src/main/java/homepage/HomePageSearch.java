package homepage;

import base.CommonAPI;
import org.openqa.selenium.By;
import report.TestLogger;

public class HomePageSearch extends CommonAPI {

    public void clickOnSearchBar() {
        clickOnElementByXpath("//button[@type='button' and @class='close']");
        sleepFor(3);
        clickOnElementById("gh-search-input");
        TestLogger.log("search bar clicked");
    }

    public void typeOnSearchBar(String value) {
        typeOnElementByXpath("//input[@type= 'text' and @id='gh-search-input']", value);
        TestLogger.log(value + "typed on search bar");

    }

    public void clickOnSubmit() {
        clickOnElementByXpath("//span[contains(@class,'header-search-icon')]//img");
        TestLogger.log("submit button clicked");
    }

    public void clickOnAccount(){
        clickOnElementByXpath("//span[@class='flyBtn']");
        clickOnElementByXpath("//button[@class='am-create-account__button btn btn-tertiary']");

        TestLogger.log("Account button clicked");

    }
    public void typeOnCreateAccount(String value) {
        typeOnElementById("fld-firstName", value);
        TestLogger.log(value + "typed first Name");
    }

    public void typeOnLastName(String value){
        typeOnElementById("fld-lastName",value);
        TestLogger.log(value+ "typed last Name");

    }
    public void typeOnEmail(String value){
        typeOnElementById("fld-e", value);
        TestLogger.log(value+ "typed email");
    }

    //public void typeOnValidEmail(String value){
       // typeOnElementById("sc-validatr-0", value);
       // TestLogger.log(value+ "typed valid email");
   // }
    public void typeOnPassword(String value){
        typeOnElementById("fld-p1",value);
        TestLogger.log(value+ "typed password");
    }
    public void typeOnConfirmPassword(String value){
        typeOnElementById("fld-p2", value);
        TestLogger.log(value+ "typed confirmed password");
    }

    public  void typeOnPhoneNumber(String value){
        typeOnElementById("fld-phone", value);
        TestLogger.log(value+"typed phone number");
    }

    public void clickOnCheckb0x(){
        clickOnElementByXpath("//input[@class='js-recovery-phone']");
        TestLogger.log("checkbox clicked");

    }
    public void typeOnMemberId(String value){
        clickOnElementByXpath("/html/body/div[1]/section/main/div[1]/div/div/div/form/div[9]/div/button/span[1]");
        typeOnElementByXpath("//input[@type='tel' and @name='memberId']",value);
        TestLogger.log(value+ "typed member Id");
    }


}
