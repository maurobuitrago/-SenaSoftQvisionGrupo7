package com.co.qvision.stepsdefinitions;

import com.co.qvision.models.RangePrices;
import com.co.qvision.tasks.Home;
import com.co.qvision.tasks.Shoes;
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

import java.util.List;

public class StepsDefinitionFilterPrices {
    @Managed
    WebDriver chrome;

    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("User2");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(chrome));
    }
    @Given("^That i enter to the web page on the module shoes$")
    public void thatIEnterToTheWebPageOnTheModuleShoes() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.bon-bonite.com/"));
    }

    @When("^select a filter by price$")
    public void selectAFilterByPrice(List<RangePrices> rangePricesList) {
        RangePrices rangePrices;
        rangePrices = rangePricesList.get(0);
        OnStage.theActorInTheSpotlight().attemptsTo(Home.clickShoesProducts());
        OnStage.theActorInTheSpotlight().attemptsTo(Shoes.selectRange(rangePrices));
    }

    @Then("^should see the result filter by prices$")
    public void shouldSeeTheResultFilterByPrices() {

    }

}
