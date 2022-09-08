package com.co.qvision.tasks;

import com.co.qvision.userinterfaces.BagsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class BagWishesList implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actor.attemptsTo(Click.on(BagsPage.BUTTON_MENU_BAG));
        actor.attemptsTo(Click.on(BagsPage.BAG_PRODUCT_ELEMENT));
        actor.attemptsTo(Click.on(BagsPage.BUTTON_ADD_LIST_WISHES));
    }

    public static BagWishesList addBagWishesList(){
        return Tasks.instrumented(BagWishesList.class);
    }
}
