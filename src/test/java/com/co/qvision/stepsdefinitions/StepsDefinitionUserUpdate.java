package com.co.qvision.stepsdefinitions;

import com.co.qvision.exceptions.Exception;
import com.co.qvision.models.Credentials;
import com.co.qvision.models.UpdateCredentials;
import com.co.qvision.questions.CompareUpdate;
import com.co.qvision.tasks.Login;
import com.co.qvision.tasks.MyAccountUpdateCredentials;
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

public class StepsDefinitionUserUpdate {
    // Here instance the web driver that we use
    @Managed
    WebDriver chrome;

    @Before
    public void setUp() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("User");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(chrome));
    }

    @Given("^That i sign in my account on the option account detail$")
    public void thatISignInMyAccountOnTheOptionAccountDetail() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.bon-bonite.com/"));
    }

    @When("^enter my correct credentials$")
    public void enterMyCorrectCredentials(List<Credentials> loginCredentialsList) {

        // Save the loginCredentials on the model loginCredentials object
        Credentials loginCredentials;
        loginCredentials = loginCredentialsList.get(0);

        // Call the method to enter credentials
        OnStage.theActorInTheSpotlight().attemptsTo(Login.enterCredentials(loginCredentials));

    }

    @When("^change my personal data$")
    public void changeMyPersonalData(List<UpdateCredentials> updateCredentialsList) {

        // Save the update credentials on the model updateCredentials
        UpdateCredentials updateCredentials;
        updateCredentials = updateCredentialsList.get(0);

        // Call method that update the credentials
        OnStage.theActorInTheSpotlight().attemptsTo(MyAccountUpdateCredentials.updateCredentials(updateCredentials));
    }

    @Then("^should see my data update$")
    public void shouldSeeMyDataUpdate(Map<String, String> map) {

        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(CompareUpdate.compareUpdate(map), Matchers.equalTo(Boolean.TRUE)
        ).orComplainWith(Exception.class, Constant.messageUserUpdate));

    }

}
