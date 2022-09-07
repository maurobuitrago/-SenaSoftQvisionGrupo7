package com.co.qvision.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class IndexPage {
    public static final Target BTN_LOG = Target.the("Button account in the index")
            .locatedBy("//a[@href='https://www.bon-bonite.com/mi-cuenta/']");
}
