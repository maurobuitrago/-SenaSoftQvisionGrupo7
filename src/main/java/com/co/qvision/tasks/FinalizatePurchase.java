package com.co.qvision.tasks;

import com.co.qvision.models.Credentials;
import com.co.qvision.userinterfaces.BagsPage;
import com.co.qvision.userinterfaces.FinalizatePurchasePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.EnterValue;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.conditions.Check;

public class FinalizatePurchase implements Task {


    Credentials credentials;

    public FinalizatePurchase(Credentials credentials) {
        this.credentials = credentials;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BagsPage.BTN_FINALIZAR_PURCHASE));
        actor.attemptsTo(Click.on(FinalizatePurchasePage.A_ACESS));
        actor.attemptsTo(Enter.theValue(credentials.getDocument()).into(FinalizatePurchasePage.INPUT_DOCUMENT));
        actor.attemptsTo(Enter.theValue(credentials.getPassword()).into(FinalizatePurchasePage.INPUT_PASSWORD));
        actor.attemptsTo(Click.on(FinalizatePurchasePage.INPUT_ACESS));
        actor.attemptsTo(Scroll.to(FinalizatePurchasePage.CHBOX_TREADMENT));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actor.attemptsTo(Click.on(FinalizatePurchasePage.BTN_PAY));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }




    }
    public static FinalizatePurchase finalizate(Credentials credentials){
        return Tasks.instrumented(FinalizatePurchase.class, credentials);
    }
}
