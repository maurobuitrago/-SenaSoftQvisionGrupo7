package com.co.qvision.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)

//feature route: what will be run?
//snippet: write in camelcase the steps
//glue path: how the feature will be run
@CucumberOptions(features = "src/test/java/resources/features/Cart.feature",
        snippets = SnippetType.CAMELCASE,
        glue = "com.co.qvision.stepsdefinitions")
public class CartRunner {
}
