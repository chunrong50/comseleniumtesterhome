import com.testerhome.selenium.driver.Driver;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import java.util.concurrent.TimeUnit;

public class ClickBanner {


    @BeforeEach
    private  void setup(){


    }

    @Test
    private void test(){


        Driver.getInstance().driver.get("https://testerhome.com/");
        Driver.getInstance().driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        Driver.getInstance().driver.manage().window().maximize();
        By  search= By.cssSelector(".form-group > input");


        Driver.getInstance().driver.findElement(search).sendKeys("selenium");

        try {
            Thread.sleep(5);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    @AfterEach
    private void teardown(){
        Driver.getInstance().driver.close();
    }


}
