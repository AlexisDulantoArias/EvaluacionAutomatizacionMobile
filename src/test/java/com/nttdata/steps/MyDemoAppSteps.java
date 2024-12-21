package com.nttdata.steps;

import com.nttdata.screens.MyDemoAppIndexScreen;
import com.nttdata.screens.MyDemoAppMyCartScreen;
import com.nttdata.screens.MyDemoAppProductsScreen;

public class MyDemoAppSteps {

    MyDemoAppIndexScreen myDemoAppIndexScreen;
    MyDemoAppProductsScreen myDemoAppProductsScreen;
    MyDemoAppMyCartScreen myDemoAppMyCartScreen;

    public void validateLblProduct(){
        myDemoAppIndexScreen.getProductTitle();
    }

    public void addProducts(int unidades, String producto) {
        switch (producto) {
            case "Sauce Labs Backpack":
                myDemoAppIndexScreen.selectBackpack();
                break;
            case "Sauce Labs Bike Light":
                myDemoAppIndexScreen.selectBikeLight();
                break;
            case "Sauce Labs Bolt - T-Shirt":
                myDemoAppIndexScreen.selectBoltTShirt();
                break;
            case "Sauce Labs Fleece Jacket":
                myDemoAppIndexScreen.selectFleeceJacket();
                break;
            default:
                throw new IllegalArgumentException("Producto no encontrado: " + producto);
        }

        myDemoAppProductsScreen.getSelectedProduct();

        if (unidades > 1) {
            for (int i = 1; i < unidades; i++) {
                myDemoAppProductsScreen.increaseItemQuantity();
            }
        }
        myDemoAppProductsScreen.addToCart();
    }

    public void validateCartUpdate(int unidades) {
        myDemoAppProductsScreen.viewCart();

        int totalProducts = myDemoAppMyCartScreen.totalProducts();
        if (totalProducts!=unidades){
            throw new AssertionError("Error: Total en el carrito (" + totalProducts +
                    ") no coincide con las unidades esperadas (" + unidades + ").");
        }

        if (myDemoAppMyCartScreen.isNoItemTitleDisplayed()) {
            throw new AssertionError("Fallo: No hay productos en el carrito.");
        }

        myDemoAppMyCartScreen.checkoutButton();
        myDemoAppMyCartScreen.viewLogin();
    }
}

