package pages;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage{ // SearchScreen

    @FindBy(xpath = "//*[@content-desc='More options']")
    MobileElement btnMoreOptions;

    @FindBy(xpath = "//*[@text='Login']")
    MobileElement btnOpenLoginPage;

    @FindBy(xpath = "//*[@text='Registration']")
    MobileElement btnOpenRegPage;

    @FindBy(xpath = "//*[@text='Logout']")
    MobileElement btnLogout;

    public void clickMoreOptions() {
        clickBase(btnMoreOptions, 15);
    }

    public void clickLoginOpen() {
        clickBase(btnOpenLoginPage, 5);
    }

    public boolean validateLogoutAvailable() {
        clickMoreOptions();
        return isTextContains(btnLogout, "Logout", 10);
    }

    public void clickRegBtn() {
        clickBase(btnOpenRegPage, 10);
    }
}
