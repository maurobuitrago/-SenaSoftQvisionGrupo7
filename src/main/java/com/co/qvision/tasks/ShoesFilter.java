package com.co.qvision.tasks;

import com.co.qvision.interactions.WaitElement;
import com.co.qvision.models.RangePrices;
import com.co.qvision.userinterfaces.ShoesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class ShoesFilter implements Task {
    RangePrices rangePrices;

    public ShoesFilter(RangePrices rangePrices){
        this.rangePrices = rangePrices;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ShoesPage.BTN_SHOES_MENU));
        // Click on button filter to dropdown options
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actor.attemptsTo(Click.on(ShoesPage.BTN_DROPDOWN_RANGE_PRICE));

        // Click on the range selected
        actor.attemptsTo(WaitElement.untilBeEnable(ShoesPage.selectRange(rangePrices.getRange())));
        actor.attemptsTo(Click.on(ShoesPage.selectRange(rangePrices.getRange())));
        actor.attemptsTo(Click.on(ShoesPage.BTN_FILTER_PRODUCT));
    }

    public static ShoesFilter selectRange(RangePrices rangePrices) {
        return Tasks.instrumented(ShoesFilter.class, rangePrices);
    }

}