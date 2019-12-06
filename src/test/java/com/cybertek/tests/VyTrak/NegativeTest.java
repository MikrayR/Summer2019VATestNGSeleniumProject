package com.cybertek.tests.VyTrak;

import com.cybertek.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * •Each student automate the negativetest case blow :
 * •Go to the login page of VyTrack
 * •Enter invalidcredential (can be any role)
 * •Click login button
 * •Verify that the system shows error message “Invalid user name or password.”
 */

public class NegativeTest {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //Go to the login page of VyhTrack
        driver.get("https://qa2.vytrack.com/user/login");

        //Enter invalidcredential
       WebElement logInBox=driver.findElement(By.cssSelector("input[id='prependedInput']"));
       logInBox.sendKeys("User123");
       WebElement PasswordBox=driver.findElement(By.id("prependedInput2"));
       PasswordBox.sendKeys("manager123");

       //•Click login button
        driver.findElement(By.id("_submit")).click();

        //Verify that the system shows error message “Invalid user name or password.”
        WebElement errorMassage=driver.findElement(By.xpath("//*[@id=\"login-form\"]/fieldset/div[1]/div"));
        String expetedMassage=errorMassage.getText();
        String actualMassage="Invalid user name or password";
        if(expetedMassage.contains(actualMassage)){
            System.out.println("Pass");
            System.out.println("error Massage: "+expetedMassage);
        }else{
            System.out.println("Fail");
            System.out.println("error Massage: "+expetedMassage);

        }
        driver.quit();
    }
}
