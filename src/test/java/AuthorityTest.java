import driver.Driver;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import page.MainPage;
import sun.jvm.hotspot.utilities.Assert;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class AuthorityTest {

    static WebDriver driver;

    @BeforeAll
    public static void before(){
        Driver.start();
        driver=Driver.getCurrentDriver();
    }

    @Test
    public void test(){
        String  source=null;
        driver.get("https://testerhome.com/");
        MainPage  mainPage=new MainPage();

       source= mainPage.gotoCorporationPage().gotoHogwartsPage().TopicNotAccess();
       assertThat(source.contains("访问被拒绝，你可能没有权限或未登录"), equalTo(true));
    }

    @AfterAll
    public  static void after(){
        driver.close();
        driver.quit();
    }
}
