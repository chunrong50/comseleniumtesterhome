package page;

import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * 霍格测试学院页面
 */
public class HogwartsPage extends NavBarPage {
    By firstTopic = By.cssSelector(".media-heading > a[title$='定向班第一期_Selenium 入门实战_20190217']");
    By userName = By.cssSelector("#user_login");

    public String TopicNotAccess() {
        click(firstTopic);
        WebDriverWait wait = new WebDriverWait(Driver.getCurrentDriver(), 5);
        wait.until(ExpectedConditions.presenceOfElementLocated(userName));

        return Driver.getCurrentDriver().getPageSource();


    }


}
