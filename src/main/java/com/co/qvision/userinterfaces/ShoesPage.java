package com.co.qvision.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ShoesPage {

    static int aleatorySize = (int) Math.floor(Math.random()*(5-1+1)+1);

    public static final Target BTN_SIZE = Target.the("select random button of shoes")
            .locatedBy("//ul[@class=\"products columns-3\"]/li[1]/div/div/div/div[3]/div[@class=\"size \"]["+aleatorySize+"]");
    public static final Target BTN_SIZE1 = Target.the("Input for select size")
            .locatedBy("");
    public static final Target BTN_PURCHASE1 = Target.the("button to buy shoes ")
            .locatedBy("//input[@id=\"username\"]");
}
