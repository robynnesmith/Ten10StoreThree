package stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.*;

public class RegistrationStepDef {

    private HomePage homepage = new HomePage();
    private ShoppingCartPage basketPage = new ShoppingCartPage();
    private SignInPage signInPage = new SignInPage();
    private CreateNewAccountPage createNewAccountPage = new CreateNewAccountPage();


    @When("^the user completes the registration form with a \"([^\"]*)\" email address$")
    public void theUserCompletesRegistrationWithAnEmailAddress(String emailType) {
        signInPage.clickCreateAnAccount();
        createNewAccountPage.registerUserWithEmail(emailType);
        createNewAccountPage.clickSave();

    }

    @Then("the already registered alert is displayed")
    public void theAlreadyRegisteredAlertIsDisplayed() {
        signInPage.unregisteredUserAlert();
    }

    @Then("the account page is displayed")
    public void theIsDisplayed() {
        signInPage.successfulSignIn();
    }

    @When("the user completes the registration form with a numeric name")
    public void theUserCompletedTheRegistrationFormWithAName() {
        signInPage.clickSignIn();
        signInPage.clickCreateAnAccount();
        createNewAccountPage.enterNumericNameDetails();
        createNewAccountPage.clickSave();
    }

    @Then("the invalid name alert is displayed")
    public void theInvalidNameAlertIsDisplayed() {
        createNewAccountPage.checkInvalidName();
    }

    @When("the user completes the registration form with a numeric password")
    public void theUserCompletesTheRegistrationFormWithANumericPassword() {
        homepage.navigateToSignInPage();
        signInPage.clickCreateAnAccount();
        createNewAccountPage.enterNumericPassword();
        createNewAccountPage.clickSave();
    }

    @Then("the invalid password alert is displayed")
    public void theInvalidPasswordAlertIsDisplayed() {
        createNewAccountPage.checkInvalidName();
    }

    @When("the user completes the registration form with an String birthdate")
    public void theUserCompletesTheRegistrationFormWithAnStringBirthdate() {
        homepage.navigateToSignInPage();
        signInPage.clickCreateAnAccount();
        createNewAccountPage.enterPersonalDetails();
        createNewAccountPage.typeIncorrectBirthdateValue();
        createNewAccountPage.clickSave();
    }

    @Then("the invalid birthdate alert is displayed")
    public void theInvalidBirthdateAlertIsDisplayed() {
        createNewAccountPage.InvalidBirthdateErrorMessageShown();
    }
}
