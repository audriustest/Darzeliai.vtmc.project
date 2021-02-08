package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends AbstractObjectPage {

    // inputs
    @FindBy(id = "username")
    public WebElement inputUsername;

    @FindBy(id = "password")
    public WebElement inputPassword;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/form/button")
	public WebElement buttonPrisijungti;


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void enterUsername(String value) {
        inputUsername.sendKeys(value);
    }

    public void enterPassword(String value) {
        inputPassword.sendKeys(value);
    }

    public void clickButtonPrisijungti() {
	buttonPrisijungti.click();
	}
}
