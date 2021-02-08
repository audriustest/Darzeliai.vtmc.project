package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;


public class UserManagementPage extends AbstractObjectPage {

    @FindBy(id = "navAdmin")
    public WebElement buttonGoToUserManagementPage;

    @FindBy(id = "selRole")
    public WebElement dropdownUserRole;

    @FindBy(id = "txtName")
    public WebElement inputUserName;

    @FindBy(id = "txtSurname")
    public WebElement inputUserSurname;

    @FindBy(id = "txtEmail")
    public WebElement inputUserEmail;

    @FindBy(id = "btnCreate")
    public WebElement buttonCreateUser;

    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div/button")
    public WebElement buttonUserCreatedOk;

    public UserManagementPage(WebDriver driver) {
        super(driver);
    }

    public void buttonGoToUserManagementPage() {
        buttonGoToUserManagementPage.click();
    }

    public void selectDropdownUserRole() {

    }

    public void enterUserName(String value) {
        inputUserName.sendKeys(value);
    }

    public void enterUserSurname(String value) {
        inputUserSurname.sendKeys(value);
    }

    public void enterUserEmail(String value) {
        inputUserEmail.sendKeys(value);
    }

    public void clickButtonCreateUser() {
        buttonCreateUser.click();
    }

    public void clickButtonUserCreatedOk() {
        buttonUserCreatedOk.click();
    }


}
