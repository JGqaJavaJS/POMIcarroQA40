package pages;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;

public class MyCarsPage extends BasePage{

    @FindBy(xpath="//*[@resource-id='com.telran.ilcarro:id/addCarBtn']")
    MobileElement btnAddNewCar;
    public void clickPlusBtn() {
        clickBase(btnAddNewCar, 15);
    }
}
