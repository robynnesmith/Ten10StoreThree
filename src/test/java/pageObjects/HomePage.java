package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.Random;

/**
 * Created by jack.forman on 22/10/2016.
 */
public class HomePage extends BasePage {

    private static String URL = "http://3.11.70.191/index.php";
    private Actions actions = new Actions(driver);

    private static final By SIGN_IN_BUTTON = By.cssSelector("#_desktop_user_info a");
    private static final By BLOUSE_IMAGE = By.cssSelector("img[alt = 'Blouse'");
    private static final By QUICK_VIEW_LINK = By.cssSelector(".quick-view");
    private static final By FIRST_PRODUCT_IMAGE = By.cssSelector("div.products > article:last-child img");
    private static final By FIRST_PRODUCT_QUICKVIEW = By.cssSelector("div.products > article:last-child .quick-view");
    private static final By ADD_TO_CART_BUTTON = By.cssSelector(".btn.btn-primary.add-to-cart");
    private static final By MODAL_WINDOW = By.cssSelector("#myModalLabel");
    private static final By WOMENS_BUTTON = By.cssSelector(".dropdown-item:first-of-type");
    private static final By EMAIL_INPUT = By.name("email");
    private static final By SUBSCRIBE_BUTTON = By.name("submitNewsletter");
    private static final By CONTACT_US_BUTTON = By.linkText("Contact us");
    private static final By CONTACT_US_EMAIL = By.name("from");
    private static final By MESSAGE_FROM = By.name("message");
    private static final By SEND_MESSAGE = By.name("submitMessage");
    private static final By SUCCESSFULLY_SUBSCRIBED = By.cssSelector(".alert.alert-success");
    private static final By MESSAGE_SENT = By.cssSelector(".col-xs-12.alert.alert-success");
    private static final By ADD_TO_CART = By.cssSelector(".btn.btn-primary.add-to-cart");
    private static final By SUMMER_DRESSES = By.id("category-11");
    private static final By SEARCH_BAR = By.name("s");
    private static final By SEARCH_BUTTON = By.cssSelector(".material-icons.search:first-of-type");

    public void goTo() {
        driver.get(URL);
    }

    public void navigateToSignInPage() {
        waitAndClick(SIGN_IN_BUTTON);
    }

    public void clickWomens() {
        waitAndClick(WOMENS_BUTTON);
    }

    public void hoverOverItem() {

        actions.moveToElement(driver.findElement(BLOUSE_IMAGE)).build().perform();

        WebElement hoverView = driver.findElement(QUICK_VIEW_LINK);
        Assert.assertTrue(elementIsVisible(hoverView));
    }

    public void clickMoreButton() {
        waitAndClick(BLOUSE_IMAGE);
    }


    public void maximiseBrowserWindow() {
        driver.manage().window().maximize();
    }

    public void addItemToCart() {
        WebElement firstProductImage = driver.findElement(FIRST_PRODUCT_IMAGE);
        WebElement firstProductQuickView = driver.findElement(FIRST_PRODUCT_QUICKVIEW);
        actions
                .moveToElement(firstProductImage)
                .click(firstProductQuickView)
                .perform();
        waitAndClick(ADD_TO_CART_BUTTON);
    }

    public void addedToCart() {
        waitUntilVisible(MODAL_WINDOW);
        WebElement addedToCart = driver.findElement(MODAL_WINDOW);
        Assert.assertTrue(elementIsVisible(addedToCart));
    }

    public void clickAddToCart() {
        waitAndClick(ADD_TO_CART);
    }


    public void itemAddedToCart() {
        maximiseBrowserWindow();
        addItemToCart();
        addedToCart();
    }

    public void inputEmailToNews(String input) {
        Random randomNumber = new Random();
        int randomInt = randomNumber.nextInt(1000);
        findAndType(EMAIL_INPUT, input + randomInt);
    }

    public void clickSubscribe() {
        waitAndClick(SUBSCRIBE_BUTTON);
    }

    public void validateSubscribed() {
        waitUntilVisible(SUCCESSFULLY_SUBSCRIBED);
        WebElement addedToCart = driver.findElement(SUCCESSFULLY_SUBSCRIBED);
        Assert.assertTrue(elementIsVisible(addedToCart));
    }

    public void clickContactUs() {
        waitAndClick(CONTACT_US_BUTTON);
    }

    public void enterEmailAddressFrom(String input) {
        findAndType(CONTACT_US_EMAIL, input);
    }

    public void enterMessageFrom(String input) {
        findAndType(MESSAGE_FROM, input);
    }

    public void clickSendMessage() {
        waitAndClick(SEND_MESSAGE);
    }

    public void validateMessageSent() {
        waitUntilVisible(MESSAGE_SENT);
        WebElement addedToCart = driver.findElement(MESSAGE_SENT);
        Assert.assertTrue(elementIsVisible(addedToCart));
    }

    public void hoverAndClickSummerDresses() {
        hoverAndClick(driver, WOMENS_BUTTON, SUMMER_DRESSES);
    }

    public void searchForDress() {
        findAndType(SEARCH_BAR, "PRINTED SUMMER DRESS");
        waitAndClick(SEARCH_BUTTON);
    }

    public void searchForShirt() {
        findAndType(SEARCH_BAR, "FADED SHORT SLEEVES T-SHIRT");
        waitAndClick(SEARCH_BUTTON);
        WebElement firstProductImage = driver.findElement(FIRST_PRODUCT_IMAGE);
        WebElement firstProductQuickView = driver.findElement(FIRST_PRODUCT_QUICKVIEW);
        actions
                .moveToElement(firstProductImage)
                .click(firstProductQuickView)
                .perform();
    }

}
