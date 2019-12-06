package com.cybertek.tests.d7_types_of_elements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AnotherRadioButtonTest {

    @Test
     public void test1(){
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http:practice.cybertekschool.com/radio_buttons");

        WebElement basketball=driver.findElement(By.id("basketball"));
       // basketball.click();
        WebElement football=driver.findElement(By.id("football"));

        //verify if both radio buttons not selected
       Assert.assertFalse( basketball.isSelected());


      //  Assert.assertTrue( basketball.isSelected());   //I just want to check that assertTrue is True

        //basketball.isSelected()
        Assert.assertFalse(football.isSelected());

    }


}
