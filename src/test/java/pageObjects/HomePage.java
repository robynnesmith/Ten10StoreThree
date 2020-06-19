package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

/**
 * Created by jack.forman on 22/10/2016.
 */
public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    private static String URL = "http://3.11.70.191/index.php";
    private Actions actions = new Actions(driver);

    private static final By SIGN_IN_BUTTON = By.cssSelector("#_desktop_user_info a");
    private static final By BLOUSE_IMAGE = By.cssSelector("img[alt = 'Blouse'");
    private static final By QUICK_VIEW_LINK = By.cssSelector(".quick-view");
    private static final By LAST_PRODUCT_IMAGE = By.cssSelector("div.products > article:nth-child(7) img");
    private static final By LAST_PRODUCT_QUICKVIEW = By.cssSelector("div.products > article:nth-child(7) .quick-view");
    private static final By ADD_TO_CART_BUTTON = By.cssSelector(".btn.btn-primary.add-to-cart");
    private static final By MODAL_WINDOW = By.cssSelector("#myModalLabel");
    private static final By WOMENS_BUTTON = By.cssSelector(".dropdown-item:first-of-type");
    private static final By EMAIL_INPUT = By.name("email");
    private static final By SUBSCRIBE_BUTTON = By.name("submitNewsletter");
    private static final By CONTACT_US_BUTTON = By.linkText("Contact us");
    private static final By CONTACT_US_EMAIL = By.name("from");
    private static final By MESSAGE_FROM = By.name("message");
    private static final By SEND_MESSAGE = By.name("submitMessage");

    public void goTo() {
        driver.get(URL);
    }

    public void navigateToSignInPage() {
        waitAndClick(SIGN_IN_BUTTON);
    }

    public void clickWomens(){ waitAndClick(WOMENS_BUTTON);}

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
        WebElement firstProductImage = driver.findElement(LAST_PRODUCT_IMAGE);
        WebElement firstProductQuickView = driver.findElement(LAST_PRODUCT_QUICKVIEW);
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


    public void itemAddedToCart() {
        maximiseBrowserWindow();
        addItemToCart();
        addedToCart();
    }

    public void inputEmailToNews(String input){
        findAndType(EMAIL_INPUT, input);
    }

    public void clickSubscribe(){
        waitAndClick(SUBSCRIBE_BUTTON);
    }

    public void validateSubscribed(){
        checkTextExistsInElement("main", "You have successfully subscribed to this newsletter.");
    }

    public void clickContactUs(){
        waitAndClick(CONTACT_US_BUTTON);
    }

    public void enterEmailAddressFrom(String input){
        findAndType(CONTACT_US_EMAIL, input);
    }

    public void enterMessageFrom(String input){
        findAndType(MESSAGE_FROM, input);
    }

    public void clickSendMessage(){
        waitAndClick(SEND_MESSAGE);
    }

    public void validateMessageSent(){
        checkTextExistsInElement("section", "Your message has been successfully sent to our team.");
    }

}
