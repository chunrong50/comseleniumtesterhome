import com.testerhome.selenium.driver.Driver;
import com.testerhome.selenium.testcase.BaseCase;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import com.testerhome.selenium.page.MainPage;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class AuthorityTest extends BaseCase {



    @BeforeEach
    public  void before(){

    }

    @Test
    public void test(){
        String  source=null;
       Driver.getInstance().driver.get("https://testerhome.com/");
        MainPage  mainPage=new MainPage();

       source= mainPage.gotoCorporationPage().gotoHogwartsPage().TopicNotAccess();
       assertThat(source.contains("访问被拒绝，你可能没有权限或未登录"), equalTo(true));
    }

    @AfterEach
    public   void after(){
        Driver.getInstance().driver.close();

    }
}
