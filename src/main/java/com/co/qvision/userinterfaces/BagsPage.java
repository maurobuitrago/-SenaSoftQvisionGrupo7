package com.co.qvision.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class BagsPage {
    public static final Target BTN_PURCHASE = Target.the("Click on the button comprar")
            .locatedBy("//a[@data-product_id=\"205468\"]");

    public static final Target BTN_CART = Target.the("button open shopping cart")
            .locatedBy("//p/a[1]");

    public static final Target BTN_FINALIZAR_PURCHASE = Target.the("button to finalizate a purchase")
            .locatedBy("//div/a[@href=\"https://www.bon-bonite.com/finalizar-compra/\"]");

    public static final Target BUTTON_MENU_BAG = Target.the("Button navigate to the bag products").locatedBy("//li[@id='menu-item-8']");
    public static final Target BAG_PRODUCT_ELEMENT = Target.the("The product element").locatedBy("//ul[@class='products columns-3']/li[1]/a");
    public static final Target TXT_NAME_PRODUCT = Target.the("Name of product").locatedBy("//h1");

    public static final Target BUTTON_ADD_LIST_WISHES = Target.the("Button add list wishes").locatedBy("//span[text()='Añadir a Lista de deseos']");
}
