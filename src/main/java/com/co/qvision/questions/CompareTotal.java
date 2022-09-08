package com.co.qvision.questions;

import com.co.qvision.userinterfaces.MyAccountPage;
import com.co.qvision.userinterfaces.ShoppingCartPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.Map;

public class CompareTotal implements Question {

    public static CompareTotal compare() {
        return new CompareTotal();
    }

    //If the question of the unit price is equal to the question of the subtotal of the purchase after increasing its units,
    // then the test will be false
    //if they are different it will be true

    @Override
    public Boolean answeredBy(Actor actor) {
        if(QuestionPrice.compare().equals(QuestionSubtotal.compare())){
            return false;
        }else {
            return true;
        }


    }
}
