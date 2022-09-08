package com.co.qvision.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ListWishesPage {
    // This locator get the button type burger element to open de side menu
    public static final Target BTN_OPEN_MENU = Target.the("Button open menu").locatedBy("//div[@id='burger']");
    // This locator get the button menu element to go my account
    public static final Target BTN_MI_ACCOUNT_MENU = Target.the("Button my account").locatedBy("//a[text()='Mi cuenta']");
     public static final Target BTN_LIST_WISHES = Target.the("Option list wishes").locatedBy("//a[text()='Lista de deseos']");
     public static final Target TXT_NAME_PRODUCT = Target.the("Name of product list wish").locatedBy("//a[text()='Bolso bombonera en cuero grabado color frambuesa']");
}
