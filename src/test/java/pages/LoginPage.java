package pages;

import dto.UserDTO;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(xpath = "//*[@text='Email']")
    MobileElement inputEmail;

    @FindBy(xpath = "//*[@text='Password']")
    MobileElement inputPassword;

    @FindBy(xpath = "//*[@class='android.widget.Button']")
    MobileElement btnYalla;

    SearchPage searchPage = new SearchPage();

    public void login(UserDTO user) {
        searchPage.clickMoreOptions();
        searchPage.clickLoginOpen();
        fillLoginForm(user);
    }

    private void fillLoginForm(UserDTO user) {
        typeEmail(user.getUsername());
        typePassword(user.getPassword());
        clickBtnYallaLogin();
    }

    private void clickBtnYallaLogin() {
        clickBase(btnYalla, 10);
    }

    private void typePassword(String password) {
        sendTextBase(inputPassword, 10, password);
    }

    private void typeEmail(String username) {
        sendTextBase(inputEmail, 10, username);
    }
}
