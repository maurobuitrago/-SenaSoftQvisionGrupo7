package com.co.qvision.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ShoesPage {

    //SELECT A RANDOM PRODUCT FOR VALIDATE

    //get a random integer number from 1 to 3 for shoe size
    static int aleatorySize = (int) Math.floor(Math.random()*(3-1+1)+1);
    static int aleatorySizeOutStock = (int) Math.floor(Math.random()*(3-1+1)+1);
    //get a random integer from 1 to 10 to select the product
    static int aleatoryProduct = (int) Math.floor(Math.random()*(10-1+1)+1);


    //the button of a random size on stock of a random product is selected and clicked
    public static final Target BTN_SIZE_ = Target.the("random size button of shoes")
            .locatedBy("//ul[@class=\"products columns-3\"]/li["+aleatoryProduct+"]/div/div/div/div[@class=\"sizes_options\"]/div[@class=\"size \"]["+aleatorySize+"]");
    //the button of a random size out of stock of a random product is selected and clicked
    public static final Target BTN_SIZE_OUT_STOCK = Target.the("random size out of stock button of shoes")
            .locatedBy("//ul[@class=\"products columns-3\"]/li["+aleatoryProduct+"]/div/div/div/div[@class=\"sizes_options\"]/div[@class=\"size out_of_stock\"]["+aleatorySizeOutStock+"]");
    //the button purchase of a random product is selected and clicked
    public static final Target BTN_PURCHASE = Target.the("random button buy of shoes ")
            .locatedBy("//ul[@class=\"products columns-3\"]/li["+aleatoryProduct+"]/div/div/div[2]/a");

    //the button reserve of a random product is clicked
    public static final Target BTN_RESERVE = Target.the("random button reserve of shoes ")
            .locatedBy("//ul[@class=\"products columns-3\"]/li["+aleatoryProduct+"]/div/div/div[2]/div[@class=\"fake_button reservar\"]");

    //the button open the shopping card is clicked
    public static final Target BTN_CART = Target.the("button open shopping cart")
            .locatedBy("//p/a[@href=\"https://www.bon-bonite.com/carrito/\"]");

    public static final Target TXT_PRICE = Target.the("price for the unity")
            .locatedBy("//td[4]/span/bdi/text()");
}
