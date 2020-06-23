package stepdefs;

import Tests.SignIn;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Ignore;
import pageObjects.CreateNewAccountPage;
import pageObjects.HomePage;
import pageObjects.ShoppingCartPage;

public class RegistrationStepDef {
    private HomePage homePage = new HomePage();
    private ShoppingCartPage basketpage = new ShoppingCartPage();
    private SignIn signIn = new SignIn();
    private CreateNewAccountPage createNewAccountPage = new CreateNewAccountPage();

    @Given ("^the user is on the \"\"page$")
    public void theUserIdOntThePage(String page) {
        homePage.goTo();
            switch (page){
                case "sign in":
                    homePage.navigateToSignInPage();
                    break;
                case "product":
                    homePage.clickMoreButton();
                    break;
                default:
                    throw new IllegalArgumentException("This page does not exist");
            }


    }
}
