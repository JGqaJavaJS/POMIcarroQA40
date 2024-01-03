package tests;

import dto.UserDTO;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignUpTests extends BaseTest{

    @Test
    public void positiveSignUp() {
        String email = randomUtils.generateEmail(7);
        System.out.println("email: " + email);
        UserDTO userReg = UserDTO.builder()
                .username(email)
                .password("123456Aa$")
                .lastName("qa40")
                .firstName("webinars")
                .build();

        searchPage.clickMoreOptions();
        searchPage.clickRegBtn();
        signUpPage.fillRegForm(userReg);
        Assert.assertTrue(searchPage.validateLogoutAvailable());
    }
}
