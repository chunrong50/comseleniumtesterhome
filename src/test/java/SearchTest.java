import driver.Driver;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import page.MainPage;

public class SearchTest {

  static  WebDriver driver;

    @BeforeAll
    public static void before(){
       Driver.start();
       driver=Driver.getCurrentDriver();

    }

    @Test
    public void test(){

        driver.get("https://testerhome.com/");
        MainPage  mainPage=new MainPage();
        mainPage.gotoSearchResultPage("selenium");
    }

    @AfterAll
    public  static void after(){

        driver.close();
        driver.quit();
    }


}
