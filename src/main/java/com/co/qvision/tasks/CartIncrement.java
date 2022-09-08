package com.co.qvision.tasks;

import com.co.qvision.interactions.WaitElement;
import com.co.qvision.userinterfaces.ShoesPage;
import com.co.qvision.userinterfaces.ShoppingCartPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class CartIncrement implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ShoesPage.BTN_CART));
        actor.attemptsTo(WaitElement.untilBeEnable(ShoppingCartPage.TXT_QUANTITY));
        actor.attemptsTo(Click.on(ShoppingCartPage.TXT_QUANTITY));
        actor.attemptsTo(Enter.theValue("2").into(ShoppingCartPage.TXT_QUANTITY));
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static CartIncrement increment() {
        return Tasks.instrumented(CartIncrement.class);
    }
}
