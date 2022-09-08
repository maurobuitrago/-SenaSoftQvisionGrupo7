package com.co.qvision.questions;

import com.co.qvision.userinterfaces.ShoesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class CompareRange implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(ShoesPage.TXT_RESULT_FILTER).viewedBy(actor).asString();
    }

    public static CompareRange compareRange(){
        return new CompareRange();
    }
}
