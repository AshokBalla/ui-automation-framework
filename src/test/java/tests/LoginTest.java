package tests;

import base.BaseTest;
import framework.pages.LoginPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoginTest extends BaseTest {

    @Test
    public void smokeLoginPageOpens() {
        LoginPage lp = new LoginPage(driver);
        lp.goToHome();
        lp.clickSignIn();
        Assertions.assertTrue(lp.isAtLoginPage(), "Should be at login page");
    }
}
