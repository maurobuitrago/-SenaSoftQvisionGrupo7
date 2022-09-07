package com.co.qvision.tasks;

import com.co.qvision.models.LoginCredentials;
import com.co.qvision.models.UpdateCredentials;
import com.co.qvision.userinterfaces.MyAccountPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class MyAccount implements Task {
    // Instance of model loginCredentials
    LoginCredentials loginCredentials;
    UpdateCredentials updateCredentials;

    public MyAccount(LoginCredentials loginCredentials, UpdateCredentials updateCredentials) {
        this.loginCredentials = loginCredentials;
        this.updateCredentials = updateCredentials;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        // Login the actor
        logIn(actor);

        // Update credentials actor
        // updateCredentials(actor);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }



    // METHODS DEFINITIONS ----------------------------------------------------------------------------------------

    // This method return all tasks of MyAccount
    public static MyAccount enterCredentials(LoginCredentials loginCredentials) {
        return Tasks.instrumented(MyAccount.class, loginCredentials);
    }

    public static  MyAccount updateData(UpdateCredentials updateCredentials){
        return Tasks.instrumented(MyAccount.class, updateCredentials);
    }

    // Method search elements and enter data to log in
    public <T extends Actor> void logIn(T actor) {

        // Enter the user id from model loginCredentials
        actor.attemptsTo(Enter.theValue(loginCredentials.getIdUser()).into(MyAccountPage.INPUT_ID_USER));

        // Enter the user password from model loginCredentials
        actor.attemptsTo(Enter.theValue(loginCredentials.getPassword()).into(MyAccountPage.INPUT_PASSWORD_USER));

        // Click on the button to log in the loginCredentials
        actor.attemptsTo(Click.on(MyAccountPage.BTN_LOG_IN));
    }


    // Method search elements and enter the data in form edit account
    public <T extends Actor> void updateCredentials(T actor) {

        // Click on the button to go form detail account
        actor.attemptsTo(Click.on(MyAccountPage.BTN_DETAIL_ACCOUNT));

        // Enter the name from model update credentials
        actor.attemptsTo(Enter.theValue(updateCredentials.getName()).into(MyAccountPage.INPUT_NAME_USER));

        // Enter the last name from model update credentials
        actor.attemptsTo(Enter.theValue(updateCredentials.getLastName()).into(MyAccountPage.INPUT_LAST_NAME_USER));

        // Enter the email from model update credentials
        actor.attemptsTo(Enter.theValue(updateCredentials.getEmail()).into(MyAccountPage.INPUT_EMAIL_USER));

        // Enter the current password from model update credentials
        actor.attemptsTo(Enter.theValue(updateCredentials.getCurrentPassword()).into(MyAccountPage.INPUT_CURRENT_PASSWORD));

        // Enter the new password from model update credentials
        actor.attemptsTo(Enter.theValue(updateCredentials.getNewPassword()).into(MyAccountPage.INPUT_NEW_PASSWORD));
        actor.attemptsTo(Enter.theValue(updateCredentials.getNewPassword()).into(MyAccountPage.INPUT_CONFIRM_NEW_PASSWORD));
    }


}
