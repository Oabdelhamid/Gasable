package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Manageorder extends POM {

    public Manageorder(WebDriver driver) {
        super(driver);
    }

    public void ToOrderPage() {

        By MangeOrderTab = By.cssSelector("li>a>i.fa.fa-shopping-cart");
        driver.findElement(MangeOrderTab).click();

    }
}
