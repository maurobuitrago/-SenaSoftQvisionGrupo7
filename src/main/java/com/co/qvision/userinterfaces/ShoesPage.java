package com.co.qvision.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.apache.poi.ss.formula.functions.T;

public class ShoesPage {

    //SELECT A RANDOM PRODUCT FOR VALIDATE

    //get a random integer number from 1 to 3 for shoe size
    static int aleatorySize = (int) Math.floor(Math.random()*(3-1+1)+1);

    //get a random integer from 1 to 10 to select the product
    static int aleatoryProduct = (int) Math.floor(Math.random()*(10-1+1)+1);

    //the button of a random size of a random product is selected and clicked
    public static final Target BTN_SIZE = Target.the("random size button of shoes")
            .locatedBy("//ul[@class=\"products columns-3\"]/li["+aleatoryProduct+"]/div/div/div/div[@class=\"sizes_options\"]/div[@class=\"size \"]["+aleatorySize+"]");
    //the button purchase of a random product is selected and clicked
    public static final Target BTN_PURCHASE = Target.the("random button buy of shoes ")
            .locatedBy("//ul[@class=\"products columns-3\"]/li["+aleatoryProduct+"]/div/div/div[2]/a");

    //the button open the shopping card is clicked
    public static final Target BTN_CART = Target.the("button open shopping cart")
            .locatedBy("//p/a[@href=\"https://www.bon-bonite.com/carrito/\"]");

}
