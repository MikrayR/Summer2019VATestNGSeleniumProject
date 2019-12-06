package com.cybertek.tests.d7_types_of_elements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DisplayedTest {
    @Test
    public void test(){
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dynamic_loading/1");

        // verify the element is displayed
        WebElement home=driver.findElement(By.linkText("Home"));
        Assert.assertTrue(home.isDisplayed());

        //verify is the element is not displayed
        WebElement blue=driver.findElement(By.id("username"));

        //verify if the element is displayed on screen. verify if visible
        Assert.assertTrue(blue.isDisplayed());

        // We fail because selenium not able to verify the element is in the different pages
        // in order to access element on the different page we need to learn exception.


    }
}
