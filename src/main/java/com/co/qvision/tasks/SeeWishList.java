package com.co.qvision.tasks;

import com.co.qvision.userinterfaces.ListWishesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SeeWishList implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ListWishesPage.BTN_OPEN_MENU));
        actor.attemptsTo(Click.on(ListWishesPage.BTN_MI_ACCOUNT_MENU));
        actor.attemptsTo(Click.on(ListWishesPage.BTN_LIST_WISHES));
    }

    public static SeeWishList seeWishList(){
        return Tasks.instrumented(SeeWishList.class);
    }
}
