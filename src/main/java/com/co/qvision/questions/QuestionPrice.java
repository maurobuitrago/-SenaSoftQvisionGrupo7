package com.co.qvision.questions;

import com.co.qvision.userinterfaces.ShoppingCartPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class QuestionPrice implements Question {

    //get the unit price of the product as a string
    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(ShoppingCartPage.TXT_PRICE).viewedBy(actor).asString();
    }


    public static QuestionPrice compare() {
        return new QuestionPrice();

    }
}
