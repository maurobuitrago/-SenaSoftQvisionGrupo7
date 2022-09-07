package com.co.qvision.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class AccountPage {

    public static final Target TXT_DOCUMENT = Target.the("Input tipe txt for the document")
            .locatedBy("//input[@id=\"username\"]");

    public static final  Target TXT_PASSWORD = Target.the("Input type password")
            .locatedBy("//input[@id=\"password\"]");

    public static final  Target BTN_lOGIN = Target.the("Button for the login")
            .locatedBy("//button[@value=\"Acceder\"]");

}
