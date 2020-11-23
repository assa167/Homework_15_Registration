package company;

import company.pages.MainPage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MainPageTest extends BaseTest {

    private MainPage mainPage;

    @Before
    public void setMainPage() { mainPage = new MainPage(driver); }

    @Test
    public void canCheckTotalPriceForShirt() {
        mainPage.clicktShirtTab();
        mainPage.scrollToItem();
        mainPage.navigateToItemView();
        mainPage.clickAddToCart();
        mainPage.clickProceedToCheckout();

        String actualResult = mainPage.getTotalPrice();
        String expectedResult = "$18.511";

        Assert.assertEquals("Actual result is:" + actualResult + "Expected result is:" + expectedResult, expectedResult , actualResult);

    }
}
