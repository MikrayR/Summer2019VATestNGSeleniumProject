package com.cybertek.tests.d10_synchronization;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ImplicitWaitTest {

    WebDriver driver;
    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        //implicitlyWait--> this is a wait/ synchronization option from selenium. it takes 2 param; 1.Amount of time; 2. Unit of time
        //this waits for elements to be found in HTML. it only works when we call the finElement method  and this is not actually wait it is just little wait until find element
        // and only set once ,
        // then it is used by the rest of the program. if we have many findElement
        // it is good to put it in this spot works for any test
        //not to put after test ended spot it is not good practice
        // how find Element works?
        // we provide some locator call the method it goies page and try find element if element found it will return the element
        // if element not found it will return the element
        //it will keep trying to find element.
        // if element found during that time it will return the elment
        // if not, it will throw "NoSuchElementException
        // implicit wait does not work with findElemntsss
        //thread.sleep--> wait every time when we call it
        //iplicitWait---> wait only one time until find element if element is not found such period of time will thrown "NoSuchElementException"
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void teardownMethod() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
    @Test
    public void test1()  {
        driver.get("http://practice.cybertekschool.com/dynamic_loading/4");

        System.out.println(driver.findElement(By.id("finish")).getText());



    }


}
