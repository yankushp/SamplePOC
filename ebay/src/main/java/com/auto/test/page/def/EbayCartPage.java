package com.auto.test.page.def;

import com.auto.test.commonFunction.GenericFunction;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EbayCartPage {

    public WebDriver driver;

    @FindBy(css = "a[data-test-id=\"cart-item-link\"]")
    WebElement addedProductName;

    @FindBy(css = "button[data-test-id=\"cart-remove-item\"]")
    WebElement removeLink;

    @FindBy(xpath = "//span[contains(text(), \"You don't have any items in your cart.\")]")
    WebElement noItemInTheCartText;

    public EbayCartPage(WebDriver _driver){
        driver = _driver;
        PageFactory.initElements(_driver, this);
    }

    public String getProductText(){
        GenericFunction genericFunction = new GenericFunction(driver);
        genericFunction.waitForElementPresent(addedProductName);
        return addedProductName.getText();
    }

    public void clickRemoveLink(){
        removeLink.click();
    }

    public  String getTextWhenCartIsEmpty(){
        GenericFunction genericFunction = new GenericFunction(driver);
        genericFunction.waitForElementPresent(noItemInTheCartText);
        return noItemInTheCartText.getText();
    }
}
