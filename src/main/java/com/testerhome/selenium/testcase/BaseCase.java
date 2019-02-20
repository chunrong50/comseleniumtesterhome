package com.testerhome.selenium.testcase;

import com.testerhome.selenium.driver.Driver;
import org.junit.jupiter.api.*;

public class BaseCase {

    @BeforeAll
    public  static void beforeAll(){
        Driver.getInstance().start();

    }


    @AfterAll
    public static void afterAll(){
        Driver.getInstance().driver.quit();

    }
}
