package com.co.qvision.tasks;

import com.co.qvision.models.UpdateCredentials;
import com.co.qvision.userinterfaces.MyAccountUpdateCrendentialsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class MyAccountUpdateCredentials implements Task {
    // Instance of model UpdateCredentials
    UpdateCredentials updateCredentials;

    public MyAccountUpdateCredentials(UpdateCredentials updateCredentials){
        this.updateCredentials = updateCredentials;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        // Click on the button to go form detail account
        actor.attemptsTo(Click.on(MyAccountUpdateCrendentialsPage.BTN_DETAIL_ACCOUNT));

        // Enter the name from model update credentials
        actor.attemptsTo(Enter.theValue(updateCredentials.getName()).into(MyAccountUpdateCrendentialsPage.INPUT_NAME_USER));

        // Enter the last name from model update credentials
        actor.attemptsTo(Enter.theValue(updateCredentials.getLastName()).into(MyAccountUpdateCrendentialsPage.INPUT_LAST_NAME_USER));

        // Enter the email from model update credentials
        actor.attemptsTo(Enter.theValue(updateCredentials.getEmail()).into(MyAccountUpdateCrendentialsPage.INPUT_EMAIL_USER));

        // Enter the current password from model update credentials
        actor.attemptsTo(Enter.theValue(updateCredentials.getCurrentPassword()).into(MyAccountUpdateCrendentialsPage.INPUT_CURRENT_PASSWORD));

        // Enter the new password from model update credentials
        actor.attemptsTo(Enter.theValue(updateCredentials.getNewPassword()).into(MyAccountUpdateCrendentialsPage.INPUT_NEW_PASSWORD));
        actor.attemptsTo(Enter.theValue(updateCredentials.getNewPassword()).into(MyAccountUpdateCrendentialsPage.INPUT_CONFIRM_NEW_PASSWORD));

        // Clik on the button update credentials
        actor.attemptsTo(Click.on(MyAccountUpdateCrendentialsPage.BTN_SAVE_CHANGES));
    }

    // This method return all tasks of MyAccountUpdateCredentials
    public static MyAccountUpdateCredentials updateCredentials(UpdateCredentials updateCredentials){
        return Tasks.instrumented(MyAccountUpdateCredentials.class, updateCredentials);
    }
}
