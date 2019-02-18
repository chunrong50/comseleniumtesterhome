package page;

import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * 主页面
 */
public class MainPage extends NavBarPage {
  By searchBy = By.cssSelector(".form-group > input");
  By corporation = By.cssSelector("#main-nav-menu a[href$='teams']");


  public SearchResultPage gotoSearchResultPage(String keyword) {

    clear(searchBy);
    sendkeys(searchBy, keyword);
    actionSendENTER();
    return new SearchResultPage();
  }

  public CorporationPage gotoCorporationPage() {
    click(corporation);
    return new CorporationPage();
  }
}
