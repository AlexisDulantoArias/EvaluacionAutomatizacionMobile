package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MyDemoAppProductsScreen extends PageObject {

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Displays selected product\"]")
    private WebElement displaySelectedProduct;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Increase item quantity\"]")
    private WebElement increaseItemQuantity;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Tap to add product to cart\"]")
    private WebElement addToCartButton;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Displays number of items in your cart\"]")
    private WebElement cartView;

    public void getSelectedProduct(){
        waitFor(ExpectedConditions.visibilityOf(displaySelectedProduct));
        displaySelectedProduct.isEnabled();
    }

    public void increaseItemQuantity() {
        waitFor(ExpectedConditions.elementToBeClickable(increaseItemQuantity));
        increaseItemQuantity.click();
    }

    public void addToCart(){
        waitABit(2000);
        addToCartButton.click();
    }

    public void viewCart(){
        waitABit(2000);
        cartView.click();
    }
}
