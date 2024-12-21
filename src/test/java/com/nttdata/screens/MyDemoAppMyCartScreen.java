package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MyDemoAppMyCartScreen extends PageObject {

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Confirms products for checkout\"]")
    private WebElement checkoutButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/noTV\"]")
    private WebElement totalOfProducts;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/noItemTitleTV\"]")
    private WebElement noItemTitle;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/loginTV\"]")
    private WebElement loginTitle;

    public boolean isNoItemTitleDisplayed() {
        try {
            waitFor(ExpectedConditions.visibilityOf(noItemTitle));
            return noItemTitle.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public int totalProducts(){
        try {
            waitFor(ExpectedConditions.visibilityOf(totalOfProducts));
            String totalText = totalOfProducts.getText();
            return Integer.parseInt(totalText.trim());
        } catch (Exception e) {
            System.err.println("Error al obtener el total de productos: " + e.getMessage());
            return 0;
        }
    }

    public void checkoutButton(){
        waitABit(2000);
        checkoutButton.click();
    }

    public void viewLogin(){
        waitFor(ExpectedConditions.visibilityOf(loginTitle));
        loginTitle.isEnabled();
        waitABit(2000);
    }
}
