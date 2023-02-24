package site.gridedge.cucumber.stepdef;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import site.gridedge.pages.EnergyTrackerPage;
import site.gridedge.pages.PortfolioPage;
import site.gridedge.pages.SignInPage;

public class EnergyTrackerTest {
    @Given("^User is on porfolio page$")
    public void userIsOnPorfolioPage() {
    }

    @When("^User click on Energy Tracker button$")
    public void userClickOnEnergyTrackerButton() {
        new PortfolioPage().clickOnEnergyTrackerButton();
    }

    @Then("^User should navigate to Energy tracker page successfully$")
    public void userShouldNavigateToEnergyTrackerPageSuccessfully() {
        Assert.assertEquals(new EnergyTrackerPage().customDateRangeMessage(), "Custom Date Range");
    }


}
