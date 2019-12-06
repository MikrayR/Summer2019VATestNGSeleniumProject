package com.cybertek.tests.d7_types_of_elements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DisabledElementTest {

    @Test
    public void test1(){
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/radio_buttons");
        //verify disabled element
        WebElement green=driver.findElement(By.id("green"));
        System.out.println("Is element Green enabled: "+ green.isEnabled());
        green.click();    //this button is disable there for not able to click it

        driver.get("http://practice.cybertekschool.com/dynamic_controls");
      //  WebElement input=driver.findElement(By.cssSelector("#input-example>input"));
       // WebElement input=driver.findElement(By.xpath("(//button[@autocomplete='off'])[1]"));
        WebElement input=driver.findElement(By.xpath("//input[@type='text']"));

        System.out.println("Is element Disable spot enabled: "+ input.isEnabled());
       // input.sendKeys("hiItsMeAgain");   //selenium can not make element disable
        driver.quit();
    }
}
