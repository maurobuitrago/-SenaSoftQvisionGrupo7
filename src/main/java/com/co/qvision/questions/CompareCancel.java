package com.co.qvision.questions;

import com.co.qvision.userinterfaces.MyAccountPage;
import com.co.qvision.userinterfaces.ShoesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class CompareCancel implements Question {

    @Override
    public Object answeredBy(Actor actor) {

        return Text.of(MyAccountPage.ALERT_CANCEL).viewedBy(actor).asString();
    }


    public static CompareCancel compare() {
        return new CompareCancel();

    }
}
