package com.cybertek.tests.d4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class idLocatorTest {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/multiple_buttons");

       // driver.manage().window().maximize();
       // driver.manage().window().fullscreen();
        //id is dynamic which means it is not stable
        WebElement element=driver.findElement(By.id("disappearing_button"));

        String  txt=element.getText();
        System.out.println("txt: "+txt);

        element.click();

        driver.quit();
    }

}
