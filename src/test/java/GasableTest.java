import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.DependencyMap;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.Login;
import pages.Manageorder;

public class GasableTest extends Testcase {
    @Test
    public void login()  {
        new Login(driver).login("omar", "mr96fyH.");

    }

    @Test(dependsOnMethods = { "login" })
    public void MoveTOManageOrderPage(){
     new Manageorder(driver).ToOrderPage();

    }


}

