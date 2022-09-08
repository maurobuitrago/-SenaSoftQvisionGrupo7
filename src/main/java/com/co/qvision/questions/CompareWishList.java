package com.co.qvision.questions;


import com.co.qvision.userinterfaces.ListWishesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class CompareWishList implements Question {
    @Override
    public Object answeredBy(Actor actor) {
       return Text.of(ListWishesPage.TXT_NAME_PRODUCT).viewedBy(actor).asString();
    }

    public static CompareWishList compareWishList(){
        return new CompareWishList();
    }
}
