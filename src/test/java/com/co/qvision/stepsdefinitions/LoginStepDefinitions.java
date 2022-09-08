package com.co.qvision.stepsdefinitions;

import com.co.qvision.models.Credentials;
import com.co.qvision.questions.CompareDocument;
import com.co.qvision.questions.CompareHello;
import com.co.qvision.questions.ComparePassword;
import com.co.qvision.tasks.Login;
import com.co.qvision.utils.Constant;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.Map;


public class LoginStepDefinitions {

    //use my browser (instantiated by the driver)
    @Managed
    WebDriver myBrowser;

    //before each scenario open the browser with actor Melanny
    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Melanny");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(myBrowser));
    }

    //Melanny can enter the bonbonite website
    @Given("^im on the BonBonite page$")
    public void imOnTheBonBonitePage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.bon-bonite.com/"));

    }

    //call the feature credentials and enter them with the enter method in the login task
    @When("^i enter my credentials correctly$")
    public void iEnterMyCredentialsCorrectly(List<Credentials> credentialsList) {
        Credentials credentials;
        credentials = credentialsList.get(0);
        OnStage.theActorInTheSpotlight().attemptsTo(Login.enterCredentials(credentials));
    }

    //call the feature document and verify that the data brought from the question are true
    @Then("^i should see my document in the screen$")
    public void iShouldSeeMyDocumentInTheScreen(Map<String,String>mapCredentials) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(CompareHello.compare(mapCredentials),
                Matchers.equalTo(Boolean.TRUE)));

    }
    @When("^i enter invalid password$")
    public void iEnterInvalidPassword(List<Credentials>credentialsList) {
        Credentials credentials;
        credentials = credentialsList.get(0);
        OnStage.theActorInTheSpotlight().attemptsTo(Login.enterCredentials(credentials));
    }

    @Then("^i will not be able to login$")
    public void iWillNotBeAbleToLogin() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ComparePassword.compare()
                , Matchers.equalTo(Constant.invalidPassword)));
    }

    @When("^i enter nonexistent user$")
    public void iEnterNonexistentUser(List<Credentials>credentialsList) {
        Credentials credentials;
        credentials = credentialsList.get(0);
        OnStage.theActorInTheSpotlight().attemptsTo(Login.enterCredentials(credentials));

    }

    @Then("^print the error that the user does not exist$")
    public void printTheErrorThatTheUserDoesNotExist() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(CompareDocument.compare()
                , Matchers.equalTo(Constant.invalidDocument)));
    }

}
