package com.testerhome.selenium.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

    public WebDriver  driver;
     public  static Driver  myDriver;

    public static Driver  getInstance(){
        if(myDriver==null)
            myDriver=new Driver();
        return  myDriver;
    }

    public void start() {
        System.setProperty("webdriver.chrome.driver", "/Users/jfpay/Documents/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
    }

    public WebElement find(By by) {
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




}
