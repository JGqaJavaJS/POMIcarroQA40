package pages;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MyCarsPage extends BasePage{

    @FindBy(xpath="//*[@resource-id='com.telran.ilcarro:id/addCarBtn']")
    MobileElement btnAddNewCar;

    @FindBy(xpath="//*[@resource-id='com.telran.ilcarro:id/myCarSerialTxt']")
    List<MobileElement> listOfAllSerNumbers;
    public void clickPlusBtn() {
        clickBase(btnAddNewCar, 15);
    }

    public boolean validateTheCarWasAdd(String serNumber) {
        boolean flag = false;
        for(MobileElement el: listOfAllSerNumbers) {
            if(getTextBase(el, 10).equals(serNumber)) {
                flag = true;
                break;
            }
        }
        return flag;
    }
}
