package com.cybertek.tests.d4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TagNameLocatorDemo {

    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/sign_up");

        WebElement fullName=driver.findElement(By.tagName("input"));
        fullName.sendKeys("Kozzat");

        WebElement email=driver.findElement(By.name("email"));
        email.sendKeys("hihi@yahoo.com");   // if we use tag: selenium read top to botton and left to right locator and only take first match

                                                            // in the result it printed for the first one so we need to to use different locator
        WebElement submitbutton=driver.findElement(By.tagName("button"));
        submitbutton.click();

    }
}
