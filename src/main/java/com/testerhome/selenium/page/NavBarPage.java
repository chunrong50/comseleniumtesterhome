package com.testerhome.selenium.page;

import com.testerhome.selenium.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

/**
 * 基础导航类-所有PO页面类的父类
 */
public class NavBarPage {

    public void click(By by) {
        Driver.getInstance().find(by).click();
    }

    public void sendkeys(By by, String key) {
        Driver.getInstance().find(by).sendKeys(key);
    }

    public void clear(By by) {
        Driver.getInstance().find(by).clear();
    }

    public void actionSendENTER() {
        Actions action = new Actions(Driver.getInstance().driver);
        action.sendKeys(Keys.ENTER).perform();
    }


}
