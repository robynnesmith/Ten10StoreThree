package stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.*;

public class ShoppingCartStepDef {

    private HomePage homepage = new HomePage();
    private ShoppingCartPage basketPage = new ShoppingCartPage();
    private SignInPage signInPage = new SignInPage();
    private CreateNewAccountPage createNewAccountPage = new CreateNewAccountPage();

    @When("^the user clicks the \"([^\"]*)\" button$")
    public void theUserClicks(String click) {
        switch (click) {
            case "delete":
                basketPage.deleteItemFromBasket();
                break;
            case "proceed to checkout":
                basketPage.clickModalProceedToCheckout();
                break;
            case "add to cart":
                basketPage.addToCart();
                break;
            default:
                throw new IllegalArgumentException("Unrecognised page provided");
        }
    }

    @When("^user \"([^\"]*)\" quantity of product$")
    public void quantityOfProduct(String quantity) {
        if (quantity.equals("increases")) {
            basketPage.checkThereAreTwoItems();
        } else if (quantity.equals("decreases")) {
            basketPage.checkItemIsInBasket();
        }
    }

    @When("^the user hovers over a product and the clicks the add to cart button")
    public void userHoversOverProduct() {
        homepage.hoverOverItem();
        homepage.addItemToCart();
    }

    @Then("^verify the \"([^\"]*)\"$")
    public void thenVerifyThe(String verify) {
        switch (verify) {
            case "item is removed from the basket":
                basketPage.checkItemRemovedFromBasket();
                break;
            case "basket is updated with the correct quantity":
                basketPage.verifyQuantityUpdated();
                break;
            case "sign in page is displayed ":
                signInPage.successfulSignIn();
                break;
            case "item has been added to the cart":
                basketPage.checkItemIsInBasket();
                break;

        }
    }

    @And("^verify the Product counter is updated")
    public void verifyTheProductCounterIsUpdated() {
        basketPage.verifyProductCountUpdated();
    }

    @And("user has 2 items in basket")
    public void userHasTwoItemsInTheBasket() {
        basketPage.checkThereAreTwoItems();
    }

    @And("pricing and totals should be updated")
    public void pricingAndTotalsUpdated() {
        basketPage.checkThatBasketLogoHasTwo();
    }

    @And("the user is on the shopping cart page")
    public void userIsOnThePage() {
        basketPage.addToCart();
    }

    @Given("the user already has an item in their basket")
    public void theUserAlreadyHasAnItemInTheirBasket() {
        signInPage.SignButtonFix();
        signInPage.clickSignIn();
        signInPage.login();
        homepage.goTo();
        homepage.itemAddedToCart();

    }
}
