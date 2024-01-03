package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest{

    @Test
    public void loginTestPositive() {
        loginPage.login(user);
        Assert.assertTrue(searchPage.validateLogoutAvailable());
    }
}
