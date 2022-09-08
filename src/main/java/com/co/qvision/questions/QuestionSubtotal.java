package com.co.qvision.questions;

import com.co.qvision.userinterfaces.ShoppingCartPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class QuestionSubtotal implements Question {

    //get the subtotal of the purchase as a string
    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(ShoppingCartPage.TXT_SUBTOTAL).viewedBy(actor).asString();
    }
    public static QuestionSubtotal compare() {
        return new QuestionSubtotal();
    }

}
