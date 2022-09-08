package com.co.qvision.tasks;

import com.co.qvision.models.Credentials;
import com.co.qvision.userinterfaces.AccountPage;
import com.co.qvision.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import com.co.qvision.interactions.WaitElement;

public class Login implements Task {

    //bring credentials
    Credentials credentials;

    public Login(Credentials credentials) {
        this.credentials = credentials;
    }

    //interact with the different pages to make the login
    @Override
    public <T extends Actor> void performAs(T actor) {

        // Enter to the login menu
        actor.attemptsTo(Click.on(HomePage.BTN_OPEN_MENU));
        actor.attemptsTo(Click.on(HomePage.BTN_MI_ACCOUNT_MENU));

        // Enter credentials
        actor.attemptsTo(WaitElement.untilBeEnable(AccountPage.INPUT_DOCUMENT));
        actor.attemptsTo(Enter.theValue(credentials.getDocument()).into(AccountPage.INPUT_DOCUMENT));
        actor.attemptsTo(Enter.theValue(credentials.getPassword()).into(AccountPage.INPUT_PASSWORD));
        actor.attemptsTo(WaitElement.untilBeEnable(AccountPage.BTN_lOGIN));
        actor.attemptsTo(Click.on(AccountPage.BTN_lOGIN));


    }
    public static Login enterCredentials(Credentials credentials) {
        return Tasks.instrumented(Login.class, credentials);
    }
}
