import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Testcase {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.enableBiDi()
                .addArguments("--window-size=1920,1080");

        driver = new ChromeDriver(options);

    }

    @AfterClass
    public void tearDown() {
//        if (driver != null) {
//            driver.quit();
//        }
    }
}
