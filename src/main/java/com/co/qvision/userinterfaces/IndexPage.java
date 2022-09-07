package com.co.qvision.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class IndexPage {
    //mapped elements of the bonbonite home page
    public static final Target BTN_LOG = Target.the("Button account in the index")
            .locatedBy("//a[@href='https://www.bon-bonite.com/mi-cuenta/']");

    public static final Target BTN_SHOES = Target.the("Option shoes of the menu")
            .locatedBy("//*[@id=\"menu-item-10\"]/a");
}
