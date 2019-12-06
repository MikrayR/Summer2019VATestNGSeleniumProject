package com.cybertek.tests.VyTrak;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class myFirstVyTrak {
    public static void main(String[] args) {

/**
 * •Create a new package in your existing project
 * (Summer2019SeleniumProject)•Createaclassto write your test
 * script(code)•Blow is provided to find 3 webElements :
 */
        //open browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://qa2.vytrack.com");

        String expectedUrl=driver.getCurrentUrl();

        //use locator identify and sendKeys to logIn
       driver.findElement(By.name("_username")).sendKeys("User24");
        driver.findElement(By.name("_password")).sendKeys("UserUser123");
        driver.findElement(By.name("_submit")).click();


        //verify that user login in
        String expectTitle = "Dashboard";
        String actualTitle = driver.getTitle();

        if(expectTitle.equals(actualTitle)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("Excpected result: " + expectTitle + ", actual result: " + actualTitle);
        }
        //close the browser
        driver.quit();

    }
}



