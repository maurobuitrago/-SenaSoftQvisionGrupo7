package com.co.qvision.stepsdefinitions;

import com.co.qvision.tasks.Cart;
import com.co.qvision.tasks.Login;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

public class CartStepDefinitions {

    @When("^i add a product to the cart$")
    public void iAddAProductToTheCart() {
        OnStage.theActorInTheSpotlight().attemptsTo(Cart.add());
    }

    @When("^increased its units$")
    public void increasedItsUnits() {

    }

    @Then("^should be able to see your final price$")
    public void shouldBeAbleToSeeYourFinalPrice() {

    }

}
