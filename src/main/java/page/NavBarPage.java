package page;

import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

/**
 * 基础导航类-所有PO页面类的父类
 */
public class NavBarPage {

    public void click(By by) {
        Driver.find(by).click();
    }

    public void sendkeys(By by, String key) {
        Driver.find(by).sendKeys(key);
    }

    public void clear(By by) {
        Driver.find(by).clear();
    }

    public void actionSendENTER() {
        Actions action = new Actions(Driver.getCurrentDriver());
        action.sendKeys(Keys.ENTER).perform();
    }


}
