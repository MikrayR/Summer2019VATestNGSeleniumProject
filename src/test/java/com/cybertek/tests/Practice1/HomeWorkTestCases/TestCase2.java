package com.cybertek.tests.Practice1.HomeWorkTestCases;


import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Test case #2
 * Step 1. Go to “https://practice- cybertekschool.herokuapp.com”
 * Step 2. Click on “Registration Form”
 * Step 3. Verify that following options for programming languages are displayed: c++, java, JavaScript
 */

public class TestCase2 {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {

        driver = WebDriverFactory.getDriver("chrome");

    }

    @AfterMethod
    public void teardownMethod() throws InterruptedException {
        Thread.sleep(3000);
        // driver.quit();


    }

    @Test
    public void VerifyListDisplay(){

        driver.get("https://practice-cybertekschool.herokuapp.com");
        driver.findElement(By.xpath("//a[contains(text(), 'Registration Form')]")).click();
    }
}