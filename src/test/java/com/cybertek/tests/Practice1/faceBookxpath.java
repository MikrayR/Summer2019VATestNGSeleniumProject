package com.cybertek.tests.Practice1;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class faceBookxpath {
    public static void main(String[] args) {
        //open browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        //go to faceBook web page
        driver.get("https://www.facebook.com/");    //url in the browser
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Hello");
       // driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("123456");
        driver.findElement(By.xpath("//*[@name=\"pass\"]")).sendKeys("34567");
        driver.findElement(By.xpath("//*[@type=\"submit\"]")).click();    // create own xpath by typing it
       // driver.findElement(By.xpath("//*[@id=\"u_0_2\"]")).click();


    }
}
