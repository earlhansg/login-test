package ehg.pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import ehg.base.BasePage;

public class RegisterPage extends BasePage {

    public WebDriver driver;

    By firstNameField = By.cssSelector("input#inputFirstName");
    By lastNameField = By.cssSelector("input#inputLastName");
    By emailAddressField = By.cssSelector("input#inputEmail");
    By dialCodeSelectMenu = By.cssSelector(".flag-container");
    By dialPHCode = By.cssSelector("[data-dial-code='63']");
    By phoneNumberField = By.cssSelector("input#inputPhone");
    By companyNameField = By.cssSelector("input#inputCompanyName");
    By streetAddressField = By.cssSelector("input[name='address1']");
    By streetAddressTwoField = By.cssSelector("input[name='address2']");
    By cityField = By.cssSelector("input#inputCity");
    By stateField = By.cssSelector("input#stateinput");
    By postCodeField = By.cssSelector("input#inputPostcode");
    By countryDropdownMenu = By.cssSelector("select#inputCountry");
    By mobileField = By.cssSelector("input#customfield2");
    By passwordField = By.cssSelector("input[name='password']");
    By confirmPasswordField = By.cssSelector("input[name='password2']");
    By generatePasswordButton = By.cssSelector(".btn.btn-default.btn-sm.btn-sm-block.generate-password");
    By toggleJoinSwitch = By.cssSelector(".bootstrap-switch.bootstrap-switch-animate.bootstrap-switch-on.bootstrap-switch-small.bootstrap-switch-wrapper");
    By registerButton =  By.cssSelector(".btn.btn-large.btn-primary.btn-recaptcha");

    public RegisterPage() throws IOException {
        super();
        //TODO Auto-generated constructor stub
    }

    public WebElement getFirstNameField() throws IOException {
        this.driver = getDriver();
        return driver.findElement(firstNameField);
    }

    public WebElement getLastNameField() throws IOException {
        this.driver = getDriver();
        return driver.findElement(lastNameField);
    }

    public WebElement getEmailAddressField() throws IOException {
        this.driver = getDriver();
        return driver.findElement(emailAddressField);
    }

    public WebElement getDialCodeSelectMenu() throws IOException {
        this.driver = getDriver();
        return driver.findElement(dialCodeSelectMenu);
    }

    public WebElement getDialPHCode() throws IOException {
        this.driver = getDriver();
        return driver.findElement(dialPHCode);
    }

    public WebElement getPhoneNumberField() throws IOException {
        this.driver = getDriver();
        return driver.findElement(phoneNumberField);
    }

    public WebElement getCompanyNameField() throws IOException {
        this.driver = getDriver();
        return driver.findElement(companyNameField);
    }

    public WebElement getStreetAddressField() throws IOException {
        this.driver = getDriver();
        return driver.findElement(streetAddressField);
    }

    public WebElement getStreetAddressTwoField() throws IOException {
        this.driver = getDriver();
        return driver.findElement(streetAddressTwoField);
    }

    public WebElement getCityField() throws IOException {
        this.driver = getDriver();
        return driver.findElement(cityField);
    }

    public WebElement getStateField() throws IOException {
        this.driver = getDriver();
        return driver.findElement(stateField);
    }

    public WebElement getPostCodeField() throws IOException {
        this.driver = getDriver();
        return driver.findElement(postCodeField);
    }

    public WebElement getCountryDropdownMenu() throws IOException {
        this.driver = getDriver();
        return driver.findElement(countryDropdownMenu);
    }

    public WebElement getMobileField() throws IOException {
        this.driver = getDriver();
        return driver.findElement(mobileField);
    }

    public WebElement getPasswordField() throws IOException {
        this.driver = getDriver();
        return driver.findElement(passwordField);
    }

    public WebElement getConfirmPasswordField() throws IOException {
        this.driver = getDriver();
        return driver.findElement(confirmPasswordField);
    }

    public WebElement getGeneratePasswordButton() throws IOException {
        this.driver = getDriver();
        return driver.findElement(generatePasswordButton);
    }

    public WebElement getToggleJoinSwitch() throws IOException {
        this.driver = getDriver();
        return driver.findElement(toggleJoinSwitch);
    }

    public WebElement getRegisterButton() throws IOException {
        this.driver = getDriver();
        return driver.findElement(registerButton);
    }

}
