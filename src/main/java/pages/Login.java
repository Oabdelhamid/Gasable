package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login extends POM {

    public Login(WebDriver driver) {
        super(driver);
    }

    public void login(String username, String password) {

    driver.navigate().to("https://test-webadmin.gasable.com/store/");
    By UserName = By.id("mgmt_name");
    By Password = By.id("mgmt_pwd");
    By LoginButton = By.xpath("//button[@type='submit']");

    driver.findElement(UserName).sendKeys(username);
    driver.findElement(Password).sendKeys(password);
    driver.findElement(LoginButton).click();

  }
}
