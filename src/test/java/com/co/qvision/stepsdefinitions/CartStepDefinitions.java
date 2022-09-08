package com.co.qvision.stepsdefinitions;

import com.co.qvision.questions.ComparePrice;
import com.co.qvision.tasks.Cart;
import com.co.qvision.tasks.CartReserve;
import com.co.qvision.tasks.Login;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

import java.util.Map;

public class CartStepDefinitions {

    @When("^i add a product to the cart$")
    public void iAddAProductToTheCart() {

        OnStage.theActorInTheSpotlight().attemptsTo(Cart.add());
    }

    @When("^increased its units$")
    public void increasedItsUnits() {

    }

    @Then("^should be able to see its final price$")
    public void shouldBeAbleToSeeItsFinalPrice() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ComparePrice.compare()
        , Matchers.equalTo("15")));
    }

    @When("^i add a product out of stock to the cart$")
    public void iAddAProductOutOfStockToTheCart() {
        OnStage.theActorInTheSpotlight().attemptsTo(CartReserve.reserve());
    }
    @When("^complete the reserve form$")
    public void completeTheReserveForm(Map<String,String> mapReserve) {

    }


    @Then("^should be able to book it$")
    public void shouldBeAbleToBookIt() {

    }

}
