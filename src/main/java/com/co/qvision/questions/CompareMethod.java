package com.co.qvision.questions;

import com.co.qvision.userinterfaces.FinalizatePurchasePage;
import com.co.qvision.userinterfaces.ShoesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class CompareMethod implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(FinalizatePurchasePage.TXT_PAYMENT).viewedBy(actor).asString();
    }
    public static CompareMethod compare() {
        return new CompareMethod();
    }
}
