package com.co.qvision.questions;

import com.co.qvision.userinterfaces.MyAccountUpdateCrendentialsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.*;
import net.thucydides.core.webdriver.javascript.JavascriptExecutorFacade;
import org.openqa.selenium.remote.server.Session;
import org.openqa.selenium.remote.server.handler.ExecuteScript;

import java.util.Map;

public class CompareUpdate implements Question {

    private final Map<String, String> map;

    public CompareUpdate(Map<String, String> map){
        this.map = map;
    }

    @Override
    public Object answeredBy(Actor actor) {
        //return Value.of(MyAccountUpdateCrendentialsPage.INPUT_NAME_USER).viewedBy(actor).asString();
        return MyAccountUpdateCrendentialsPage.INPUT_NAME_USER.resolveFor(actor).getValue().contains(map.get("name"));
    }


    public static CompareUpdate compareUpdate(Map<String, String> map){
        return new CompareUpdate(map);
    }
}
