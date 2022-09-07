package com.co.qvision.tasks;

import com.co.qvision.models.Credentials;
import com.co.qvision.userinterfaces.MyAccountPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class MyAccount implements Task {
    // Instance of model credentials
    Credentials credentials;

    public MyAccount (Credentials credentials){
        this.credentials = credentials;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        // Enter the user id from model credentials
        actor.attemptsTo(Enter.theValue(credentials.getIdUser()).into(MyAccountPage.INPUT_ID_USER));
        // Enter the user password from model credentials
        actor.attemptsTo(Enter.theValue(credentials.getPassword()).into(MyAccountPage.INPUT_PASSWORD_USER));
        // Click on the button to log in the credentials
        actor.attemptsTo(Click.on(MyAccountPage.BTN_LOG_IN));

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        // Click on the button to go form detail account
        actor.attemptsTo(Click.on(MyAccountPage.BTN_DETAIL_ACCOUNT));
    }

    // This return all tasks of MyAccount
    public static MyAccount enterCredentilas(Credentials credentials){
        return Tasks.instrumented(MyAccount.class, credentials);
    }
}
