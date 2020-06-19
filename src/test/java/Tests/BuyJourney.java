package Tests;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pageObjects.*;

import java.util.concurrent.TimeUnit;

import static Tests.TestSuite.driverFactory;
import static java.lang.Thread.sleep;

/**
 * Created by jack.forman on 23/10/2016.
 */
public class BuyJourney {

    public static WebDriver driver = driverFactory.getDriver();
    private HomePage homepage = new HomePage(driver);
    private ShoppingCartPage basketpage = new ShoppingCartPage(driver);
    private SignInPage signInPage = new SignInPage(driver);
    private ProductPage productPage = new ProductPage(driver);
    private OrderHistory orderHistory = new OrderHistory(driver);
    private AllProductsPage allProductsPage = new AllProductsPage(driver);
    @Before
    public void individualSetUp() {
        driver.manage().deleteAllCookies();
        homepage.goTo();
        homepage.maximiseBrowserWindow();
    }

    /**
     * Select Item from homepage, takes to product page
     * On homepage
     * Hover over a product's image
     * Click More Button
     * Verify product page is displayed
     */
    @Test
    public void selectItemFromHomepage() {
        homepage.hoverOverItem();
        homepage.clickMoreButton();
        productPage.productPageDisplayed();
    }


    /**
     * Add product to Cart from homepage
     * Hover over product from homepage
     * Click add to cart
     * Verify added to cart
     */
    @Test
    public void addProductToCartFromHomepage() {
        homepage.hoverOverItem();
        homepage.addItemToCart();
        homepage.addedToCart();

    }

    /**
     * Add product to cart from Product page
     * On product page
     * Select Quantity
     * Select Size
     * Select Colour (if available)
     * Click add to cart
     * Verify Added to Cart
     */
    @Test
    public void addProductToCartFromProductPage() {
        productPage.navigatetoProductPage();
        productPage.selectQuantity();
        productPage.selectSize();
        productPage.selectColour();
        basketpage.addItemToCart();
        homepage.addedToCart();

    }

    /**
     * MUST HAVE ACCOUNT WITH ORDER ALREADY PLACED
     * * Navigate to Sign In Page
     * * Click Orders (bottom of page)
     * * Click Details
     * * Choose Product
     * *Add Comment
     * *Verify that message was successfuly sent
     */

    @Test //PASS
    public void addAMessage(){
        homepage.navigateToSignInPage();
        signInPage.enterSignInEmailAddress("name@name.com");
        signInPage.enterInputPassword("password");
        signInPage.clickLogIn();
        signInPage.clickOrderHistory();
        orderHistory.clickDetails();
        orderHistory.selectProduct();
        orderHistory.InputComment("Item fits true to size");
        orderHistory.submitMessage();

        orderHistory.messageSentVerification();
    }

    /**
     * * Navigate to dresses page
     * * Select size
     * * Select colour
     * * Select price range
     * * Verify that correct product is displayed
     */

    @Test
    public void filtersOnDressPage(){
        homepage.clickWomens();
        allProductsPage.clickDresses();
        allProductsPage.clickSizeCheckBox();
        allProductsPage.clickYellowColour();
        //allProductsPage.clickPriceRange();
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

         //allProductsPage.checkOnlyAmountItem();


    }



    /**
     * *click on Women
     * *select fiters for category, size, colour
     * *then select ""clear all"" filter
     * *verify that all 7 items available again
     */

    @Test
    public void clearFilters(){

        homepage.clickWomens();
        allProductsPage.clickDresses();
        allProductsPage.clickSizeCheckBox();
        allProductsPage.clearFilters();

        //allProductsPage.checkAllItems();

    }

    /**
     * * Navigate to news subscription at the bottom of the homepage
     * * Enter a valid email address
     * * Click subscribe
     * * Verify that success message is displayed
     */

    @Test
    //PASS ADD NUMBER TO EMAIL EACH TIME
    public void subscribeNewsAndSpecialSales(){
        homepage.inputEmailToNews("name12@name.com");
        homepage.clickSubscribe();

        homepage.validateSubscribed();
    }

    /**
     * *From the homepage click on - Contact Us
     * (On the top left of the page)
     * *Enter email address
     * *Enter a message
     * *Click on - Send
     * *Verify error message
     * *Click on Send again
     * *Verify message has been sent
     */

    @Test //PASS
    public void contactUsAndSendMessage(){

        homepage.clickContactUs();
        homepage.enterEmailAddressFrom("name@name.com");
        homepage.enterMessageFrom("This is a message");
        homepage.clickSendMessage();

        homepage.validateMessageSent();
    }
}
