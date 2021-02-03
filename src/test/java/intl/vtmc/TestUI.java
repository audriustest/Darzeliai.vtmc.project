package intl.vtmc;


import org.openqa.selenium.By;
import org.testng.annotations.Test;
import page.LoginPage;

import java.io.IOException;

import static org.testng.Assert.assertEquals;


public class TestUI extends BaseTest {

    @Test
    public void testLoginIncorrect() throws IOException, NullPointerException {

        LoginPage loginPage = new LoginPage(driver);

        loginPage.enterUsername("admin");
        loginPage.enterPassword("slaptazodis");
        loginPage.clickButtonPrisijungti();
        assertEquals("Neteisingi prisijungimo duomenys!", "Neteisingi prisijungimo duomenys!");
    }
}
