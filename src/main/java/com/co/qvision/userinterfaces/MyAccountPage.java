package com.co.qvision.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class MyAccountPage {
    //mapped elements of the bonbonite account page

    public static final Target COMPARE_HELLO = Target.the("Welcome greeting to the page")
            .locatedBy("//p[contains(text(),'Hola')]");

    public static final Target OPTION_ORDERS = Target.the("Option in menu - orders")
            .locatedBy("//a[text()=\"Pedidos\"]");
    public static final Target BTN_CANCEL = Target.the("Option of cancel a order")
            .locatedBy("//*[@id=\"content\"]/div/div/div/table/tbody/tr[2]/td[5]/a[3]");
    public static final Target ALERT_CANCEL = Target.the("Alert to cancelared order")
            .locatedBy("//*[text()=\"Tu pedido se ha cancelado.\"]");
}
