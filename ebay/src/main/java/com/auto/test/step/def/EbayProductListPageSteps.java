package com.auto.test.step.def;

import com.auto.test.page.def.EbayProductListPage;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

public class EbayProductListPageSteps {

    private WebDriver driver;
    public static String productName;
    public EbayProductListPageSteps(){
        this.driver =  BaseTest._driver;
    }

    @When("^I select the product from product list page$")
    public void i_select_the_product_from_product_list_page() throws Throwable {
        EbayProductListPage ebayProductListPage = new EbayProductListPage(driver);
        ebayProductListPage.clickEbayFirstProduct();
        //productName = ebayProductListPage.getProductName();
    }
}
