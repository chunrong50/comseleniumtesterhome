package driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

    public static WebDriver driver;


    public static void start() {
        System.setProperty("webdriver.chrome.driver", "/Users/jfpay/Documents/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public static WebElement find(By by) {
        WebElement element = null;
        try {
            element = driver.findElement(by);
        } catch (Exception e) {
            //todo: getPageSource +xpath
            //弹框处理
            element = driver.findElement(by);
        }
        return element;
    }


    public static WebDriver getCurrentDriver() {
        return driver;
    }


}
