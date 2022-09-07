package com.co.qvision.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage{
    // This locator get the button type burger element to open de side menu
    public static final Target BTN_OPEN_MENU = Target.the("Button open menu").locatedBy("//div[@id='burger']");
    // This locator get the button menu element to go my account
    public static final Target BTN_MI_ACCOUNT_MENU = Target.the("Button my account").locatedBy("//a[text()='Mi cuenta']");

    // This locator get the button menu shoes
    public static final Target BTN_SHOES_PRODUCT = Target.the("Button shoes").locatedBy("//li[@id='menu-item-10']");
}
