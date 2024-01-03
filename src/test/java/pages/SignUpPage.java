package pages;

import dto.UserDTO;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage extends BasePage{

    @FindBy(xpath = "//*[@text='Name']")
    MobileElement inputFirstName;

    @FindBy(xpath = "//*[@text='Last Name']")
    MobileElement inputLastName;

    @FindBy(xpath = "//*[@text='Email']")
    MobileElement inputEmail;

    @FindBy(xpath = "//*[@text='Password']")
    MobileElement inputPassword;

    @FindBy(xpath = "//*[@class='android.widget.CheckBox']")
    MobileElement btnCheckBox;

    @FindBy(xpath = "//*[@class='android.widget.Button']")
    MobileElement btnYallaReg;


    public void fillRegForm(UserDTO user) {
        fillName(user.getFirstName());
        fillLastName(user.getLastName());
        fillEmail(user.getUsername());
        fillPassword(user.getPassword());
        clickCheckBox();
        clickYallaReg();
    }

    public void clickYallaReg() {
        clickBase(btnYallaReg, 10);
    }

    public void clickCheckBox() {
        clickBase(btnCheckBox, 10);
    }

    public void fillPassword(String password) {
        sendTextBase(inputPassword, 10, password);
    }

    public void fillEmail(String email) {
        sendTextBase(inputEmail, 10, email);
    }

    public void fillLastName(String lastName) {
        sendTextBase(inputLastName, 10, lastName);
    }

    public void fillName(String firstName) {
        sendTextBase(inputFirstName, 15, firstName);
    }
}
