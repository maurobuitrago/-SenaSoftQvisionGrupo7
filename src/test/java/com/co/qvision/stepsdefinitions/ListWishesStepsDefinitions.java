package com.co.qvision.stepsdefinitions;

import com.co.qvision.exceptions.Exception;
import com.co.qvision.models.Credentials;
import com.co.qvision.questions.CompareWishList;
import com.co.qvision.tasks.BagWishesList;
import com.co.qvision.tasks.Login;
import com.co.qvision.tasks.SeeWishList;
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

public class ListWishesStepsDefinitions {
    @Managed
    WebDriver chrome;

    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("User");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(chrome));
    }
    @Given("^That i enter to the web page bon-bonite on the module my account$")
    public void thatIEnterToTheWebPageBonBoniteOnTheModuleMyAccount() {

        // Open the url
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.bon-bonite.com/"));

    }

    @When("^Enter correct crendentials$")
    public void enterCorrectCrendentials(List<Credentials> credentialsList) {
        Credentials credentials;
        credentials = credentialsList.get(0);

        // Enter the user credentials
        OnStage.theActorInTheSpotlight().attemptsTo(Login.enterCredentials(credentials));
    }

    @When("^Add a product to the list wishes$")
    public void addAProductToTheListWishes() {
        // Call the method to add new wish list
        OnStage.theActorInTheSpotlight().attemptsTo(BagWishesList.addBagWishesList());
        // Call the method to navigate to list wishes
        OnStage.theActorInTheSpotlight().attemptsTo(SeeWishList.seeWishList());
    }

    @Then("^Should see in this list$")
    public void shouldSeeInThisList() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(CompareWishList.compareWishList(), Matchers.equalTo("Bolso bombonera en cuero grabado color frambuesa")).orComplainWith(Exception.class, Constant.messageWishListError));
    }
}
