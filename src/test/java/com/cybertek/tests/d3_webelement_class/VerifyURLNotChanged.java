package com.cybertek.tests.d3_webelement_class;

import com.cybertek.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Verify URL not changed
 * open chrome
 * go to http://practice.cybertekschool.com/forgot_password
 * click on Retrieve password
 * verify that url did not change
 */
public class VerifyURLNotChanged {
    public static void main(String[] args) {
        //open chrome
      //  WebDriverManager.chromedriver().setup();
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");

        // save the expected url
        String expectedUrl=driver.getCurrentUrl();

        // click on Terieve password
        // WebElement---> class that represents elements from the webpage
        // findElement--> method used to find element on a page
        // returns a webelement
        WebElement retrievePassword=driver.findElement(By.id("form_submit"));
        // click()----> clicks element
        retrievePassword.click();

        // verify that url did not chage
        String actualUrl=driver.getCurrentUrl();

        if(actualUrl.equals(expectedUrl)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }
        //close the browser
            driver.quit();
    }


}
