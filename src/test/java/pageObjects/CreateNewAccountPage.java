package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by jack.forman on 23/10/2016.
 */
public class CreateNewAccountPage extends BasePage {

    public CreateNewAccountPage(WebDriver driver) {
        super(driver);
    }

    private static final By FIRST_NAME_INPUT = By.name("firstname");
    private static final By LAST_NAME_INPUT= By.name("lastname");
    private static final By EMAIL_INPUT = By.name("email");
    private static final By PASSWORD_INPUT = By.name("password");
    private static final By SAVE_BUTTON = By.cssSelector(".form-control-submit");
    private static final By CHECK_INVALID_NAME = By.cssSelector(".help-block");
    private static final By BIRTHDATE_INPUT = By.cssSelector("[name='birthday']");
    private static final By BIRTHDATE_STRING = By.cssSelector(".help-block");

    public void enterPersonalDetails() {
        PersonalDetails pd = getPersonalDetails();
        findAndType(FIRST_NAME_INPUT, pd.getFirstName());
        findAndType(LAST_NAME_INPUT, pd.getLastName());
        findAndType(EMAIL_INPUT, pd.getEmail());
        findAndType(PASSWORD_INPUT, pd.getPassword());
    }

    public void enterNumericNameDetails() {
        findAndType(FIRST_NAME_INPUT,"123");
        findAndType(LAST_NAME_INPUT, "456");
        PersonalDetails pd = getPersonalDetails();
        findAndType(EMAIL_INPUT, "testEmail@example.com");
        findAndType(PASSWORD_INPUT, pd.getPassword());
    }

    public void enterNumericPassword() {
        PersonalDetails pd = getPersonalDetails();
        findAndType(FIRST_NAME_INPUT, pd.getFirstName());
        findAndType(LAST_NAME_INPUT, pd.getLastName());
        findAndType(EMAIL_INPUT, "robinHood@Ten10.com");
        findAndType(PASSWORD_INPUT, "123456");
    }

    public void typeIncorrectBirthdateValue() {
        findAndType(BIRTHDATE_INPUT, "birthday");
        }

    public void InvalidBirthdateErrorMessageShown() {
        waitUntilVisible(BIRTHDATE_STRING);
        }

    public void clickSave() {
        waitAndClick(SAVE_BUTTON);
    }

    public void checkInvalidName() {
        waitUntilVisible(CHECK_INVALID_NAME);
    }

}
