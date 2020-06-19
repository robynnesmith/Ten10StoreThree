package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AllProductsPage extends BasePage {
    public AllProductsPage (WebDriver driver) {
        super(driver);
    }

    private static final By DRESSES = By.linkText("Dresses");
    private static final By CHOOSE_SIZE = By.xpath("/html/body/main/section/div/div[1]/div[2]/div[2]/section[2]/ul/li[2]/label/span/span");
    private static final By YELLOW_COLOUR = By.xpath("/html/body/main/section/div/div[1]/div[2]/div[2]/section[3]/ul/li[7]/label/a");
    private static final By CLICK_PRICE_RANGE = By.xpath("/html/body/main/section/div/div[1]/div[2]/div[2]/section[6]/ul/li[1]/label/span");
    private static final By CLEAR_ALL = By.id("_desktop_search_filters_clear_all");

    public void clickDresses(){ waitAndClick(DRESSES);}

    public void clickSizeCheckBox(){ waitAndClick(CHOOSE_SIZE); }

    public void clickYellowColour(){ waitAndClick(YELLOW_COLOUR);}

    public void clickPriceRange(){ waitAndClick(CLICK_PRICE_RANGE); }

    public void clearFilters(){ waitAndClick(CLEAR_ALL);}

    public void checkOnlyAmountItem(){
        checkTextExistsInElement("div", "There are 3 products.");
    }

    public void checkAllItems(){
        checkTextExistsInElement("div", "There are 7 products.");
    }

}
