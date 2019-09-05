package com.auto.test.page.def;

import com.auto.test.commonFunction.GenericFunction;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EbayProductListPage {

    public WebDriver driver;

    @FindBy(xpath = "//li[@id=\"srp-river-results-listing1\"]//h3")
    WebElement ebayFirstProduct;

    public EbayProductListPage(WebDriver _driver){
        driver = _driver;
        PageFactory.initElements(_driver, this);
    }

    public void clickEbayFirstProduct(){
        GenericFunction genericFunction = new GenericFunction(driver);
        genericFunction.waitForElementPresent(ebayFirstProduct);
        ebayFirstProduct.click();
    }
    public String getProductName(){
        return ebayFirstProduct.getText();
    }
}
