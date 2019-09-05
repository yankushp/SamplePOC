package com.auto.test.step.def;

import com.auto.test.page.def.EbayProductAddToCartPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import org.openqa.selenium.WebDriver;

public class EbayProductAddToCartPageSteps {

    private WebDriver driver;
    public EbayProductAddToCartPageSteps(){
        this.driver =  BaseTest._driver;
    }

    @Then("^I see added product in product purchase page$")
    public void i_see_added_product_in_product_purchase_page() throws Throwable {
        EbayProductAddToCartPage ebayProductAddToCartPage = new EbayProductAddToCartPage(driver);
        Assert.assertEquals("BORN IN 1949?... Australian Social History....HARD COVER... Birthday Year Books", ebayProductAddToCartPage.getProductText());
    }

    @When("^I click on Add to cart button$")
    public void i_click_on_Add_to_cart_button() throws Throwable {
        EbayProductAddToCartPage ebayProductAddToCartPage = new EbayProductAddToCartPage(driver);
        ebayProductAddToCartPage.clickAddToCartButton();
    }
}
