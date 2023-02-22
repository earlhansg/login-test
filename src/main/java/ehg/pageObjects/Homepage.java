package ehg.pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import ehg.base.BasePage;

public class Homepage extends BasePage {

    public WebDriver driver;

    By loginButtonLink = By.linkText("Login");
    By signUpButtonLink = By.linkText("Sign Up");

    public Homepage() throws IOException {
        super();
        //TODO Auto-generated constructor stub
    }

    public WebElement getLoginButtonLink() throws IOException {
        this.driver = getDriver();
        return driver.findElement(loginButtonLink);
    }

    public WebElement getSignUpButtonLink() throws IOException {
        this.driver = getDriver();
        return driver.findElement(signUpButtonLink);
    }
    
}
