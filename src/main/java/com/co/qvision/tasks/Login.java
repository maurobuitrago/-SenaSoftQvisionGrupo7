package com.co.qvision.tasks;

import com.co.qvision.userinterfaces.AccountPage;
import com.co.qvision.userinterfaces.IndexPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import com.co.qvision.interactions.WaitElement;

public class Login implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(IndexPage.BTN_LOG));
        actor.attemptsTo(WaitElement.untilBeEnable(AccountPage.TXT_DOCUMENT));
        actor.attemptsTo(Enter.theValue("1014856939").into(AccountPage.TXT_DOCUMENT));
        actor.attemptsTo(Enter.theValue("g.8uw69JywvUmM2").into(AccountPage.TXT_PASSWORD));
        actor.attemptsTo(WaitElement.untilBeEnable(AccountPage.BTN_lOGIN));
        actor.attemptsTo(Click.on(AccountPage.BTN_lOGIN));


    }
    public static Login enter() {
        return Tasks.instrumented(Login.class);
    }
}
