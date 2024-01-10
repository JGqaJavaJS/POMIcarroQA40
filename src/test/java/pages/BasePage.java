package pages;

import config.AppiumConfig;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    public BasePage() {
        PageFactory.initElements(new AppiumFieldDecorator(AppiumConfig.getDriver()), this);
    }

    protected void wait(WebElement element, int time) {
        new WebDriverWait(AppiumConfig.getDriver(), time)
                .until(ExpectedConditions.visibilityOf(element));
    }

    public String getTextBase(MobileElement element, int time) {
        wait(element, time);
        return element.getText().toUpperCase().trim();
    }

    public void clickBase(WebElement element, int time) {
        wait(element, time);
        element.click();
    }

    public void scrollToTheElementOnTheNextScreen(String s) {
        // s = textContains(\"type\") - example
        String str =
                String.format("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().%s)", s);
        System.out.println("str for scrolling: " + str);
        MobileElement element = (MobileElement) AppiumConfig.getDriver().findElement(MobileBy.AndroidUIAutomator(str));
    }

    public void sendTextBase(MobileElement element, int time, String text) {
        wait(element, time);
        element.click();
        element.clear();
        element.sendKeys(text);
        hideKeyboard();
    }

    public void hideKeyboard() {
        AppiumConfig.getDriver().hideKeyboard();
    }

    public boolean isTextContains(MobileElement element, String expectedRes, int time) {
        expectedRes = expectedRes.toUpperCase().trim();
        String actualRes = getTextBase(element, time);
        if(actualRes.contains(expectedRes)) {
            return true;
        } else {
            System.out.println("expected result: " + expectedRes +
                    " actual result: " + actualRes);
            return false;
        }
    }
}
