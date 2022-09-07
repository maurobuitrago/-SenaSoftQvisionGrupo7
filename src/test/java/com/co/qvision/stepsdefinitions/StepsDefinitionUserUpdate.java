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

public class StepsDefinitionUserUpdate {
    // Here instance the web driver that we use
    @Managed
    WebDriver chrome;
    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("User");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(chrome));
    }

    @Given("^That i sign in my account on the option account detail$")
    public void thatISignInMyAccountOnTheOptionAccountDetail() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.bon-bonite.com/"));
    }

    @When("^enter my correct credentials$")
    public void enterMyCorrectCredentials() {

    }

    @When("^change my personal data$")
    public void changeMyPersonalData() {

    }

    @Then("^sould see my data update$")
    public void souldSeeMyDataUpdate() {

    }

}
