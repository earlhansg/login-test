package ehg.pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import ehg.base.BasePage;

public class YourAccountPage extends BasePage{
    
    public WebDriver driver;

    By logoutLink = By.cssSelector("a#Secondary_Sidebar-Client_Shortcuts-Logout");

    public YourAccountPage() throws IOException {
        super();
        //TODO Auto-generated constructor stub
    }

    public WebElement getLogoutLink() throws IOException {
        this.driver = getDriver();
        return driver.findElement(logoutLink);
    }

}
