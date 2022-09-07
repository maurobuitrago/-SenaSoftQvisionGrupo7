package com.co.qvision.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class MyAccountPage {
    //mapped elements of the bonbonite account page

    public static final Target COMPARE_HELLO = Target.the("Welcome greeting to the page")
            .locatedBy("//p[contains(text(),'Hola')]");
}
