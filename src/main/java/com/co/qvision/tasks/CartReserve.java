package com.co.qvision.tasks;

import com.co.qvision.userinterfaces.IndexPage;
import com.co.qvision.userinterfaces.ShoesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class CartReserve implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(IndexPage.BTN_SHOES));
        actor.attemptsTo(Click.on(ShoesPage.BTN_SIZE_OUT_STOCK));
        actor.attemptsTo(Click.on(ShoesPage.BTN_RESERVE));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
    public static CartReserve reserve(){
        return Tasks.instrumented(CartReserve.class);
    }
}
