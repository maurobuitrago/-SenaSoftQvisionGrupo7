package com.co.qvision.stepsdefinitions;

import com.co.qvision.questions.CompareHello;
import com.co.qvision.questions.CompareReserve;
import com.co.qvision.questions.CompareTotal;
import com.co.qvision.questions.QuestionSubtotal;
import com.co.qvision.tasks.CartAdd;
import com.co.qvision.tasks.CartIncrement;
import com.co.qvision.tasks.CartReserve;
import com.co.qvision.tasks.ReserveForm;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

import java.util.Map;

import static com.co.qvision.questions.QuestionPrice.compare;
import static java.lang.Integer.parseInt;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CartStepDefinitions {

    @When("^i add a product to the cart$")
    public void iAddAProductToTheCart() {

        //add a product in the card
        OnStage.theActorInTheSpotlight().attemptsTo(CartAdd.add());
    }

    @When("^increased its units$")
    public void increasedItsUnits() {

        //increase order units of a product
        OnStage.theActorInTheSpotlight().attemptsTo(CartIncrement.increment());
    }

    @Then("^should be able to see its final price$")
    public void shouldBeAbleToSeeItsFinalPrice() {
        //the test is passed if the final price after increasing units is different from the unit price of the product
        //if the subtotal has the same value as the unit price even after increasing the units
        // then true will be returned and the test will not be passed
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(CompareTotal.compare(),
                Matchers.equalTo(Boolean.FALSE)));
    }

    @When("^i add a product out of stock to the cart$")
    public void iAddAProductOutOfStockToTheCart() {

        //select an out of stock product
        OnStage.theActorInTheSpotlight().attemptsTo(CartReserve.reserve());
    }
    @When("^complete the reserve form$")
    public void completeTheReserveForm(Map<String,String> mapReserve) {

        //complete the reserve form
        theActorInTheSpotlight().attemptsTo(ReserveForm.reserve(mapReserve));
    }


    @Then("^should be able to book it$")
    public void shouldBeAbleToBookIt() {

        //verify that the reservation sending message was received correctly
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(CompareReserve.compare()
                , Matchers.equalTo("Gracias por tu mensaje. Ha sido enviado.")));
    }

}
