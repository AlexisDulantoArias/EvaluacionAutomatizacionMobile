package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MyDemoAppIndexScreen extends PageObject {

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/productTV\"]")
    private WebElement productsTitle;

    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView[@content-desc=\"Displays all products of catalog\"]/android.view.ViewGroup[1]")
    private WebElement sauceLabsBackpack;

    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView[@content-desc=\"Displays all products of catalog\"]/android.view.ViewGroup[2]")
    private WebElement sauceLabsBikeLight;

    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView[@content-desc=\"Displays all products of catalog\"]/android.view.ViewGroup[3]")
    private WebElement sauceLabsBoltTShirt;

    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView[@content-desc=\"Displays all products of catalog\"]/android.view.ViewGroup[4]")
    private WebElement sauceLabsFleeceJacket;

    public void getProductTitle(){
        waitFor(ExpectedConditions.visibilityOf(productsTitle));
        productsTitle.isEnabled();
    }

    public void selectBackpack(){
        sauceLabsBackpack.click();
    }

    public void selectBikeLight(){
        sauceLabsBikeLight.click();
    }

    public void selectBoltTShirt(){
        sauceLabsBoltTShirt.click();
    }

    public void selectFleeceJacket(){
        sauceLabsFleeceJacket.click();
    }

}
