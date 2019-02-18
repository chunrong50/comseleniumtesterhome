import driver.Driver;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.concurrent.TimeUnit;

public class ClickBanner {
    WebDriver  driver;
    Driver   myDriver=new Driver();

    @BeforeAll
    private  void setup(){
        myDriver.start();
        driver=myDriver.getCurrentDriver();

    }

    @Test
    private void test(){


        driver.get("https://testerhome.com/");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.manage().window().maximize();
        By  search= By.cssSelector(".form-group > input");


        driver.findElement(search).sendKeys("selenium");

        try {
            Thread.sleep(5);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    @AfterAll
    private void teardown(){
        driver.close();
    }


}
