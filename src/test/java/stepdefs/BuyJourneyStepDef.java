package stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Ignore;
import org.junit.Test;
import pageObjects.*;

public class BuyJourneyStepDef {

    private HomePage homepage = new HomePage();
    private ShoppingCartPage basketpage = new ShoppingCartPage();
    private SignInPage signInPage = new SignInPage();
    private ProductPage productPage = new ProductPage();
    private OrderHistory orderHistory = new OrderHistory();
    private AllProductsPage allProductsPage = new AllProductsPage();

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
            case "contact us":
                homepage.clickContactUs();
                break;
            default:
                throw new IllegalArgumentException("Unrecognised page provided");
        }
    }

    @When("^the user clicks on more button$")
    public void clickMoreButton(){
        homepage.clickMoreButton();
    }

    @Then("^the item page is displayed$")
    public void verifyItemDisplayed(){
        productPage.productPageDisplayed();
    }

    @When("^the user adds an item to the basket$")
    public void addItemToBasket(){
        homepage.hoverOverItem();
        homepage.addItemToCart();
    }

    @Then("^the item is in the basket$")
    public void veryItemAdded(){
        homepage.addedToCart();
    }

    @When("^the user adds item to basket from product page$")
    public void addProductToBasket(){
        productPage.selectQuantity();
        productPage.selectSize();
        homepage.clickAddToCart();
    }

    @Then("^the item is in the basket from product page$")
    public void verifyItemInBasket(){
        homepage.addedToCart();
    }

    @And("^the user is logged in$")
    public void userLoggedIn(){
        signInPage.enterSignInEmailAddress("name@name.com");
        signInPage.enterInputPassword("password");
        signInPage.clickLogIn();
    }

    @When("^the user fills out message form on previous order$")
    public void addMessageToOrder(){
        signInPage.clickOrderHistory();
        orderHistory.clickDetails();
        orderHistory.selectProduct();
        orderHistory.InputComment("Item fits true to size");
        orderHistory.submitMessage();
    }

    @Then("^the message has been added$")
    public void verifyMessageAdded(){
        orderHistory.messageSentVerification();
    }

    @When("^the user completes the newsletter form with valid email address$")
    public void completeNewsletterSubscription(){
        homepage.inputEmailToNews("name@name.com");
        homepage.clickSubscribe();
    }

    @Then("^a successfully subscribed message is displayed$")
    public void verifySubscribed(){
        homepage.validateSubscribed();
    }

    @When("^the user completes the contact us form$")
        public void completeContactUsForm(){
        //homepage.enterEmailAddressFrom("name@name.com");
        homepage.enterMessageFrom("This is a message");
        homepage.clickSendMessage();
    }

    @Then("^the confirmation message is displayed$")
    public void verifyConfirmationMessage(){
        homepage.validateMessageSent();
    }



}
