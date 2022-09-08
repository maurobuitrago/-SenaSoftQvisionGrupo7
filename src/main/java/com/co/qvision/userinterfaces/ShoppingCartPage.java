package com.co.qvision.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ShoppingCartPage {

    //total product units
    public static final Target TXT_QUANTITY = Target.the("total of the products")
            .locatedBy("//input[@title=\"Cantidad\"]");

    //the price of the product is compared
    public static final Target TXT_PRICE = Target.the("price for the unity")
            .locatedBy("//td[4]/span/bdi");
    public static final Target TXT_SUBTOTAL = Target.the("subtotal of products")
            .locatedBy("//td[6]/span/bdi");
}
