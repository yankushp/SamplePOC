package com.auto.test.step.def;

import com.auto.test.page.def.EbayHomePage;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

public class EbayHomePageSteps {

    private WebDriver driver;

    public EbayHomePageSteps(){
        this.driver =  BaseTest._driver;
    }
    @When("^I navigate to Ebay website$")
    public void i_navigate_to_Ebay_website() throws Throwable {
        driver.manage().window().fullscreen();
        driver.navigate().to("https://www.ebay.com.au/");
    }

    @When("^I enter the \"([^\"]*)\" and search the product$")
    public void i_enter_the_and_search_the_product(String productName) throws Throwable {
        EbayHomePage ebayHomePage = new EbayHomePage(driver);
        ebayHomePage.enterDetailsOnSearchField(productName);
        ebayHomePage.clickOnSearchButton();
    }
}
