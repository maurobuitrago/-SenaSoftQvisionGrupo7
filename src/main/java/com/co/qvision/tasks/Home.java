package com.co.qvision.tasks;

import com.co.qvision.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Home implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        // Click on the button burger to open menu
        actor.attemptsTo(Click.on(HomePage.BTN_OPEN_MENU));
        // Click on the option my account
        actor.attemptsTo(Click.on(HomePage.BTN_MI_ACCOUNT_MENU));

    }
    public static Home seeMyAccount(){
        return Tasks.instrumented(Home.class);
    }

}
