package site.gridedge.cucumber.stepdef;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import site.gridedge.pages.SignInPage;

public class SignInTest {
    @Given("^User is on Grid Edge home page$")
    public void userIsOnGridEdgeHomePage() {

    }

    @When("^User enter email id \"([^\"]*)\"$")
    public void userEnterEmailId(String email)  {
    new SignInPage().enterEmailId(email);
    }

    @And("^User enters password \"([^\"]*)\"$")
    public void userEntersPassword(String password) {
        new SignInPage().enterPassword(password);

    }

    @And("^User click on checkbox$")
    public void userClickOnCheckbox() {
        new SignInPage().clickOnCheckBoxButton();
    }

    @And("^User click on Sign in button$")
    public void userClickOnSignInButton() {
        new SignInPage().clickOnSignInButton();
    }

    @Then("^User should see porfolio page successfully$")
    public void userShouldSeePorfolioPageSuccessfully() {
        Assert.assertEquals(new SignInPage().getPorfolioTitleOnThePage(), "Portfolio");
    }





}
