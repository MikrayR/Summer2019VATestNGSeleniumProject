package com.cybertek.tests.Practice1;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CssPractice {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        WebElement redButton=driver.findElement(By.cssSelector("#red"));
        redButton.click();
       // WebElement yellow=driver.findElement(By.cssSelector("div:nth-child(7)>label"));
       // yellow.click();
    }
}
