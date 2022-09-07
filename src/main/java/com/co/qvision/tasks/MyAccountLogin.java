package com.co.qvision.tasks;

import com.co.qvision.models.LoginCredentials;
import com.co.qvision.userinterfaces.MyAccountLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class MyAccountLogin implements Task {
    // Instance of model loginCredentials
    LoginCredentials loginCredentials;

    public MyAccountLogin(LoginCredentials loginCredentials) {
        this.loginCredentials = loginCredentials;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        // Enter the user id from model loginCredentials
        actor.attemptsTo(Enter.theValue(loginCredentials.getIdUser()).into(MyAccountLoginPage.INPUT_ID_USER));

        // Enter the user password from model loginCredentials
        actor.attemptsTo(Enter.theValue(loginCredentials.getPassword()).into(MyAccountLoginPage.INPUT_PASSWORD_USER));

        // Click on the button to log in the loginCredentials
        actor.attemptsTo(Click.on(MyAccountLoginPage.BTN_LOG_IN));

    }



    // METHODS DEFINITIONS ----------------------------------------------------------------------------------------

    // This method return all tasks of MyAccountLogin
    public static MyAccountLogin enterCredentials(LoginCredentials loginCredentials) {
        return Tasks.instrumented(MyAccountLogin.class, loginCredentials);
    }



}
