package tests;

import dto.UserDTO;
import pages.LoginPage;
import pages.SearchPage;
import pages.SignUpPage;
import pages.SplashPage;
import utils.RandomUtils;

public class BaseTest {
    SplashPage splashPage = new SplashPage();
    SearchPage searchPage = new SearchPage();
    LoginPage loginPage = new LoginPage();
    SignUpPage signUpPage = new SignUpPage();
    RandomUtils randomUtils = new RandomUtils();

    UserDTO user = UserDTO.builder()
            .username("aaaaa@mail.com")
            .password("123456Aa$")
            .build();
}
