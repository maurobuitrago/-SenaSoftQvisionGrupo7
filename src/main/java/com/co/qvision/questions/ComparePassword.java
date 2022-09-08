package com.co.qvision.questions;

import com.co.qvision.userinterfaces.AccountPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ComparePassword implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(AccountPage.COMPARE_PASSWORD).viewedBy(actor).asString();
    }

    public static ComparePassword compare(){
        return new ComparePassword();
    }
}
