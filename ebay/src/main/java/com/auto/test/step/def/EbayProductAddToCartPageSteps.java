package com.auto.test.step.def;

import com.auto.test.page.def.EbayProductAddToCartPage;
import cucumber.api.java.en.Then;
import junit.framework.Assert;
import org.openqa.selenium.WebDriver;

public class EbayProductAddToCartPageSteps {

    private WebDriver driver;
    public EbayProductAddToCartPageSteps(){
        this.driver =  BaseTest._driver;
    }

    @Then("^I see product purchase page$")
    public void i_see_product_purchase_page() throws Throwable {
        EbayProductAddToCartPage ebayProductAddToCartPage = new EbayProductAddToCartPage(driver);
        Assert.assertEquals("Coles Little Shop 2 Mini collectables", ebayProductAddToCartPage.getProductText());
    }
}
