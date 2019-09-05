package com.auto.test.page.def;

import com.auto.test.commonFunction.GenericFunction;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EbayProductAddToCartPage {
    public WebDriver driver;

    @FindBy(xpath = "//h1[@id=\"itemTitle\"]")
    WebElement ebaySelectedProductText;

    public EbayProductAddToCartPage(WebDriver _driver){
        driver = _driver;
        PageFactory.initElements(_driver, this);
    }

    public String getProductText(){
        GenericFunction genericFunction = new GenericFunction(driver);
        genericFunction.waitForElementPresent(ebaySelectedProductText);
        return ebaySelectedProductText.getText();
    }
}
