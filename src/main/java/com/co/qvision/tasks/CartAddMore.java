package com.co.qvision.tasks;

import com.co.qvision.interactions.WaitElement;
import com.co.qvision.userinterfaces.BagsPage;
import com.co.qvision.userinterfaces.HomePage;
import com.co.qvision.userinterfaces.ShoesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouseToBy;
import net.serenitybdd.screenplay.actions.MoveMouseToWebElement;

public class CartAddMore implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(HomePage.BTN_BAGS_PRODUCT));
        actor.attemptsTo(Click.on(BagsPage.BTN_PURCHASE));
        actor.attemptsTo(WaitElement.untilDisappears(BagsPage.BTN_PURCHASE));
        actor.attemptsTo(Click.on(BagsPage.BTN_CART));


    }

    public static CartAddMore add(){
        return Tasks.instrumented(CartAddMore.class);
    }
}
