package com.co.qvision.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ShoesPage {

    //SELECT A RANDOM PRODUCT FOR VALIDATE

    //get a random integer number from 1 to 3 for shoe size
    static int aleatorySize = (int) Math.floor(Math.random()*(3-1+1)+1);
    static int aleatorySizeOutStock = (int) Math.floor(Math.random()*(3-1+1)+1);
    //get a random integer from 1 to 10 to select the product
    static int aleatoryProduct = (int) Math.floor(Math.random()*(6-1+1)+1);

    public static final Target OPTION_PRODUCT = Target.the("random product")
            .locatedBy("//ul[@class=\"products columns-3\"]/li["+aleatoryProduct+"]");

    //------------------------------------PURCHASE PRODUCT---------------------------------
    //the button of a random size on stock of a random product is selected and clicked
    public static final Target BTN_SIZE_ = Target.the("random size button of shoes")
            .locatedBy("//ul[@class=\"products columns-3\"]/li["+aleatoryProduct+"]/div/div/div/div[@class=\"sizes_options\"]/div[@class=\"size \"]["+aleatorySize+"]");
    //the button purchase of a random product is selected and clicked
    public static final Target BTN_PURCHASE = Target.the("random button buy of shoes ")
            .locatedBy("//ul[@class=\"products columns-3\"]/li["+aleatoryProduct+"]/div/div/div[2]/a");

    //the button open the shopping card is clicked
    public static final Target BTN_CART = Target.the("button open shopping cart")
            .locatedBy("//p/a[@href=\"https://www.bon-bonite.com/carrito/\"]");



    //--------------------------------------RESERVE PRODUCT---------------------------------

    //the button of a random size out of stock of a random product is selected and clicked
    public static final Target BTN_SIZE_OUT_STOCK = Target.the("random size out of stock button of shoes")
            .locatedBy("//ul[@class=\"products columns-3\"]/li["+aleatoryProduct+"]/div/div/div/div[@class=\"sizes_options\"]/div[@class=\"size out_of_stock\"]["+aleatorySizeOutStock+"]");

    //the button reserve of a random product is clicked
    public static final Target BTN_RESERVE = Target.the("random button reserve of shoes ")
            .locatedBy("//ul[@class=\"products columns-3\"]/li["+aleatoryProduct+"]/div/div/div[2]/div[@class=\"fake_button reservar\"]");
    //enter the name of the actor
    public static final Target INPUT_NAME = Target.the("input type text for the name user")
            .locatedBy("//input[@name=\"your-name\"]");
    //enter the email of the actor
    public static final Target INPUT_EMAIL = Target.the("input type text for the user email")
            .locatedBy("//input[@type=\"email\"]");
    //enter the number of the actor
    public static final Target INPUT_TEL = Target.the("input type text for the number user")
            .locatedBy("//input[@name=\"your-tel\"]");
    //enter the document of the actor
    public static final Target INPUT_DOC = Target.the("input type text for the document user")
            .locatedBy("//input[@name=\"your-ceudla\"]");
    //click in button reserve to confirm
    public static final Target BTN_RESERVE_SEND = Target.the("button to send the reserve of shoes")
            .locatedBy("//input[@value=\"Reservar\"]");

    //text of reserve confirmed
    public static final Target TXT_RESERVE = Target.the("text of the message confirmation of the reserve")
            .locatedBy("//div[contains(text(),'Gracias por tu mensaje. Ha sido enviado.')]");
}

