package com.auto.test.page.def;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EbayHomePage {

    private WebDriver driver;
    private WebDriver testCaseName;

    @FindBy(css = "input[placeholder='Search for anything']")
    WebElement ebaySearchField;

    @FindBy(css = "input[value='Search']")
    WebElement ebaySearchButton;

    public EbayHomePage(WebDriver _driver){
        driver = _driver;
        PageFactory.initElements(_driver, this);
    }

    public void enterDetailsOnSearchField(String productName){
        ebaySearchField.clear();
        ebaySearchField.sendKeys(productName);
    }

    public void clickOnSearchButton(){
        ebaySearchButton.click();
    }
}
