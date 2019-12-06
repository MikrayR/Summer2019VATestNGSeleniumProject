package com.cybertek.tests.d9_tabs_frames_alerts_popups;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class IFrames {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");

    }

    @AfterMethod
    public void teardownMethod() throws InterruptedException {
       // Thread.sleep(3000);   // once we use iframe we don't use this
        driver.quit();
    }
    @Test
    public void test1() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/iframe");
        Thread.sleep(10000);

        // switch to iframe
        //1. ID or Name
        driver.switchTo().frame("mce_o_ifr");
        driver.findElement(By.id("tinymce")).sendKeys("Hello");
        // when get not such element exeption we can give more time but if it not working then check that html is single or one html inside has another html
        // then we need to switch to iframe first. when it is happen it will not see the default page but only iframe
        // go back to firs frame ---->(defaultContent())
        // useful when we have switched multiple frames and wnat to come to main content
        driver.switchTo().defaultContent();
        // 2.INDEX
        driver.switchTo().frame(0);
        driver.findElement(By.id("tinymce")).sendKeys("Helloooooo");
        // go back to parent frame
        driver.switchTo().parentFrame();

        //3. WEBELEMENT---> locate iframe element and pass as argument
        WebElement frame=driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame(frame);
        driver.findElement(By.id("tinymce")).sendKeys("ItIsMeeeee");
        driver.findElement(By.id("tinymce")).sendKeys("new text");

    }

}
