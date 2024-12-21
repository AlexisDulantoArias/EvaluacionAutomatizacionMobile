package com.nttdata.stepsdefinitions;

import com.nttdata.steps.MyDemoAppSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;

public class MyDemoAppStepsDefs {

    @Steps
    MyDemoAppSteps myDemoAppSteps;

    @Given("estoy en la aplicación de SauceLabs")
    public void estoyEnLaAplicacionDeSauceLabs() {
    }

    @And("valido que carguen correctamente los productos en la galeria")
    public void validoQueCarguenCorrectamenteLosProductosEnLaGaleria() {
        myDemoAppSteps.validateLblProduct();
    }

    @When("agrego {} del siguiente producto {string}")
    public void agregoDelSiguienteProducto(int unidades, String producto) {
        myDemoAppSteps.addProducts(unidades, producto);
    }

    @Then("valido el carrito de compra actualice correctamente {}")
    public void validoElCarritoDeCompraActualiceCorrectamente(int unidades) {
        myDemoAppSteps.validateCartUpdate(unidades);
    }
}
