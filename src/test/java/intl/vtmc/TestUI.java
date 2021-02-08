package intl.vtmc;




import org.testng.Assert;
import org.testng.annotations.Test;
import page.LoginPage;
import page.UserManagementPage;

import java.util.Random;



public class TestUI extends BaseTest {



//    @Test
//    public void testLoginIncorrect() {
//
//        LoginPage loginPage = new LoginPage(driver);
//        loginPage.enterUsername("admin");
//        loginPage.enterPassword("slaptazodis");
//        loginPage.clickButtonPrisijungti();
//        assertEquals("Neteisingi prisijungimo duomenys!", "Neteisingi prisijungimo duomenys!");
//    }

    @Test (priority=1)
    public void testCreateUserAdminRole() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("admin@admin.lt");
        loginPage.enterPassword("admin@admin.lt");
        loginPage.clickButtonPrisijungti();
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL, "http://akademijait.vtmc.lt:8181/darzelis/" );

        UserManagementPage userManagementPage = new UserManagementPage(driver);

        // Add random letter to generated user data for avoiding duplication error
        Random random = new Random();
        char random_letter = (char)(random.nextInt(26) + 'a');


        Thread.sleep(3000);
        userManagementPage.buttonGoToUserManagementPage();
        Thread.sleep(3000);
        userManagementPage.selectDropdownUserRole();
        userManagementPage.enterUserName("testinis" + random_letter);
        userManagementPage.enterUserSurname("testinis" + random_letter);
        userManagementPage.enterUserEmail("testinis" + random_letter + "@testinis.lt");
        userManagementPage.buttonCreateUser.click();
        Thread.sleep(3000);
        userManagementPage.clickButtonUserCreatedOk();


    }
}

