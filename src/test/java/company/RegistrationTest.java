package company;


import company.model.RegistrationForm;
import company.model.RegistrationBuilder;
import company.pages.MainPage;
import company.pages.MyAccountPage;
import company.pages.RegistrationPage;
import company.pages.SignInPage;
import company.pages.attributes.CreateAccountAttribute;
import company.pages.attributes.AlreadyRegistered;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static company.utils.TestHelper.randomInt;

public class RegistrationTest extends BaseTest {

    private RegistrationForm account;
    private MainPage mainPage;
    private SignInPage signInPage;
    private RegistrationPage registrationPage;
    private MyAccountPage myAccountPage;

    @Before
    public void setupAccount() {
        account = new RegistrationBuilder()
                .withGender("Mr.")
                .withEmail("John.Goodness" + randomInt() + "@gmail.com")
                .withPass("John.Goodness")
                .withFirstCustomerName("John")
                .withLastCustomerName("Goodness")
                .withDay("8")
                .withMonth("5")
                .withYear("1999")
                .withFirstName("Yakov")
                .withLastName("Fayn")
                .withCompany("IBM")
                .withAdress1("San Francisco 1")
                .withAdress2("Moscow 2")
                .withCity("London")
                .withState("Alaska")
                .withPostcode("02206")
                .withCountry("United States")
                .withMobilePhone("+30995347943")
                .withAlias("Alloha!")
                .build();

        mainPage = new MainPage(driver);
    }

    @Test
    public void canCreateNewAccount() {
        signInPage = mainPage.clickSignIn();
        registrationPage = signInPage.createNewAccountWithEmail(account.getEmail());
        myAccountPage = registrationPage.fillAndSubmitRegistrationForm(account);
        String actualResult = myAccountPage.getAccountName();
        String expectedResult = account.getFirstCustomerName();

        Assert.assertTrue("If est failed then user name is incorrect", actualResult.contains(expectedResult));
    }

    @Test
    public void canCreateNewAccountChain() {
        Assert.assertTrue(mainPage.clickSignIn()
                .createNewAccountWithEmail(account.getEmail())
                .fillAndSubmitRegistrationForm(account)
                .getAccountName()
                .contains(account.getFirstCustomerName()));

    }
}
