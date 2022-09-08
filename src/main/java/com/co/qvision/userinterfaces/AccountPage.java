package com.co.qvision.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class AccountPage {
    //mapped elements of the bonbonite login and register page


    public static final Target INPUT_DOCUMENT = Target.the("Input tipe txt for the document")
            .locatedBy("//input[@id=\"username\"]");

    public static final  Target INPUT_PASSWORD = Target.the("Input type password")
            .locatedBy("//input[@id=\"password\"]");

    public static final  Target BTN_lOGIN = Target.the("Button for the login")
            .locatedBy("//button[@value=\"Acceder\"]");
    public static final Target COMPARE_PASSWORD = Target.the("compare the password")
            .locatedBy("//ul/li[contains(text(),': la contraseña que has introducido para el nombre de usuario ')]");
    public static final Target COMPARE_DOCUMENT = Target.the("compare the document")
            .locatedBy("//ul/li[contains(text(),': El nombre de usuario')]");

}
