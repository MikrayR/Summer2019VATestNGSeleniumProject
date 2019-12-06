package com.cybertek.tests.d2_webdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;

public class GetUrlAndTitle {
    public static void main(String[] args) {
        // set up chrome driver
        WebDriverManager.chromedriver().setup();
        // open chrome browser
        WebDriver driver = new ChromeDriver();
        // opening new window
        driver.get("https://www.facebook.com");
    String title=driver.getTitle();

// get the title of the page
        System.out.println("title= "+title);
       //get url
        String url=driver.getCurrentUrl();
        System.out.println("url = " + url);
        String pageSource=driver.getPageSource();
        System.out.println("pageSource = " + pageSource);
        driver.findElement(By.id("email")).sendKeys("Hello");
        driver.findElement(By.name("pass")).sendKeys("1234");
        driver.findElement(By.xpath("//*[@id=\'u_0_2\']")).click();
       // driver.quit();
    }
}
