package com.co.qvision.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/java/resources/features/Login.feature",
        snippets = SnippetType.CAMELCASE,
        glue = "com.co.qvision.stepdefinitions")
public class LoginRunner {
}
