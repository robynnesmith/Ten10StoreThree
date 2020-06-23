package stepdefs;

import Tests.SignIn;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.ro.Si;
import pageObjects.*;

public class SignInStepDef {
    private HomePage homePage = new HomePage();
    private ShoppingCartPage basketpage = new ShoppingCartPage();
    private SignInPage signIn = new SignInPage();
    private SignIn signInTests = new SignIn();
    private CreateNewAccountPage createNewAccountPage = new CreateNewAccountPage();
    private PersonalDetails pd = new PersonalDetails("Robin", "Hood", "test@sherwood.com", "ghsjdc@test.com", "LadyM", "Sherwood Forest", "Nottingham", "Minnesota", "12345", "6320864892", "Forest");


    @Given("the user is on the {string} page")
    public void theUserIsOnPage(String SignIn) {
        homePage.goTo();
        switch (SignIn) {
            case "sign in":
                homePage.navigateToSignInPage();
        }
    }


    @When("the user fills in sign in details with {string} email")
    public void User(String User) {
        switch (User) {
            case ("registered"):
                signIn.enterSignInEmailAddress("test@sherwood.com");
                signIn.enterPassword();
                signIn.clickLogIn();
                break;
            case ("unregistered"):
                signIn.enterSignInEmailAddress("ghsjdc@test.com");
                signIn.enterPassword();
                signIn.clickLogIn();
                break;

        }
    }

    @Then("the user has a {string}")
    public void theUserIsSigned(String Status) {
        switch (Status) {
            case ("signed-in-account"):
                signIn.successfulSignIn();
                signIn.clickSignOut();
                homePage.goTo();
                break;
            case ("signed-out-account"):
                signIn.clickSignOut();
                signIn.userSignedOut();
                homePage.goTo();
                break;
            case ("invalid-account"):
                signIn.unregisteredUserAlert();
                homePage.goTo();
                break;
        }
    }

    @When("the user clicks {string}")
    public void theUserClicks(String click) {
        switch (click) {
            case ("forgotten password"):
                signIn.forgottenPassword();
                break;
            case ("sign out"):
                signIn.enterSignInEmailAddress("test@sherwood.com");
                signIn.enterPassword();
                signIn.clickLogIn();

        }
    }

    @And("fills in {string} on next page")
    public void fillsInOnNextPage(String fill) {
        switch (fill) {
            case ("password-email-form"):
                signIn.enterForgottenPasswordEmailAddress("test@sherwood.com");
                signIn.clickRetrievePassword();
                break;
        }

    }

    @Then("{string} is displayed")
    public void isDisplayed(String WebMessage) {
        switch (WebMessage){
            case("alert message"):
                signIn.confirmationMessage();
                homePage.goTo();
                break;
        }
    }
}


