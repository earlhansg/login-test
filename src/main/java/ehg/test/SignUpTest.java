package ehg.test;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import ehg.base.Hooks;
import ehg.pageObjects.Homepage;
import ehg.pageObjects.RegisterPage;

public class SignUpTest extends Hooks {

    public SignUpTest() throws IOException {
        super();
        //TODO Auto-generated constructor stub
    }

    @Test
    public void RegisterUserTest() throws IOException {

        // creating an object of the test store homepage
        Homepage home = new Homepage();
        home.getSignUpButtonLink().click();

        ArrayList<String> windowsHandles = new ArrayList<String>(getDriver().getWindowHandles());
        System.out.println("There are " + windowsHandles.size() + " tabs open");
        getDriver().switchTo().window(windowsHandles.get(1));

        // creating an object of the test store registerpage
        RegisterPage register = new RegisterPage();
        register.getFirstNameField().sendKeys("Michael");
        register.getLastNameField().sendKeys("Dela Cruz");
        register.getEmailAddressField().sendKeys("michael_delacruz@gmail.com");
        register.getDialCodeSelectMenu().click();
        register.getDialPHCode().click();
        register.getPhoneNumberField().sendKeys("1234567");
        register.getCompanyNameField().sendKeys("Kshewenger Co.");
        register.getStreetAddressField().sendKeys("NHA Kauswagan");
        register.getStreetAddressTwoField().sendKeys("Macajalar Camaman-an");
        register.getCityField().sendKeys("Cagayan de Oro City");
        register.getStateField().sendKeys("Misamis Oriental");
        register.getPostCodeField().sendKeys("9000");
        Select menuCountry = new Select(register.getCountryDropdownMenu());
        menuCountry.selectByValue("PH");
        register.getMobileField().sendKeys("1234567");
        register.getPasswordField().sendKeys("test1234");
        register.getConfirmPasswordField().sendKeys("test1234");
        // register.getGeneratePasswordButton().click();
        register.getOnJoinSwitch().click();
        // register.getNotRobotCheckbox().click();
        // WebElement iFrame = getDriver().findElement(By.xpath("/html//span[@id='recaptcha-anchor']"));
        // getDriver().switchTo().frame(iFrame);
        // WebElement iFrame_checkbox = getDriver().findElement(By.xpath("/html//span[@id='recaptcha-anchor']"));
        // iFrame_checkbox.click();
        // register.getRegisterButton().click();
        // String strUrl = getDriver().getCurrentUrl();
        // System.out.println("Current Url is:"+ strUrl);
        // Click im not a robot in capcha
        new WebDriverWait(getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[starts-with(@name, 'a-') and starts-with(@src, 'https://www.google.com/recaptcha')]")));
        new WebDriverWait(getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("/html//span[@id='recaptcha-anchor']"))).click();
    }
    
}
