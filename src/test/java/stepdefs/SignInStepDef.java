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
    private CreateNewAccountPage createNewAccountPage = new CreateNewAccountPage();
    private PersonalDetails pd = new PersonalDetails("Robin", "Hood", "test@sherwood.com", "ghsjdc@test.com", "LadyM", "Sherwood Forest", "Nottingham", "Minnesota", "12345", "6320864892", "Forest");


    @When("the user fills in sign in details with a {string}")
    public void User(String User) {
        switch (User) {
            case ("registered email"):

                signIn.enterSignInEmailAddress("test@sherwood.com");
                signIn.enterPassword();
                signIn.clickLogIn();
                break;
            case ("unregistered email"):
                signIn.enterSignInEmailAddress("ghsjdc@test.com");
                signIn.enterPassword();
                signIn.clickLogIn();
                break;
            case ("wrong password"):
                signIn.enterSignInEmailAddress("test@sherwood.com");
                signIn.enterInputPassword("Obviously Wrong");
                signIn.clickLogIn();
                break;
        }
    }

    @Then("the user has a {string}")
    public void theUserIsSigned(String Status) {
        switch (Status) {
            case ("signed in account"):
                signIn.successfulSignIn();
                signIn.clickSignOut();
                break;
            case ("signed out account"):
                signIn.clickSignOut();
                signIn.userSignedOut();
                break;
            case ("invalid account"):
                signIn.unregisteredUserAlert();
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
                break;

        }
    }

    @And("The user fills in {string} on next page")
    public void fillsInOnNextPage(String fill) {
        switch (fill) {
            case ("password email form"):
                signIn.enterForgottenPasswordEmailAddress("test@sherwood.com");
                signIn.clickRetrievePassword();
                break;
            case ("change preferences form"):
                signIn.checkOffers();
                signIn.checkNewsletter();
                signIn.saveChanges();
                break;
            case ("invalid email form"):
                signIn.enterForgottenPasswordEmailAddress("ghsjdc@test.com");
                signIn.clickRetrievePassword();
                break;
            case ("new address form"):
                signIn.AddAddressLoggedIn();
                signIn.AddingNewAddressQuick();
                signIn.AddingNewAddressLonger();
                signIn.SaveAddressLoggedIn();
                break;
            case ("a message"):
                signIn.inputMessage();
                signIn.MessageSend();
                break;
        }

    }

    @Then("{string} is displayed")
    public void isDisplayed(String WebMessage) {
        switch (WebMessage) {
            case ("alert message"):
                signIn.confirmationMessage();
                homePage.goTo();
                break;
            case ("alert success message"):
                signIn.confirmedChanges();
                signIn.clickSignOut();
                break;
            case ("wrong password alert"):
                signIn.confirmInvalidPassword();
                break;
            case ("new address"):
                signIn.CheckingAddressLoggedIn();
                signIn.clickSignOut();
                break;
            case ("updated order"):
                signIn.checkMessageSent();
                signIn.clickSignOut();
                break;
            case ("unregistered email alert"):
                signIn.invalidUserPasswordCheck();
                break;
        }
    }
}


