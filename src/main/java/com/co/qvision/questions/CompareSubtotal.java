package com.co.qvision.questions;

import com.co.qvision.userinterfaces.ShoppingCartPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class CompareSubtotal implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(ShoppingCartPage.TXT_SUBTOTAL).viewedBy(actor).asString();
    }
    public static CompareSubtotal compare() {
        return new CompareSubtotal();
    }
}
