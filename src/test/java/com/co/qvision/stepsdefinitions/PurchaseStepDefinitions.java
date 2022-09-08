package com.co.qvision.stepsdefinitions;

import com.co.qvision.models.Credentials;
import com.co.qvision.questions.CompareHello;
import com.co.qvision.questions.CompareMethod;
import com.co.qvision.tasks.CartAdd;
import com.co.qvision.tasks.CartAddMore;
import com.co.qvision.tasks.FinalizatePurchase;
import com.co.qvision.utils.Constant;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

import java.util.List;

public class PurchaseStepDefinitions {

    @When("^i add some products to the cart$")
    public void iAddSomeProductsToTheCart() {
        OnStage.theActorInTheSpotlight().attemptsTo(CartAdd.add());
        OnStage.theActorInTheSpotlight().attemptsTo(CartAddMore.add());
    }


    @When("^finalize the purchase$")
    public void finalizeThePurchase(List<Credentials>credentialsList) {
        Credentials credentials;
        credentials = credentialsList.get(0);
        OnStage.theActorInTheSpotlight().attemptsTo(FinalizatePurchase.finalizate(credentials));

    }

    @Then("^i should see the payment gateway$")
    public void iShouldSeeThePaymentGateway() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(CompareMethod.compare(),
                Matchers.equalTo(Constant.methodPayments)));
    }
}
