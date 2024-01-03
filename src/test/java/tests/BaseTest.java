package tests;

import dto.UserDTO;
import pages.LoginPage;
import pages.SearchPage;
import pages.SplashPage;

public class BaseTest {
    SplashPage splashPage = new SplashPage();
    SearchPage searchPage = new SearchPage();
    LoginPage loginPage = new LoginPage();

    UserDTO user = UserDTO.builder()
            .username("aaaaa@mail.com")
            .password("123456Aa$")
            .build();
}
