package com.co.qvision.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class MyAccountLoginPage {

    // This locator get the input id user
    public static final Target INPUT_ID_USER = Target.the("Input to enter id user").locatedBy("//input[@id='username']");
    // This locator get the input password user
    public static final Target INPUT_PASSWORD_USER = Target.the("Input to enter password user").locatedBy("//input[@id='password']");
    // This locator get the button to log in the credentials
    public static final Target BTN_LOG_IN = Target.the("Button log in").locatedBy("//button[@name='login']");

}
