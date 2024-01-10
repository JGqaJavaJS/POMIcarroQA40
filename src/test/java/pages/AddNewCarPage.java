package pages;

import config.AppiumConfig;
import dto.AddCarDTO;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

public class AddNewCarPage extends BasePage{

    @FindBy(xpath="//*[@resource-id='com.telran.ilcarro:id/editSerial']")
    MobileElement inputSerNumber;

    @FindBy(xpath="//*[@resource-id='com.telran.ilcarro:id/editMan']")
    MobileElement inputManufacture;

    @FindBy(xpath="//*[@resource-id='com.telran.ilcarro:id/editModel']")
    MobileElement inputModel;

    @FindBy(xpath="//*[@resource-id='com.telran.ilcarro:id/editCity']")
    MobileElement inputCity;

    @FindBy(xpath="//*[@resource-id='com.telran.ilcarro:id/editPrice']")
    MobileElement inputPrice;

    @FindBy(xpath="//*[@resource-id='com.telran.ilcarro:id/editCarClass']")
    MobileElement inputCarClass;

    @FindBy(xpath="//*[@resource-id='com.telran.ilcarro:id/text1']")
    MobileElement btnOpenFuelTypes;

    // TODO fix here - add possibility to use any fuel type
    @FindBy(xpath="//*[@text='Diesel']")
                //*[@text='Diesel']
    MobileElement btnDiesel;

    public MobileElement getElementByFuelType(String fuelType) {
        String locator = String.format("//*[@text='%s']", fuelType);
        return (MobileElement) AppiumConfig.getDriver().findElement(By.xpath(locator));
    }

//    String someStrVariable = "";
//    By someEl = By.xpath(String.format("//a[@attName='idForCar=%s']", someStrVariable));

    @FindBy(xpath="//*[@resource-id='com.telran.ilcarro:id/editYear']")
    MobileElement inputYear;

    @FindBy(xpath="//*[@resource-id='com.telran.ilcarro:id/editSeats']")
    MobileElement inputSeats;

    @FindBy(xpath="//*[@resource-id='com.telran.ilcarro:id/editAbout']")
    MobileElement inputAbout;

    @FindBy(xpath="//*[@resource-id='com.telran.ilcarro:id/addCarBtn']")
    MobileElement btnAddCar;

    public void fillAddNewCarFields(AddCarDTO car) {
        typeSerNumber(car.getSerialNumber());
        typeManufacture(car.getManufacture());
        typeModel(car.getModel());
        typeCity(car.getCity());
        typeCarPrice(car.getPricePerDay());
        typeClassCar(car.getCarClass());
        // textContains(\"type\")
        scrollToTheElementOnTheNextScreen("textContains(\"Add\")");
        clickOpenFuelTypes();
        // TODO fuel
        clickOnGivenFuelType(car.getFuel());
        typeYear(car.getYear());
        typeSeatsQuantity(car.getSeats());
        typeAboutCar(car.getAbout());
        clickBtnAddCar();
    }

    public void clickBtnAddCar() {
        clickBase(btnAddCar, 5);
    }

    public void typeAboutCar(String about) {
        sendTextBase(inputAbout, 5, about);
    }

    public void typeSeatsQuantity(int seats) {
        sendTextBase(inputSeats, 5, String.valueOf(seats));
    }

    public void typeYear(int year) {
        sendTextBase(inputYear, 15, String.valueOf(year));
    }

    public void clickOnGivenFuelType(String fuel) {
        // TODO
       // clickBase(btnDiesel, 15);
        clickBase(getElementByFuelType(fuel), 15);
    }

    public void clickOpenFuelTypes() {
        clickBase(btnOpenFuelTypes, 15);
    }

    public void typeClassCar(String carClass) {
        sendTextBase(inputCarClass, 5, carClass);
    }

    public void typeCarPrice(int pricePerDay) {
        sendTextBase(inputPrice, 5, String.valueOf(pricePerDay));
    }

    public void typeCity(String city) {
        sendTextBase(inputCity, 5, city);
    }

    public void typeModel(String model) {
        sendTextBase(inputModel, 5, model);
    }

    public void typeManufacture(String manufacture) {
        sendTextBase(inputManufacture, 5, manufacture);
    }

    public void typeSerNumber(String serialNumber) {
        sendTextBase(inputSerNumber, 15, serialNumber);
    }
}
