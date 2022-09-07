package com.co.qvision.stepsdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class LoginStepDefinitions {


    @Managed
    WebDriver myBrowser;

    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Melanny");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(myBrowser));
    }
    @Given("^im on the BonBonite page$")
    public void imOnTheBonBonitePage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.bon-bonite.com/"));

    }

    @When("^i enter my credentials correctly$")
    public void iEnterMyCredentialsCorrectly() {

    }

    @Then("^i should see my document in the screen$")
    public void iShouldSeeMyDocumentInTheScreen() {

    }

}
