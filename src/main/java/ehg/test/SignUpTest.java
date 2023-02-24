package ehg.test;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import ehg.base.Hooks;
import ehg.pageObjects.Homepage;
import ehg.pageObjects.RegisterPage;
import ehg.pageObjects.YourAccountPage;

public class SignUpTest extends Hooks {

    public SignUpTest() throws IOException {
        super();
        //TODO Auto-generated constructor stub
    }

    @Test
    public void RegisterUserTest() throws IOException, InterruptedException {

        // creating an object of the test store Homepage
        Homepage home = new Homepage();
        home.getSignUpButtonLink().click();

        ArrayList<String> windowsHandles = new ArrayList<String>(getDriver().getWindowHandles());
        System.out.println("There are " + windowsHandles.size() + " tabs open");
        // switch to window 1
        getDriver().switchTo().window(windowsHandles.get(1));

        // creating an object of the test store RegisterPage
        RegisterPage register = new RegisterPage();
        register.getFirstNameField().sendKeys("Pedro");
        register.getLastNameField().sendKeys("Pascal");
        register.getEmailAddressField().sendKeys("pedro_pascal@gmail.com");
        register.getDialCodeSelectMenu().click();
        register.getDialPHCode().click();
        register.getPhoneNumberField().sendKeys("1234567");
        register.getCompanyNameField().sendKeys("The last of Us Co.");
        register.getStreetAddressField().sendKeys("Bonbon");
        register.getStreetAddressTwoField().sendKeys("Macajalar Camaman-an");
        register.getCityField().sendKeys("Cagayan de Oro City");
        register.getStateField().sendKeys("Misamis Oriental");
        register.getPostCodeField().sendKeys("9000");
        
        // creating an object of the menu country
        Select menuCountry = new Select(register.getCountryDropdownMenu());
        menuCountry.selectByValue("PH");

        register.getMobileField().sendKeys("1234567");
        register.getPasswordField().sendKeys("pedro_pascal1234");
        register.getConfirmPasswordField().sendKeys("pedro_pascal1234");
        register.getToggleJoinSwitch().click();

        Thread.sleep(10000);

        // click im not a robot in capcha
        new WebDriverWait(getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[starts-with(@name, 'a-') and starts-with(@src, 'https://www.google.com/recaptcha')]")));
        new WebDriverWait(getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("/html//span[@id='recaptcha-anchor']"))).click();
        
        Thread.sleep(3000);

        // switch to window 1
        getDriver().switchTo().window(windowsHandles.get(1));
        register.getRegisterButton().click();

        // creating an object of the test store YourAccountPage
        YourAccountPage account = new YourAccountPage();
        try {
            account.getLogoutLink().click();
        } catch (Exception e) {
			Assert.fail();
		}
    }
    
}
