package com.co.qvision.tasks;

import com.co.qvision.userinterfaces.HomePage;
import com.co.qvision.userinterfaces.MyAccountPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class CancelOrder implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(MyAccountPage.OPTION_ORDERS));
        actor.attemptsTo(Click.on(MyAccountPage.BTN_CANCEL));
    }

    public static CancelOrder cancel(){
        return Tasks.instrumented(CancelOrder.class);
    }
}
