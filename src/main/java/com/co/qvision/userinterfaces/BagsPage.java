package com.co.qvision.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class BagsPage {


    public static final Target BTN_PURCHASE = Target.the("Click on the button comprar")
            .locatedBy("//a[@data-product_id=\"205468\"]");

    public static final Target BTN_CART = Target.the("button open shopping cart")
            .locatedBy("//p/a[1]");

    public static final Target BTN_FINALIZAR_PURCHASE = Target.the("button to finalizate a purchase")
            .locatedBy("//div/a[@href=\"https://www.bon-bonite.com/finalizar-compra/\"]");
}
