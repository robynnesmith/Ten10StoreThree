package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class OrderHistory extends BasePage{

    private static final By DETAILS_BUTTON = By.linkText("Details");
    private static final By SELECT_PROUCT = By.name("id_product");
    private static final By INPUT_COMMENT = By.name("msgText");
    private static final By SUBMIT_MESSAGE = By.name("submitMessage");

    public void clickDetails(){ waitAndClick(DETAILS_BUTTON); }

    public void selectProduct(){
        Select size = new Select(driver.findElement(SELECT_PROUCT));
        size.selectByValue("6");
    }

    public void InputComment(String input){ findAndType(INPUT_COMMENT, input);}

    public void submitMessage(){ waitAndClick(SUBMIT_MESSAGE); }

    public void messageSentVerification(){
        checkTextExistsInElement("section", "Message successfully sent");
    }


}
