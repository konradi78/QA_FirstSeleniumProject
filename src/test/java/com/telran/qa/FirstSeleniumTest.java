package com.telran.qa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class FirstSeleniumTest {

    WebDriver driver;

    //befor - setUp
    @BeforeMethod
    public void setUp(){
         driver = new ChromeDriver();
        // driver = new FirefoxDriver();
        // System.setProperty("webdriver.chrome.driver","c:\\Tools\\chromedriver.exe")
        // driver.get("https://www.justhost.ru");
        driver.navigate().to("https://www.google.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }
    //Test
    @Test
    public void openGoogleTest(){
        System.out.println("Site opened");

    }

    @Test
    public void navigateTest(){
        //go back
        driver.navigate().back();
        //go forward
        driver.navigate().forward();
        //refresh the page
        driver.navigate().refresh();


    }


    //after - tearDown
    @AfterMethod(enabled = false)
            public void tearDown(){
        //close browser current tab
        //driver.close();
        //all tabs
        driver.quit();
    }
}
