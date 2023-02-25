package ehg.test;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import ehg.base.Hooks;
import ehg.pageObjects.Homepage;
import ehg.pageObjects.LoginPage;

public class LoginTest extends Hooks{

    public LoginTest() throws IOException {
        super();
        //TODO Auto-generated constructor stub
    }

    @Test
    public void LoginUserTest() throws IOException, InterruptedException {

        // creating an object of the Homepage
        Homepage home = new Homepage();
        home.getLoginButtonLink().click();

        ArrayList<String> windowsHandles = new ArrayList<String>(getDriver().getWindowHandles());
        System.out.println("There are " + windowsHandles.size() + " tabs open");
        // switch to window 1
        getDriver().switchTo().window(windowsHandles.get(1));

        // creating an object of the LoginPage
        LoginPage login = new LoginPage();
        login.getEmailAddressField().sendKeys("juanmarcos@gmail.com");
        Thread.sleep(5000);
        login.getPasswordField().sendKeys("juanmarcos123");
        Thread.sleep(5000);
        new WebDriverWait(getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[starts-with(@name, 'a-') and starts-with(@src, 'https://www.google.com/recaptcha')]")));
        new WebDriverWait(getDriver(), Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(login.getImNotRobotChechBox())).click();
        login.getLoginButton().click();
    }

    
}
