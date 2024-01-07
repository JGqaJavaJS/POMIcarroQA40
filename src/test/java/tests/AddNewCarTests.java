package tests;

import dto.AddCarDTO;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddNewCarTests extends BaseTest{

    @Test
    public void addNewCarPositive() {
        String serNumber = String.valueOf(randomUtils.generateNumber(12));
        AddCarDTO addCarDTO = AddCarDTO.builder()
                .serialNumber(serNumber)
                .manufacture("qa40")
                .model("corsa")
                .year(1990)
                .fuel("Diesel")
                .seats(2)
                .carClass("ads")
                .pricePerDay(9)
                .about("fff")
                .city("Tel Aviv")
                .build();
        loginPage.login(user);
        searchPage.clickMoreOptions();
        searchPage.clickMyCars();
        myCarsPage.clickPlusBtn();
        addNewCarPage.fillAddNewCarFields(addCarDTO);
        Assert.assertTrue(myCarsPage.validateTheCarWasAdd(serNumber));
    }
}
