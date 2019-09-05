package com.auto.test.step.def;

import com.auto.test.page.def.EbayCartPage;
import com.auto.test.page.def.EbayProductAddToCartPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import org.openqa.selenium.WebDriver;

public class EbayCartPageSteps {
    private WebDriver driver;
    public EbayCartPageSteps(){
        this.driver =  BaseTest._driver;
    }

    @Then("^I see added product is displayed in cart$")
    public void i_see_added_product_is_displayed_in_cart() throws Throwable {
        EbayCartPage ebayCartPage = new EbayCartPage(driver);
        Assert.assertEquals("BORN IN 1949?... Australian Social History....HARD COVER... Birthday Year Books", ebayCartPage.getProductText());
    }

    @When("^I remove the product from cart$")
    public void i_remove_the_product_from_cart() throws Throwable {
        EbayCartPage ebayCartPage = new EbayCartPage(driver);
        ebayCartPage.clickRemoveLink();
    }

    @Then("^I see a message you dont have any items in your cart$")
    public void i_see_a_message_you_dont_have_any_items_in_your_cart() throws Throwable {
        EbayCartPage ebayCartPage = new EbayCartPage(driver);
        Assert.assertEquals("You don't have any items in your cart.", ebayCartPage.getTextWhenCartIsEmpty());
    }
}
