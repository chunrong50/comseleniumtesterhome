import com.testerhome.selenium.driver.Driver;
import com.testerhome.selenium.testcase.BaseCase;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import com.testerhome.selenium.page.MainPage;

public class SearchTest extends BaseCase {



    @BeforeEach
    public  void before(){

    }

    @Test
    public void test(){
        Driver.getInstance().driver.get("https://testerhome.com/");
        MainPage  mainPage=new MainPage();
        mainPage.gotoSearchResultPage("selenium");
    }

    @AfterEach
    public   void after(){
        Driver.getInstance().driver.close();
    }


}
