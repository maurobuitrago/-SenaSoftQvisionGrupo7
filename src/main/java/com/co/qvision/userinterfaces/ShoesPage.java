package com.co.qvision.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ShoesPage {
    public static final Target BTN_DROPDOWN_RANGE_PRICE = Target.the("Button dropdown filter").locatedBy("//div[@class='more_filters']");
    public static Target selectRange(String rangePrice){
        return Target.the("Price range").locatedBy("//div[@class='options_precio']/div[" + rangePrice + "]");
    }
    public static final Target BTN_FILTER_PRODUCT = Target.the("Button filter").locatedBy("//a[@id='filtrar_button']");
}

