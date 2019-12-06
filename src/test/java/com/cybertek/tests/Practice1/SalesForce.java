package com.cybertek.tests.Practice1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesForce {
    public static void main(String[] args) {

       //set up chrome browser
        WebDriverManager.chromedriver().setup();
        //create object
        WebDriver driver=new ChromeDriver();
        // open url
        driver.get("https://login.salesforce.com/");
        //use id to login
        driver.findElement(By.id("username")).sendKeys("Hello");
        //use id
        driver.findElement(By.id("password")).sendKeys("123456");
        driver.findElement(By.xpath("//*[@id=\"Login\"]")).click();
       System.out.println( driver.findElement(By.xpath("//*[@id=\"error\"]")).getText());


    }
}
