package tests;

import dto.UserDTO;
import pages.*;
import utils.RandomUtils;

public class BaseTest {
    SplashPage splashPage = new SplashPage();
    SearchPage searchPage = new SearchPage();
    LoginPage loginPage = new LoginPage();
    SignUpPage signUpPage = new SignUpPage();
    MyCarsPage myCarsPage = new MyCarsPage();
    AddNewCarPage addNewCarPage = new AddNewCarPage();
    RandomUtils randomUtils = new RandomUtils();

    UserDTO user = UserDTO.builder()
            .username("aaaaa@mail.com")
            .password("123456Aa$")
            .build();
}
