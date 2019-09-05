package com.auto.test.commonFunction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GenericFunction {

    private WebDriver _driver;

    public GenericFunction(WebDriver driver){
        this._driver = driver;
    }

    public void waitForElementPresent(WebElement element){

        WebDriverWait wait = new WebDriverWait(_driver, 10);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static String getDataFromExcel(int row, int col){
        String cellData = ExcelReader.getTestDataValueOfTestConfigSheet1(row,col).toString();
        return cellData;
    }

}
