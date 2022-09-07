package com.co.qvision.tasks;

import com.co.qvision.models.RangePrices;
import com.co.qvision.userinterfaces.ShoesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Shoes implements Task {
    RangePrices rangePrices;

    public Shoes (RangePrices rangePrices){
        this.rangePrices = rangePrices;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ShoesPage.BTN_DROPDOWN_RANGE_PRICE));
        actor.attemptsTo(Click.on(ShoesPage.selectRange(rangePrices.getRange())));
        actor.attemptsTo(Click.on(ShoesPage.BTN_FILTER_PRODUCT));
    }

    public static Shoes selectRange(RangePrices rangePrices) {
        return Tasks.instrumented(Shoes.class, rangePrices);
    }

}
