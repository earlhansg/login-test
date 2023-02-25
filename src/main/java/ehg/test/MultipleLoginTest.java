package ehg.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;
import org.testng.annotations.Test;

import ehg.base.Hooks;
import ehg.pageObjects.Homepage;
import ehg.pageObjects.LoginPage;
import ehg.pageObjects.YourAccountPage;

public class MultipleLoginTest extends Hooks {

    public MultipleLoginTest() throws IOException {
        super();
        //TODO Auto-generated constructor stub
    }

    @Test
    public void LoginMultipleUsersTest() throws IOException, InterruptedException {

        // creating an object of the Homepage
        Homepage home = new Homepage();
        home.getLoginButtonLink().click();

        ArrayList<String> windowsHandles = new ArrayList<String>(getDriver().getWindowHandles());
        System.out.println("There are " + windowsHandles.size() + " tabs open");
        // switch to window 1
        getDriver().switchTo().window(windowsHandles.get(1));

        FileInputStream workbookLocation = new FileInputStream(System.getProperty("user.dir") + 
        "\\src\\main\\java\\ehg\\resources\\UsersCredentials.xlsx");

        XSSFWorkbook workbook = new XSSFWorkbook(workbookLocation);
        XSSFSheet sheet = workbook.getSheetAt(0);

        for(int i = 1; i < sheet.getLastRowNum() + 1; i++) {
            // creating an object of the LoginPage
            LoginPage login = new LoginPage();
            Row row = sheet.getRow(i);
            String email = row.getCell(0).toString();
            String password = row.getCell(1).toString();
            System.out.println("check email" + email);
            System.out.println("check password" + password);
            Thread.sleep(3000);
            login.getLoginButton().click();
            try {
                // creating an object of the YourAccountPage
                YourAccountPage account = new YourAccountPage();
                account.getLogoutLink().click();
            } catch (Exception e) {
                Assert.fail();
            }

        }

        workbook.close();

    }
    
}
