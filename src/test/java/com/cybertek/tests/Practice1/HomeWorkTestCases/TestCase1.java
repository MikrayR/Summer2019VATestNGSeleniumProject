package com.cybertek.tests.Practice1.HomeWorkTestCases;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Test case #1
 * Step 1. Go to “http://practice.cybertekschool.com”
 * Step 2. Click on “Registration Form”
 * Step 3. Enter “wrong_dob” into date of birth input box.
 * Step 4. Verify that warning message is displayed: “The date of birth is not valid”
 */

public class TestCase1 {

    WebDriver driver;    // this works for every case we cannot reasign it example: String driver=WebDriverFactory.getDriver("chrome")
    @BeforeMethod
    public void setupMethod() {
        //   WebDriver driver = WebDriverFactory.getDriver("chrome");   it is not applicable this is a mistake
        //   if we use this way we will get error because this equal to reasigning it

        driver = WebDriverFactory.getDriver("chrome");

    }

    @AfterMethod
    public void teardownMethod() throws InterruptedException {
        Thread.sleep(3000);
       // driver.quit();
    }

    @Test
    public void WarningMessage(){
       // Step 1. Go to “https://practice- cybertekschool.herokuapp.com”
        driver.get("https://practice-cybertekschool.herokuapp.com");

        // * Step 2. Click on “Registration Form”
        driver.findElement(By.xpath("//a[contains(text(), 'Registration Form')]")).click();

        // * Step 3. Enter “wrong_dob” into date of birth input box.
        driver.findElement(By.xpath("//input[@name='birthday']")).sendKeys("Wrong_dob");

        // * Step 4. Verify that warning message is displayed: “The date of birth is not valid”
        WebElement warningMessage=driver.findElement(By.xpath("//small[@data-bv-result='INVALID']"));
        System.out.println("warningMessage: "+warningMessage.getText());
    }
}
