package com.co.qvision.tasks;

import com.co.qvision.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Home implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(HomePage.BTN_SHOES_PRODUCT));
    }

    public static Home clickShoesProducts(){
        return Tasks.instrumented(Home.class);
    }
}
