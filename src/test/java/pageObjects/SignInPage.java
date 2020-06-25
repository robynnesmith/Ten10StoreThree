package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertTrue;

/**
 * Created by jack.forman on 23/10/2016.
 */
public class SignInPage extends BasePage {

    private PersonalDetails pd = getPersonalDetails();
    private PersonalDetails pd2 = getPersonalDetails();
    private WebDriverWait wait = new WebDriverWait(driver, 10);
    private Actions actions = new Actions(driver);

    private static final By EMAIL_ADDRESS_INPUT_BOX = By.cssSelector("input#email_create");
    private static final By CREATE_NEW_ACCOUNT_BUTTON = By.cssSelector(".no-account>a");
    private static final By ALREADY_REGISTERED_ALERT = By.cssSelector(".alert.alert-danger");
    private static final By EMAIL_INPUT = By.cssSelector("[name='email']");
    private static final By PASSWORD_INPUT = By.name("password");
    private static final By SIGN_IN_BUTTON = By.cssSelector("#login-form button[type='submit']");
    private static final By SIGN_OUT_BUTTON = By.cssSelector(".logout.hidden-sm-down");
    private static final By UNREGISTERED_USER_ALERT = By.cssSelector(".alert.alert-danger");
    private static final By FORGOTTEN_PASSWORD_LINK = By.cssSelector(".forgot-password");
    private static final By SEND_RESET_LINK_BUTTON = By.cssSelector(".forgotten-password button:first-of-type");
    private static final By NOTIFICATION_MESSAGE = By.cssSelector(".ps-alert-error");
    private static final By CLICK_INFORMATION = By.cssSelector("#identity-link > span");
    private static final By CHECK_OFFER = By.cssSelector("[name=optin]");
    private static final By CHECK_NEWSLETTER = By.cssSelector("[name=newsletter]");
    private static final By SAVE_ACCOUNT_CHANGES = By.cssSelector("[data-link-action=save-customer]");
    private static final By CONFIRM_CHANGES = By.cssSelector("article.alert.alert-success");
    private static final By INVALID_PASSWORD_ALERT = By.cssSelector("li.alert.alert-danger");
    private static final By ADDRESS_LOGIN_BUTTON = By.cssSelector("#addresses-link > span");
    private static final By LOGIN_ADD_ADDRESS_LINK = By.cssSelector("div.addresses-footer > a > span");
    private static final By LOGGED_IN_ALIAS = By.cssSelector("[name=alias]");
    private static final By LOGGED_IN_COMPANY_NAME = By.cssSelector("[name=company]");
    private static final By LOGGED_IN_COMPANY_ADDRESS = By.cssSelector("[name=address1");
    private static final By LOGGED_IN_CITY = By.cssSelector("[name=city]");
    private static final By CLICK_LOGGED_IN_STATE = By.cssSelector("[name=id_state]");
    private static final By LOGGED_IN_ZIP = By.cssSelector("[name=postcode");
    private static final By SAVED_NEW_ADDRESS_LOGGED_IN = By.cssSelector("footer > button");
    private static final By ORDERS_LOGIN_BUTTON = By.cssSelector("#history-link > span");
    private static final By ORDER_DETAILS_LINK = By.cssSelector("tr:nth-child(14) > td.text-sm-center.order-actions > a:nth-child(1)");
    private static final By CLICK_LOGGED_IN_TYPE = By.cssSelector("select");
    private static final By ORDER_MESSAGE = By.cssSelector("textarea");
    private static final By SEND_BUTTON = By.cssSelector("[name=submitMessage]");
    private static final By SEND_CHECK = By.cssSelector("article.alert.alert-success");
    private static final By RETRIEVE_PASSWORD_CHECK = By.cssSelector("li > p");

    private static final By ORDER_HISTORY_BUTTON = By.linkText("Orders");

    public void enterCreateNewAccountEmailAddress(String emailAddress) {
        findAndType(EMAIL_ADDRESS_INPUT_BOX, emailAddress);
    }

    public void clickCreateAnAccount() {
        waitAndClick(CREATE_NEW_ACCOUNT_BUTTON);
    }

    public void alreadyRegisteredAlertPresent() {
        WebElement alertBox = driver.findElement(ALREADY_REGISTERED_ALERT);
        assertTrue(elementIsVisible(alertBox));
    }

    public void enterPassword() {
        findAndType(PASSWORD_INPUT, pd.getPassword());
    }

    public void enterInputPassword(String input){ findAndType(PASSWORD_INPUT, input);}

    public void successfulSignIn() {
        waitUntilVisible(SIGN_OUT_BUTTON);
        assertTrue(elementIsVisible(driver.findElement(SIGN_OUT_BUTTON)));
    }

    public void enterSignInEmailAddress(String emailAddress) {
        findAndType(EMAIL_INPUT, emailAddress);
    }

    public void clickLogIn() {
        waitAndClick(SIGN_IN_BUTTON);
    }

    public void unregisteredUserAlert() {
        WebElement alertBox = driver.findElement(UNREGISTERED_USER_ALERT);
        assertTrue(elementIsVisible(alertBox));
    }

    public void forgottenPassword() {
        waitAndClick(FORGOTTEN_PASSWORD_LINK);
    }

    public void enterForgottenPasswordEmailAddress(String email) {
        findAndType(EMAIL_INPUT, email);
    }

    public void clickRetrievePassword() {
        waitAndClick(SEND_RESET_LINK_BUTTON);
    }

    public void clickOrderHistory(){ waitAndClick(ORDER_HISTORY_BUTTON);}

    public void confirmationMessage() {
        WebElement alertBox = driver.findElement(NOTIFICATION_MESSAGE);
        assertTrue(elementIsVisible(alertBox));
    }

