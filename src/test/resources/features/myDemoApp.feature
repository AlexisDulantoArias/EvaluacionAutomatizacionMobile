@run
Feature: Carrito de compras de MyDemoApp

  @carritoDeCompras
  Scenario Outline: Validacion de carrito de compras

    Given estoy en la aplicación de SauceLabs
    And valido que carguen correctamente los productos en la galeria
    When agrego <unidades> del siguiente producto "<producto>"
    Then valido el carrito de compra actualice correctamente <unidades>
    Examples:
      | producto                  | unidades |
      | Sauce Labs Backpack       | 1        |
      | Sauce Labs Bolt - T-Shirt | 1        |
      | Sauce Labs Bike Light     | 2        |