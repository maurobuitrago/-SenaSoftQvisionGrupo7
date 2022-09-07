package com.co.qvision.questions;

import com.co.qvision.userinterfaces.MyAccountPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.Map;

public class CompareHello implements Question {

    private final Map<String, String> mapCredentials;

    public CompareHello(Map<String, String> mapCredentials) {
        this.mapCredentials = mapCredentials;
    }


    public static CompareHello compare(Map<String, String> mapCredentials) {
        return new CompareHello(mapCredentials);
    }



    @Override
    public Boolean answeredBy(Actor actor) {
        return MyAccountPage.COMPARE_HELLO.resolveFor(actor).getText().contains(mapCredentials.get("document"));

    }

}
