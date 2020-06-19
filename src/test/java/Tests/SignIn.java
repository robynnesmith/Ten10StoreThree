package Tests;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pageObjects.HomePage;
import pageObjects.SignInPage;

import static Tests.TestSuite.driverFactory;

/**
 * Created by jack.forman on 30/10/2016.
 */
public class SignIn {

    public static WebDriver driver = driverFactory.getDriver();
    private HomePage homepage = new HomePage(driver);
    private SignInPage signInPage = new SignInPage(driver);


    @Before
    public void individualSetUp() {
        driver.manage().deleteAllCookies();
        homepage.goTo();
    }


    /**
     * Sign in as Registered User
     * Pre-Conditions - Must have signIn information for a registered user
     * Navigate to Sign In Page
     * Fill in Email Address
     * Fill in Password
     * Click Sign In
     * Verify My Account is Displayed
     */
    @Test
    public void signInAsRegisteredUser() {
        homepage.navigateToSignInPage();
        signInPage.login();
    }

    /**
     * Cannot sign in as unregistered customer
     * Pre-Conditions - Must have Email address and Password of unregistered customer
     * Navigate to Sign in Page
     * Fill in Email Address
     * Fill in Password
     * Click Sign in
     * Verify Error Message is Displayed
     */
    @Test
    public void signInAsUnRegisteredUser() {
        homepage.navigateToSignInPage();
        signInPage.invalidLogin();
        signInPage.unregisteredUserAlert();

    }

    /**
     * Forgotten Password
     * Pre-Conditions - Must have signIn information for a registered user
     * Navigate to Sign In Page
     * Click Forgotten Password
     * Enter E mail Address
     * Click retrieve password
     * Confirmation message displayed
     */
    @Test
    public void forgottenPassword() {

        homepage.navigateToSignInPage();
        signInPage.forgottenPasswordCheck();
    }

    /**
     * Able to sign out
     * Pre-Conditions - Must have signIn information for a registered user
     * Navigate to Sign In Page
     * Click sign out
     * Verify customer signed out
     */
    @Test
    public void signOut() {

        homepage.navigateToSignInPage();
        signInPage.login();
        signInPage.clickSignOut();
        signInPage.userSignedOut();

    }

    /**
    Pre-Conditions
        *have details for existing account and be logged in
        *navigate to account page
    Steps
       *navigate to account information
       *opt in to receiving offers and subscribe to newsletter
       *verify information updated
     */

    @Test
    public void OptIns() {
        homepage.navigateToSignInPage();
        signInPage.login();
        signInPage.clickInformation();
        signInPage.checkOffers();
        signInPage.checkNewsletter();
        signInPage.saveChanges();
        signInPage.confirmedChanges();
    }

    /**
    Pre-Conditions
     *have details for existing account and be logged in
    Steps
      *Navigate to sign in page
      *Enter registered email address
      *Enter invalid password
      *Click sign in
      *Verify error message is shown
     */
    @Test
    public void InvalidPassword(){
        homepage.navigateToSignInPage();
        signInPage.enterInvalidPassword();
        signInPage.confirmInvalidPassword();
    }

    /**
     Pre-Conditions
      *have existing account and be logged in
     Steps
      *navigate to account page and to addresses section
      *add a new address and enter details into 'alias' and 'company' fields
      *verify new address has been added
    */
    @Test
    public void NewAddressLogIn(){
        homepage.navigateToSignInPage();
        signInPage.login();
        signInPage.ClickAddressLogin();
        signInPage.AddAddressLoggedIn();
        signInPage.AddingNewAddressQuick();
        signInPage.AddingNewAddressLonger();
        signInPage.SaveAddressLoggedIn();
        signInPage.CheckingAddressLoggedIn();
    }
    /**
     Pre-Conditions
      *signed in with existing account details
      *have an existing order
     Steps
     *navigate to order history on account page
     *add a message to existing order
     *verify message has been sent
    */

    @Test
    public void OrderMessage(){
        homepage.navigateToSignInPage();
        signInPage.login();
        signInPage.ClickOrderHistory();
        signInPage.ClickOrderDetails();
        signInPage.clickProductType();
        signInPage.inputMessage();
        signInPage.checkMessageSent();
    }
    /**
    Steps
    *Go to sign in page
    *Click forgot password
    *Enter unregistered email
    *Verify error message is displayed
     */

    @Test
    public void UnregisteredEmailPassword(){
        homepage.navigateToSignInPage();
        signInPage.invalidUserPasswordReset();
    }
}


