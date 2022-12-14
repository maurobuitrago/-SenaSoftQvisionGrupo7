package com.co.qvision.tasks;

import com.co.qvision.userinterfaces.HomePage;
import com.co.qvision.userinterfaces.ShoesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

public class CartReserve implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        //Open option menu shoes
        actor.attemptsTo(Click.on(HomePage.BTN_OPEN_MENU));
        actor.attemptsTo(Click.on(HomePage.BTN_SHOES_PRODUCT));

        //Select size out of stock and reserve
        actor.attemptsTo(Scroll.to(ShoesPage.OPTION_PRODUCT));
        actor.attemptsTo(Click.on(ShoesPage.BTN_SIZE_OUT_STOCK));
        actor.attemptsTo(Click.on(ShoesPage.BTN_RESERVE));


    }
    public static CartReserve reserve(){
        return Tasks.instrumented(CartReserve.class);
    }
}
