package stepdefs;

import io.cucumber.java.en.Given;
import pageObjects.*;

public class CommonStepDef {

    private HomePage homepage = new HomePage();
    private ShoppingCartPage basketPage = new ShoppingCartPage();
    private SignInPage signIn = new SignInPage();
    private CreateNewAccountPage createNewAccountPage = new CreateNewAccountPage();
    private ProductPage productPage = new ProductPage();

    @Given("^the user is on the \"([^\"]*)\" page$")
    public void theUserIsOnThePage(String page){
        homepage.goTo();
        switch (page){
            case "home":
                homepage.goTo();
                break;
            case "product":
                productPage.navigatetoProductPage();
                break;
            case "sign in":
                homepage.navigateToSignInPage();
                break;
            case "shopping cart":
                basketPage.navigateToBasket();
                break;
            case "contact us":
                homepage.clickContactUs();
                break;
            case "homepage":
                homepage.clickWomens();
                break;
            case "summer dresses":
                homepage.hoverAndClickSummerDresses();
                break;
            case ("Information"):
                signIn.clickInformation();
                break;
            case ("Address"):
                signIn.ClickAddressLogin();
                break;
            case ("Homepage"):
                break;
            case ("pre existing order"):
                signIn.ClickOrderHistory();
                signIn.ClickOrderDetails();
                signIn.clickProductType();
                break;
            default:
                throw new IllegalArgumentException("Unrecognised page provided");
        }
    }

    @Given("the user is on the homepage")
    public void theUserIsOnTheHomepage() {
        homepage.goTo();
    }
}
