package company.pages;

import company.model.RegistrationForm;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage {

    private WebDriver driver;

    public RegistrationPage(WebDriver driver) { this.driver = driver; }

    private void selectGender(String gender) {
        if (gender.equals("Mr.")) {
            driver.findElement(By.xpath("//input[@id=\"id_gender1\"]")).click();
        } else {
            driver.findElement(By.xpath("//input[@id=\"id_gender2\"]")).click();
        }
    }

    private void typeCustomerFirstName(String name) {
        driver.findElement(By.id("customer_firstname")).sendKeys(name);
    }

    private void typeCustomerLastName(String name) {
        driver.findElement(By.id("customer_lastname")).sendKeys(name);
    }

    private void typeEmail(String email) {
        WebElement emailField = driver.findElement(By.id("email"));
        if (emailField.getText().equals("")) {
            emailField.clear();
            emailField.sendKeys(email);
        }
    }

    private void typePassword(String name) {
        driver.findElement(By.id("passwd")).sendKeys(name);
    }

    private void setBirthDay(String day) {
        WebElement dayDropDown = driver.findElement(By.xpath("//select[@id=\"days\"]"));
        Select value = new Select(dayDropDown);
        value.selectByValue(day);
    }

    private void setBirthdayMonth(String month) {
        WebElement monthDropDown = driver.findElement(By.xpath("//select[@id=\"months\"]"));
        Select value = new Select(monthDropDown);
        value.selectByValue(month);
    }

    private void setBirthdayYear(String year) {
        WebElement yearDropDown = driver.findElement(By.xpath("//select[@id=\"years\"]"));
        Select value = new Select(yearDropDown);
        value.selectByValue(year);
    }

    private void typeFirsName(String name) {
        driver.findElement(By.id("firstname")).sendKeys(name);
    }

    private void typeLastName(String name) {
        driver.findElement(By.id("lastname")).sendKeys(name);
    }

    private void typeCompany(String name) {
        driver.findElement(By.id("company")).sendKeys(name);
    }

    private void typeAdress1(String name) {
        driver.findElement(By.xpath("//input[@id=\"address1\"]")).sendKeys(name);
    }

    private void typeAdress2(String name) {
        driver.findElement(By.xpath("//input[@id=\"address2\"]")).sendKeys(name);
    }

    private void typeCity(String name) {
        driver.findElement(By.xpath("//input[@id=\"city\"]")).sendKeys(name);
    }

    private void typeState(String state) {
        WebElement stateDropDown = driver.findElement(By.xpath("//select[@style]"));
        Select value = new Select(stateDropDown);
        value.selectByValue(state);

    }

    private void typePostCode(String name) {
        driver.findElement(By.id("postcode")).sendKeys(name);
    }

    private void typeCountry(String country) {
        WebElement countryDropDown = driver.findElement(By.id("id_country"));
        Select value = new Select(countryDropDown);
        value.selectByValue(country);
    }

    private void typeMobilePhone(String name) {
        driver.findElement(By.id("phone_mobile")).sendKeys(name);
    }

    private void typeAlias(String alias) {
        WebElement aliasDropDown = driver.findElement(By.id("alias"));
        Select value = new Select(aliasDropDown);
        value.selectByValue(alias);
    }

    public void clickRegister() {
        WebElement element = driver.findElement(By.xpath("//span[text()=\"Register\"]"));
        element.click();
    }

    public MyAccountPage fillAndSubmitRegistrationForm(RegistrationForm account) {
        this.fillRegistrationForm(account);
        this.clickRegister();
        return new MyAccountPage(driver);
    }

    private void fillRegistrationForm(RegistrationForm account) {
        selectGender(account.getGender());
        typeCustomerFirstName(account.getFirstCustomerName());
        typeCustomerLastName(account.getLastCustomerName());
        typeEmail(account.getEmail());
        typePassword(account.getPass());
        setBirthDay(account.getDay());
        setBirthdayMonth(account.getMonth());
        setBirthdayYear(account.getYear());
        typeFirsName(account.getFirstName());
        typeLastName(account.getLastName());
        typeCompany(account.getCompany());
        typeAdress1(account.getAdress1());
        typeAdress2(account.getAdress2());
        typeCity(account.getCity());
        typeState(account.getState());
        typePostCode(account.getPostcode());
        typeCountry(account.getCountry());
        typeMobilePhone(account.getMobilePhone());
        typeAlias(account.getAlias());
    }


}


