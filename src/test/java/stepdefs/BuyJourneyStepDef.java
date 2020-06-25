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

    @When("^the user adds an item to cart through quick view$")
    public void addItemThroughQuickView(){
        homepage.addItemToCart();
    }
    @Then("^the item is added to cart from summer dresses$")
    public void verifyItemIsInCart(){
        homepage.addedToCart();
    }

    @When("^the user types product name into search our catalogue bar$")
    public void searchProduct(){
        homepage.searchForDress();
    }

    @And("^completes adding item to cart$")
    public void completeAddingItem(){
        homepage.addItemToCart();
    }

    @Then("^item is added to cart from search$")
    public void itemAddedFromSearch(){
        homepage.addedToCart();
    }

    @When("^the user enters a high value in the quantity field$")
    public void enterHighQuantity(){
        productPage.changeQuantity("500");
        productPage.selectQuantity();
    }

    @Then("^insufficient stock message is displayed$")
    public void verifyInsufficientStock(){
        productPage.verifyInsufficientStock();
    }

    @When("^the user selects a product with different options$")
    public void selectFadedShortSleeveShirt(){
        homepage.searchForShirt();
    }

    @Then("^the message 'Product available with different options' is displayed$")
    public void verifyDifferentOptionsMessage(){
        productPage.verifyProductAvailableWithOtherOptions();
    }



}
