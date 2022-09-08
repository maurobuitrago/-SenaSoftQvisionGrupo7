package com.co.qvision.questions;

import com.co.qvision.userinterfaces.AccountPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class CompareDocument implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(AccountPage.COMPARE_DOCUMENT).viewedBy(actor).asString();
    }

    public static CompareDocument compare(){
        return new CompareDocument();
    }
}
