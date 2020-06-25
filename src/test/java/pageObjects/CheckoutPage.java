package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class CheckoutPage extends BasePage {


    private static final By SECOND_ADDRESS = By.xpath(".address-item.selected");
    private static final By SECOND_ADDRESS_CHECKED = By.xpath(".address-item.selected");
    private static final By CLICK_ADDRESS_SECTION = By.xpath("//section[@id='checkout-addresses-step']/h1");
    //private static final By FIRST_ADDRESS = By.xpath("//article[@id='id-address-invoice-address-385']/header/label/span[2]");
    private static final By FIRST_ADDRESS = By.xpath("//article[@id='id-address-invoice-address-328']/header/label/span[2]");
    private static final By CHECKOUT_ADDRESS = By.name("confirm-addresses");
    private static final By ADD_NEW_ADDRESS = By.linkText("add new address");
    private static final By LAST_SHIPPING_ADDRESS = By.cssSelector("article:nth-child(2)");
    private static final By DELETE_SECOND_ADDRESS = By.cssSelector("#delivery-addresses .address-item.selected .address-footer .delete-address.text-muted:nth-child(2)");
    private static final By CHECKOUT_SHIPPING_SECTION = By.cssSelector("#checkout-delivery-step");
    private static final By IS_COMMENT_ADDED = By.cssSelector("textarea");
    private PersonalDetails pd = getPersonalDetails();
    private static final By ADDRESS_SECTION = By.id("checkout-addresses-step");
    private static final By ADDRESS_INPUT = By.name("address1");
    private static final By CITY_INPUT = By.name("city");
    private static final By STATE_DROPDOWN = By.name("id_state");
    private static final By POSTCODE_INPUT = By.name("postcode");
    private static final By SHIPPING_METHOD_SECTION = By.id("checkout-delivery-step");
    private static final By TERMS_CHECKBOX = By.id("conditions_to_approve[terms-and-conditions]");
    private static final By PAYMENT_SECTION = By.id("checkout-payment-step");
    private static final By BANK_WIRE_RADIO_BUTTON = By.cssSelector("#payment-option-2");
    private static final By ORDER_BUTTON = By.cssSelector("#payment-confirmation button");
    private static final By ORDER_CONFIRMATION_MESSAGE = By.cssSelector("#content-hook_order_confirmation");
    private static final By CONTINUE_BUTTON = By.cssSelector(".continue.btn.btn-primary.float-xs-right");
    private static final By SHIPPING_COMMENT_INPUT = By.id("delivery_message");
    private static final By BILLING_ADDRESS_DIFFERENT = By.linkText("Billing address differs from shipping address");


    public void deliveryAddressEnterDisplayed() {

        WebElement enterAddress = driver.findElement(ADDRESS_SECTION);
        Assert.assertTrue(elementIsVisible(enterAddress));

        findAndType(ADDRESS_INPUT, pd.getAddress());
        findAndType(CITY_INPUT, pd.getCity());
        Select state = new Select(driver.findElement(STATE_DROPDOWN));
        state.selectByVisibleText(pd.getState());
        findAndType(POSTCODE_INPUT, pd.getPostcode());
    }


    public void shippingPageDisplayed() {
        WebElement shipping = driver.findElement(SHIPPING_METHOD_SECTION);
        Assert.assertTrue(elementIsVisible(shipping));

    }

    public void agreeToTerms() {
        driver.findElement(TERMS_CHECKBOX).click();
    }

    public void paymentPageDisplayed() {
        WebElement payment = driver.findElement(PAYMENT_SECTION);
        Assert.assertTrue(elementIsVisible(payment));
    }

    public void clickPayByBankWire() {
        driver.findElement(BANK_WIRE_RADIO_BUTTON).click();
    }

    public void confirmOrder() {
        waitAndClick(ORDER_BUTTON);
    }

    public void orderConfirmationDisplayed() {
        waitUntilVisible(ORDER_CONFIRMATION_MESSAGE);
    }

    public void clickProceedToNextSection() {
        boolean clickable = false;
        List<WebElement> continueButtons = driver.findElements(CONTINUE_BUTTON);
        while (!clickable) {
            for (WebElement continueButton : continueButtons) {
                try {
                    continueButton.click();
                    clickable = true;
                } catch (ElementNotInteractableException e) {

                }
            }
        }
    }

    public void deliveryAddressSectionDisplayed() {
        waitUntilVisible(ADDRESS_SECTION);
    }

    public void enterShippingComment() {
        findAndType(SHIPPING_COMMENT_INPUT, "Comment is added");
    }

    public void clickDifferentBillingAddress() { waitAndClick(BILLING_ADDRESS_DIFFERENT);
    }

    public void selectSecondAddress() { waitAndClick(SECOND_ADDRESS);
    }

    public void isSecondAddressSelected() {
        String actualString = driver.findElement(SECOND_ADDRESS_CHECKED).getText();
        Assert.assertEquals("Antony Christopher\n" +
                "112\n" +
                "fffe, Indiana 11223\n" +
                "United States",actualString);
    }

    public void clickAddressSection() { waitAndClick(CLICK_ADDRESS_SECTION);
    }

    public void selectFirstAddress() { waitAndClick(FIRST_ADDRESS);
    }

    public void checkOutAddress() { waitAndClick(CHECKOUT_ADDRESS);
    }

    public void addNewAddress() {
        waitAndClick(ADD_NEW_ADDRESS);
        waitAndClick(By.name("address1"));
        driver.findElement(By.name("address1")).sendKeys("112");
        driver.findElement(By.name("city")).click();
        driver.findElement(By.name("city")).clear();
        driver.findElement(By.name("city")).sendKeys("fffe");
        driver.findElement(By.name("postcode")).click();
        driver.findElement(By.name("postcode")).clear();
        driver.findElement(By.name("postcode")).sendKeys("11223");
        driver.findElement(By.name("use_same_address")).click();
        driver.findElement(By.name("confirm-addresses")).click();
        driver.findElement(By.name("id_state")).click();
        new Select(driver.findElement(By.name("id_state"))).selectByVisibleText("Indiana");
        driver.findElement(By.name("confirm-addresses")).click();

    }
    public void verifyAddress(){
            checkTextExistsInElement(LAST_SHIPPING_ADDRESS,"fffe, Indiana 11223");
        }
    void checkTextExistsInElement(By selector , String inputText){
        Assert.assertTrue(driver.findElement(selector).getText().contains(inputText));

    }

    public void deleteCreatedAddress() { waitAndClick(DELETE_SECOND_ADDRESS);
    }

    public void clickShippingSection() { waitAndClick(CHECKOUT_SHIPPING_SECTION);
    }

    public void verifyCommentAdded() {
        String actualString = driver.findElement(IS_COMMENT_ADDED).getText();
        Assert.assertEquals("Comment is added",actualString);
    }

}