    public void clickSignOut() {
        waitAndClick(SIGN_OUT_BUTTON);
    }

    public void userSignedOut() {
        waitUntilInvisible(SIGN_OUT_BUTTON);
        driver.navigate().refresh();
        WebElement signInButton = driver.findElement(SIGN_IN_BUTTON);
        assertTrue(elementIsVisible(signInButton));
    }

    public void login() {
        enterSignInEmailAddress(pd.getEmail());
        enterPassword();
        clickLogIn();
        successfulSignIn();
    }

    public void invalidLogin() {
        enterSignInEmailAddress(pd.getInvalidEmail());
        enterPassword();
        clickLogIn();
        unregisteredUserAlert();
    }

    public void forgottenPasswordCheck() {
        forgottenPassword();
        enterForgottenPasswordEmailAddress(pd.getEmail());
        clickRetrievePassword();
        confirmationMessage();
    }

    public void clickInformation() {
        waitAndClick(CLICK_INFORMATION);
    }

    public void checkOffers() {
        enterPassword();
        WebElement Offers = driver.findElement(CHECK_OFFER);
        actions
                .moveToElement(Offers)
                .click(Offers)
                .perform();
    }

    public void checkNewsletter() {
        WebElement Newsletter = driver.findElement(CHECK_NEWSLETTER);
        actions
                .moveToElement(Newsletter)
                .click(Newsletter)
                .perform();
    }

    public void clickSignIn() {
        WebElement clickSignInButton = driver.findElement(By.cssSelector("#_desktop_user_info a"));
        actions
                .moveToElement(clickSignInButton)
                .click(clickSignInButton)
                .perform();
    }

    public void saveChanges() {
        WebElement Changes = driver.findElement(SAVE_ACCOUNT_CHANGES);
        actions
                .moveToElement(Changes)
                .click(Changes)
                .perform();
    }


    public void confirmedChanges() {
        WebElement Changes = driver.findElement(CONFIRM_CHANGES);
        assertTrue(elementIsVisible(Changes));
    }

    public void enterInvalidPassword() {
        enterSignInEmailAddress(pd.getEmail());
        findAndType(PASSWORD_INPUT, "Obviously Wrong");
        clickLogIn();
    }

    public void confirmInvalidPassword() {
        WebElement Changes = driver.findElement(INVALID_PASSWORD_ALERT);
        assertTrue(elementIsVisible(Changes));
    }

    public void ClickAddressLogin() {
        WebElement AddressLogin = driver.findElement(ADDRESS_LOGIN_BUTTON);
        actions
                .moveToElement(AddressLogin)
                .click(AddressLogin)
                .perform();

    }

    public void AddAddressLoggedIn() {
        WebElement AddressLoggedIn = driver.findElement(LOGIN_ADD_ADDRESS_LINK);
        actions
                .moveToElement(AddressLoggedIn)
                .click(AddressLoggedIn)
                .perform();
    }

    public void AddingNewAddressQuick() {
        findAndType(LOGGED_IN_ALIAS, "For the Lady");
        findAndType(LOGGED_IN_CITY, "Sherwood");
        findAndType(LOGGED_IN_COMPANY_ADDRESS, "Forest Way");
        findAndType(LOGGED_IN_COMPANY_NAME, "Merry Men Banking");
        findAndType(LOGGED_IN_ZIP, "43556");
    }

    public void AddingNewAddressLonger() {
        WebElement statesDropDown = driver.findElement(CLICK_LOGGED_IN_STATE);
        actions
                .moveToElement(statesDropDown)
                .click(statesDropDown)
                .perform();
        Select dropDownPick = new Select(driver.findElement(By.name("id_state")));
        dropDownPick.selectByVisibleText("Ohio");
    }

    public void SaveAddressLoggedIn() {
        waitAndClick(SAVED_NEW_ADDRESS_LOGGED_IN);
    }

    public void CheckingAddressLoggedIn() {
        WebElement LoggedInAddress = driver.findElement(CONFIRM_CHANGES);
        assertTrue(elementIsVisible(LoggedInAddress));

    }

    public void ClickOrderHistory() {
        WebElement OrderHistories = driver.findElement(ORDERS_LOGIN_BUTTON);
        actions
                .moveToElement(OrderHistories)
                .click(OrderHistories)
                .perform();
    }

    public void ClickOrderDetails() {
        WebElement OrderDetails = driver.findElement(ORDER_DETAILS_LINK);
        actions
                .moveToElement(OrderDetails)
                .click(OrderDetails)
                .perform();
    }

    public void clickProductType() {
        WebElement productDropDown = driver.findElement(CLICK_LOGGED_IN_TYPE);
        actions
                .moveToElement(productDropDown)
                .click(productDropDown)
                .perform();
        Select dropDownPick = new Select(driver.findElement(By.name("id_product")));
        dropDownPick.selectByVisibleText("Printed Dress - Size : S- Color : Orange");
    }

    public void inputMessage() {
        findAndType(ORDER_MESSAGE, "Take from the Rich, give to the poor");
    }

    public void checkMessageSent() {
        WebElement MessageOutbox = driver.findElement(SEND_BUTTON);
        actions
                .moveToElement(MessageOutbox)
                .click(MessageOutbox)
                .perform();
        WebElement isMessageSentCheck = driver.findElement(SEND_CHECK);
        assertTrue(elementIsVisible(isMessageSentCheck));
    }

    public void invalidUserPasswordReset() {
        forgottenPassword();
        enterSignInEmailAddress(pd.getInvalidEmail());
        clickRetrievePassword();
        WebElement InvalidPasswordResetCheck = driver.findElement(RETRIEVE_PASSWORD_CHECK);
        assertTrue(elementIsVisible(InvalidPasswordResetCheck));
    }
}

