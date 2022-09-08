package com.co.qvision.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class FinalizatePurchasePage {

    public static final Target A_ACESS = Target.the("href of acess with an account")
            .locatedBy("//div[@class=\"woocommerce-info\"]");
    public static final Target INPUT_DOCUMENT = Target.the("input of id document")
            .locatedBy("//input[@id=\"username\"]");
    public static final Target INPUT_PASSWORD = Target.the("input type password")
            .locatedBy("//input[@id=\"password\"]");
    public static final Target INPUT_ACESS = Target.the("button to acess")
            .locatedBy("//button[@name=\"login\"]");
    public static final Target CHBOX_TREADMENT = Target.the("checkbox to treadment of personal data")
            .locatedBy("//input[@name=\"terms\"]");
    public static final Target BTN_PAY = Target.the("button to pay")
            .locatedBy("//button[@value=\"Realizar el pedido\"]");

    public static final Target TXT_PAYMENT = Target.the("text of pay method")
            .locatedBy("//span[text()=\"Escoge un método de pago\"]");
}
