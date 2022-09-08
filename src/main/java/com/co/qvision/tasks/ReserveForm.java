package com.co.qvision.tasks;

import com.co.qvision.interactions.WaitElement;
import com.co.qvision.userinterfaces.ShoesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.Map;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ReserveForm implements Task {


    private final Map<String, String> mapReserve;

    public ReserveForm(Map<String, String> mapReserve) {
        this.mapReserve = mapReserve;
    }


    public static ReserveForm reserve(Map<String, String> mapReserve) {
        return instrumented(ReserveForm.class, mapReserve);
    }



    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Enter.theValue(mapReserve.get("name")).into(ShoesPage.INPUT_NAME));
        actor.attemptsTo(Enter.theValue(mapReserve.get("email")).into(ShoesPage.INPUT_EMAIL));
        actor.attemptsTo(Enter.theValue(mapReserve.get("number")).into(ShoesPage.INPUT_TEL));
        actor.attemptsTo(Enter.theValue(mapReserve.get("document")).into(ShoesPage.INPUT_DOC));
        actor.attemptsTo(Click.on(ShoesPage.BTN_RESERVE_SEND));
        actor.attemptsTo(WaitElement.untilAppears(ShoesPage.TXT_RESERVE));
    }
}
