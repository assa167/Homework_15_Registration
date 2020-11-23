package company.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage {

    private WebDriver driver;

    private final static String TITLE_PROCEED_TO_CHECHOUT = "//*[@title='Proceed to checkout']";

    @FindBy(xpath = "//a[@title=\"Women\"]")
    private WebElement womenTab;

    @FindBy(xpath = "//li[@class=\"sfHover\"]/a")
    private WebElement dressTab;

    @FindBy(xpath = "//li[@class=\"sfHover\"]/a")
    private WebElement tShirtTab;

    @FindBy(xpath = "//input[4]")
    private WebElement search;

    @FindBy(xpath = "//button[@name='submit_search']")
    private WebElement submitButton;

    @FindBy(xpath = "//*[@class='product-image-container']")
    private WebElement itemView;

    @FindBy(className = "icom-th-list")
    private WebElement listView;

    @FindBy(xpath = "//span[text()='Add to cart']")
    private WebElement addCartButton;

    @FindBy(xpath = TITLE_PROCEED_TO_CHECHOUT)
    private WebElement proceedCheckout;

    @FindBy(xpath = "//span[@id='total_price']")
    private WebElement totalSum;

    @FindBy(xpath = "//*[contains(@href,'controller=my-account')]")
    private WebElement signIn;

    @FindBy(xpath = "//*[@title='Contact Us']")
    private WebElement contactUs;

    @FindBy(id = "layered_id_attribute_group_3")
    private WebElement sizeLcheckbox;

    public MainPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public MainPage clickWomanTab() {
        womenTab.click();
        return this;
    }

    public MainPage clickDressTab() {
        dressTab.click();
        return this;
    }

    public MainPage clicktShirtTab() {
        tShirtTab.click();
        return this;
    }

    public SignInPage clickSignIn() {
        signIn.click();
        return new SignInPage(driver);
    }

    public MainPage selectSizeL() {
        sizeLcheckbox.click();
        return this;
    }

    public void clickAddToCart() { addCartButton.click(); }

    public void navigateToItemView() {
        Actions actions = new Actions(driver);
        actions.moveToElement(itemView).build().perform();
    }

    public void scrollToItem() {
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].scrollIntoView(true);", itemView);
    }

    public void clickProceedToCheckout() {
        new WebDriverWait(driver, 10).
                until(ExpectedConditions.visibilityOfElementLocated(By.
                        xpath(TITLE_PROCEED_TO_CHECHOUT))).click();
    }

    public String getTotalPrice() { return totalSum.getText(); }


}
