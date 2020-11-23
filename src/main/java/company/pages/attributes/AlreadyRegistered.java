package company.pages.attributes;

import org.checkerframework.checker.nullness.compatqual.NonNullType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlreadyRegistered {
    private WebDriver driver;

    @FindBy(xpath = "//input[@id=\"email\"]")
    private WebElement emailField;

    @FindBy(xpath = "//input[@id=\"passwd\"]")
    private WebElement passwField;

    @FindBy(xpath = "//button[@id=\"SubmitLogin\"]/span")
    private WebElement signInBtn;


    public AlreadyRegistered(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }



    public AlreadyRegistered typeEmail(String email) { return setUserData(email, emailField); }

    public AlreadyRegistered typePassword(String passwd) { return setUserData(passwd, passwField); }

    public void clickSignIn() { signInBtn.click(); }

    private AlreadyRegistered setUserData(@NonNullType String passwdm, @NonNullType WebElement element) {
        if (!element.getText().isEmpty()){
            element.sendKeys(passwdm);
        }else {
            element.clear();
            element.sendKeys(passwdm);
        }
        return this;
    }
}
