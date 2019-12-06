package com.cybertek.tests.d2_webdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAnQuit {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();   // opening new window
        driver.manage().window().fullscreen();
        //waiting for second
        Thread.sleep(1000);
        //TOdo close one tab out of one
        driver.get("http://practice.cybertekschool.com");
        //close() ---> close the current tab/window
        driver.close();

        // we need to opening new window connan again because last driver is closed
        driver = new ChromeDriver();   // opening new window
        driver.manage().window().fullscreen();
        //todo close one tab out of two tabs
        driver.get("https://youtube.com");
        Thread.sleep(5000);
        driver.close();
        // closing is one of the cleaning process
        // todo close all open Window and tabs and everything else ok
        driver.quit();

    }
}
