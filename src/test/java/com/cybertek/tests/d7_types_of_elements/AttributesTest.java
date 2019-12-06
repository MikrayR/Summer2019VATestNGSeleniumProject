package com.cybertek.tests.d7_types_of_elements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AttributesTest {
    @Test
    public void test1() {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/radio_buttons");

        WebElement blue=driver.findElement(By.id("blue"));
        //get the value of attribute "name"
        System.out.println(blue.getAttribute("name"));

        //get the value of attribute "id"
        System.out.println(blue.getAttribute("id"));

        //we get null if the element dont have attribute
        System.out.println(blue.getAttribute("href"));

        //it gives empty string because we cannot see it but it is there
        System.out.println(blue.getAttribute("class"));

        //it returns true false
        System.out.println(blue.getAttribute("checked"));

        //returns the html information of that element
        System.out.println(blue.getAttribute("outerHTML"));  // if we could not get text

        // returns the text of element(in certain cases)   shouldn't return anything
        System.out.println(blue.getAttribute("value"));

        //returns the text of element(in certain cases) shouldn't return anything
        System.out.println(blue.getAttribute("innerHTML"));

        // verify if element is displayed on screen, verify if visible ; only help us agter find the element
        Assert.assertTrue(blue.isDisplayed());

    }
}