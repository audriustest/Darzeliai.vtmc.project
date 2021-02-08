package intl.vtmc;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import page.LoginPage;

public abstract class BaseTest {

    protected static WebDriver driver;

    @BeforeClass
    public static void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @BeforeMethod
    public void openLoginPage() {
        driver.get("http://akademijait.vtmc.lt:8181/darzelis/");
    }

//    @AfterClass
//    public static void closeBrowser() {
//        driver.manage().deleteAllCookies();
//        driver.close();
//    }
}