package com.co.qvision.stepsdefinitions;

import com.co.qvision.questions.ComparePrice;
import com.co.qvision.questions.CompareReserve;
import com.co.qvision.questions.CompareSubtotal;
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

import static com.co.qvision.questions.ComparePrice.compare;
import static java.lang.Integer.parseInt;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CartStepDefinitions {

    @When("^i add a product to the cart$")
    public void iAddAProductToTheCart() {

        OnStage.theActorInTheSpotlight().attemptsTo(CartAdd.add());
    }

    @When("^increased its units$")
    public void increasedItsUnits() {
        OnStage.theActorInTheSpotlight().attemptsTo(CartIncrement.increment());
    }

    @Then("^should be able to see its final price$")
    public void shouldBeAbleToSeeItsFinalPrice() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(compare()
        , Matchers.equalTo(CompareSubtotal.compare())));
    }

    @When("^i add a product out of stock to the cart$")
    public void iAddAProductOutOfStockToTheCart() {
        OnStage.theActorInTheSpotlight().attemptsTo(CartReserve.reserve());
    }
    @When("^complete the reserve form$")
    public void completeTheReserveForm(Map<String,String> mapReserve) {
        theActorInTheSpotlight().attemptsTo(ReserveForm.reserve(mapReserve));
    }


    @Then("^should be able to book it$")
    public void shouldBeAbleToBookIt() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(CompareReserve.compare()
                , Matchers.equalTo("Gracias por tu mensaje. Ha sido enviado.")));
    }

}
