package com.cybertek.tests.d10_synchronization;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ThreadSleepExample {
        WebDriver driver;
    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");

    }

    @AfterMethod
    public void teardownMethod() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
    @Test
    public void test1() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/dynamic_loading/3");
        // this method is from java, not related to selenium. is used to pause the program; it waits for the duration given.
        // be careful not to use too long or too little; it is recommended to minimize the use of thread.sleep using too much
        // thread.sleep slows the execution of the tests
        Thread.sleep(10000);
        driver.findElement(By.id("username")).sendKeys("hi baby");

    }


}
