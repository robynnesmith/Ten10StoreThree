package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ProductPage extends BasePage {


    private static final By ADD_TO_CART_BUTTON = By.cssSelector(".btn.btn-primary.add-to-cart");
    private static final By PRINTED_DRESS_IMAGE = By.cssSelector("img[alt = 'Printed Dress'");
    private static final By QUANTITY_UP_BUTTON = By.cssSelector(".material-icons.touchspin-up");
    private static final By SIZE_DROPDWON = By.cssSelector("#group_1");
    private static final By WHITE_COLOUR_OPTION = By.cssSelector("input[value = '24']");
    private static final By QUANTITY = By.name("qty");
    private static final By NO_STOCK_MESSAGE = By.cssSelector(".material-icons.product-unavailable");

    public void productPageDisplayed() {
        WebElement productPage = driver.findElement(ADD_TO_CART_BUTTON);
        Assert.assertTrue(elementIsVisible(productPage));
    }

    public void navigatetoProductPage() {
        waitAndClick(PRINTED_DRESS_IMAGE);
    }

    public void selectQuantity() {
        waitAndClick(QUANTITY_UP_BUTTON);
    }

    public void selectSize() {
        Select size = new Select(driver.findElement(SIZE_DROPDWON));
        size.selectByVisibleText("M");
    }

    public void selectColour() {
        WebElement chooseColour = driver.findElement(WHITE_COLOUR_OPTION);
        chooseColour.click();
    }

    public void deleteQuantity() { driver.findElement(QUANTITY).clear(); }
    public void changeQuantity(String number) {
        deleteQuantity();
        findAndType(QUANTITY, number);
    }

    public void verifyInsufficientStock(){
        waitUntilVisible(NO_STOCK_MESSAGE);
        WebElement addedToCart = driver.findElement(NO_STOCK_MESSAGE);
        Assert.assertTrue(elementIsVisible(addedToCart));
    }

    public void verifyProductAvailableWithOtherOptions(){
        waitUntilVisible(NO_STOCK_MESSAGE);
        WebElement addedToCart = driver.findElement(NO_STOCK_MESSAGE);
        Assert.assertTrue(elementIsVisible(addedToCart));
    }



}
