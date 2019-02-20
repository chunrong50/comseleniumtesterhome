package com.testerhome.selenium.page;

import org.openqa.selenium.By;

/**
 * 社团页面
 */


public class CorporationPage extends NavBarPage {
    By hogwarts = By.cssSelector(".media-heading > a[href$='hogwarts']");

    public HogwartsPage gotoHogwartsPage() {
        click(hogwarts);
        return new HogwartsPage();
    }

}
