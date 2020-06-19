package Tests;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pageObjects.*;

import javax.security.auth.callback.CallbackHandler;

import static Tests.TestSuite.driverFactory;

/**
 * Created by jack.forman on 08/11/2016.
 */
public class ShoppingCart {

    public static WebDriver driver = driverFactory.getDriver();
    private HomePage homePage = new HomePage(driver);
    private ShoppingCartPage basketpage = new ShoppingCartPage(driver);
    private SignInPage signInPage = new SignInPage(driver);
    private ProductPage productPage = new ProductPage(driver);
    private CheckoutPage checkoutPage = new CheckoutPage(driver);


    @Before
    public void individualSetUp() {
        driver.manage().deleteAllCookies();
        homePage.goTo();

    }

    /**
     * Remove item from shopping cart
     * Pre-Condition - Item must be in basket
     * Navigate to basket
     * Click Delete
     * Verify Item is removed from Basket
     * Extension - verify pricing and totals are updated to reflect accurately
     */
    @Test
    public void removeItemFromShoppingBasket() {
        homePage.navigateToSignInPage();
        signInPage.login();
        homePage.goTo();
        homePage.itemAddedToCart();
        basketpage.navigateToBasket();
        basketpage.deleteItemFromBasket();
        basketpage.checkItemRemovedFromBasket();

    }

    /**
     * Increase quantity of product
     * Pre-Condition - Must have one item in basket
     * Navigate to basket
     * Increase quantity of product
     * Verify basket updated with correct quantity
     * Verify Product counter (Top right) is updated
     * Extension - verify pricing and totals are updated to reflect accurately
     */
    @Test
    public void increaseQuantityOfProductInBasket() {
        homePage.navigateToSignInPage();
        signInPage.login();
        homePage.goTo();
        homePage.itemAddedToCart();
        basketpage.navigateToBasket();
        basketpage.increaseQuantity();
        basketpage.verifyQuantityUpdated();
        basketpage.verifyProductCountUpdated();

    }

    /**
     * Proceed to checkout - not signed in
     * Pre-Condition - Must have one item in basket && not be signed in
     * Navigate to basket
     * Click proceed to checkout
     * Verify sign in page displayed
     */
    @Test
    public void proceedToCheckoutNotLoggedIn() {
        homePage.itemAddedToCart();
        basketpage.navigateToBasket();
        basketpage.clickProceedToCheckout();
        basketpage.isPersonalInformationPageDisplayed();
    }

    /**
     * Proceed to checkout - signed in
     * Pre-Condition - Must have one item in basket && be signed in
     * Navigate to basket
     * Click proceed to checkout
     * Delivery Address Page is shown
     * Click proceed to checkout
     * Shipping page is shown
     * Agree to terms of service
     * Click proceed to checkout
     * Payment page is displayed
     * Click pay by bank wire
     * Confirm order
     * Order confirmation page is displayed
     */
    @Test
    public void proceedToCheckoutAndBuyLoggedIn() {
        homePage.navigateToSignInPage();
        signInPage.login();
        homePage.goTo();
        homePage.addItemToCart();
        basketpage.clickModalProceedToCheckout();
        basketpage.clickProceedToCheckout();
        checkoutPage.deliveryAddressSectionDisplayed();
        checkoutPage.clickProceedToNextSection();
        checkoutPage.shippingPageDisplayed();
        checkoutPage.enterShippingComment();
        checkoutPage.clickProceedToNextSection();
        checkoutPage.paymentPageDisplayed();
        checkoutPage.clickPayByBankWire();
        checkoutPage.agreeToTerms();
        checkoutPage.confirmOrder();
        checkoutPage.orderConfirmationDisplayed();
    }

    //New test cases

//Make invoice address different to delivery address
    /**

     .Navigate to basket
     .Click proceed to checkout
     .Delivery Address Page is shown
     .Make invoice address different
     .Click continue button
     .Verify shipping method displayed
     */
    @Test @Ignore
    public void invoiceAddressDifferentToDeliveryAddress() {
        homePage.navigateToSignInPage();
        signInPage.login();
        homePage.goTo();
        homePage.addItemToCart();
        basketpage.navigateToBasket();
        basketpage.clickProceedToCheckout();
        checkoutPage.deliveryAddressSectionDisplayed();
        checkoutPage.clickDifferentBillingAddress();
        checkoutPage.selectSecondAddress();
        checkoutPage.clickProceedToNextSection();
        checkoutPage.shippingPageDisplayed();
        checkoutPage.clickAddressSection();
        checkoutPage.isSecondAddressSelected();
        checkoutPage.selectFirstAddress();
        checkoutPage.checkOutAddress();
    }

    //Multiple items in shopping cart displayed correctly
    /**
     *Navigate to basket
     *Verify that all items are displayed
     *Verify that product counter and prices are correct
     */
    @Test @Ignore
    public void verifyMultipleItemsInCart() {

    }

    //Add a comment to your order
    /**
     * Navigate to basket
     * Proceed to checkout
     * Select Address
     * Write a comment in 'Shipping Method' section
     * Verify comment has been added
     */
    @Test
    public void addCommentToOrder() { /**No way to verify added comment after ordering*/

        homePage.navigateToSignInPage();
        signInPage.login();
        homePage.goTo();
        homePage.addItemToCart();
        basketpage.navigateToBasket();
        basketpage.clickProceedToCheckout();
        checkoutPage.deliveryAddressSectionDisplayed();
        checkoutPage.clickProceedToNextSection();
        checkoutPage.shippingPageDisplayed();
        checkoutPage.enterShippingComment();
        checkoutPage.clickProceedToNextSection();
        checkoutPage.clickShippingSection();
        checkoutPage.verifyCommentAdded();



    }

//Proceed to checkout and logout
    /**
     *Navigate to basket
     *Click proceed to checkout
     *Logout
     *Verify cart emptied when sign back in.
     */
    @Test
    public void checkOutandlogout() {

    }

//Add new address
    /**
     *Navigate to basket
     *Proceed to checkout
     *Click "+ new address"
     *Fill out address form
     *Verify new address is created
     */
    @Test
    public void addnewAddress() {
        homePage.navigateToSignInPage();
        signInPage.login();
        homePage.goTo();
        homePage.addItemToCart();
        basketpage.navigateToBasket();
        basketpage.clickProceedToCheckout();
        checkoutPage.addNewAddress();
        checkoutPage.clickAddressSection();
        checkoutPage.checkOutAddress();
        checkoutPage.clickAddressSection();
        checkoutPage.verifyAddress();
        checkoutPage.deleteCreatedAddress();

    }




}
