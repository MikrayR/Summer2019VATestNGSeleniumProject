package com.cybertek.tests.d2_webdriver_basics;

import com.cybertek.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CallTheFactory {
    public static void main(String[] args) {
//        WebDriverManager.chromedriver().setup();           // we don't need it any more because utilities we create reusable codes
//        WebDriver driver=new ChromeDriver();

          WebDriver driver= WebDriverFactory.getDriver("chrome");
          WebDriver driver2= WebDriverFactory.getDriver("firefox");
//          driver.manage().window().fullscreen();
//          driver2.manage().window().fullscreen();



    }
}
