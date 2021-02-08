package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage extends AbstractObjectPage {


    @FindBy(className = "nav-item mr-2")
	public WebElement buttonUserManagement;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickButtonUserManagement() {
        buttonUserManagement.click();
	}
}
