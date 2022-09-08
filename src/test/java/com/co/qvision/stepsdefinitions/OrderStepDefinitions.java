package com.co.qvision.stepsdefinitions;

import com.co.qvision.questions.CompareCancel;
import com.co.qvision.questions.CompareMethod;
import com.co.qvision.tasks.CancelOrder;
import com.co.qvision.tasks.CartIncrement;
import com.co.qvision.utils.Constant;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

public class OrderStepDefinitions {

    @When("^I want to see my orders and cancel the order$")
    public void iWantToSeeMyOrdersAndCancelTheOrder() {
        OnStage.theActorInTheSpotlight().attemptsTo(CancelOrder.cancel());

    }

    @Then("^i should see a confirmation alert$")
    public void iShouldSeeAConfirmationAlert() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(CompareCancel.compare(),
                Matchers.equalTo(Constant.alertOrderCanceled)));

    }
}
