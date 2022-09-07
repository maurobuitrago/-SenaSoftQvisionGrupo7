package com.co.qvision.tasks;

import com.co.qvision.userinterfaces.IndexPage;
import com.co.qvision.userinterfaces.ShoesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Cart implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(IndexPage.BTN_SHOES));
        actor.attemptsTo(Click.on(ShoesPage.BTN_SIZE));
        actor.attemptsTo(Click.on(ShoesPage.BTN_PURCHASE));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actor.attemptsTo(Click.on(ShoesPage.BTN_CART));


    }

    public static Cart add(){
        return Tasks.instrumented(Cart.class);
    }
}
