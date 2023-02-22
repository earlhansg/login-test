package ehg.pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import ehg.base.BasePage;

public class LoginPage extends BasePage {

    public WebDriver driver;

    By emailAddressField = By.cssSelector("input#inputEmail");
    By passwordField = By.cssSelector("input#inputPassword");
    By notRobotCheckBox =  By.cssSelector("[data-phone-cc-input]");
    By loginButton = By.cssSelector("button#login");
    By rememberMeCheckBox = By.cssSelector("input[name='rememberme']");
    By createAccountLink = By.linkText("Create account");


    public LoginPage() throws IOException {
        super();
        //TODO Auto-generated constructor stub
    }

    public WebElement getEmailAddressField() throws IOException {
        this.driver = getDriver();
        return driver.findElement(emailAddressField);
    }

    public WebElement getPasswordField() throws IOException {
        this.driver = getDriver();
        return driver.findElement(passwordField);
    }

    public WebElement getNotRobotCheckBox() throws IOException {
        this.driver = getDriver();
        return driver.findElement(notRobotCheckBox);
    }

    public WebElement getLoginButton() throws IOException {
        this.driver = getDriver();
        return driver.findElement(loginButton);
    }

    public WebElement getRememberMeCheckBox() throws IOException {
        this.driver = getDriver();
        return driver.findElement(rememberMeCheckBox);
    }

    public WebElement getCreateAccountLink() throws IOException {
        this.driver = getDriver();
        return driver.findElement(createAccountLink);
    }
    
}
