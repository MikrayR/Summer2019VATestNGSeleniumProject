package com.cybertek.tests.d11_file_upload_actions_class;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * JavaScriptExecutor is used when Selenium Webdriver fails to click on any element due to some issue.
 * JavaScriptExecutor provides two methods "executescript" & "executeAsyncScript" to handle.
 * Navigated to the different page using JavaScriptExecutor.
 * Scrolled down the window using JavaScriptExecutor.
 * Fetched URL, title, and domain name using JavaScriptExecutor.
 */

public class JavaScriptExecutorTest {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
    }

    @AfterMethod
    public void teardownMethod() throws InterruptedException {
        Thread.sleep(20000);
        //  driver.quit();
    }

    @Test
    public void click(){
        driver.get("http://practice.cybertekschool.com/");
        WebElement element = driver.findElement(By.linkText("Home"));
        // this how the JavascriptExecutor object is created
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        // executeScript --> method used to pass js command
        // first string argument is the javascript code
        // second argument is the webElement on which the action will be take
        jse.executeScript("arguments[0].click();", element);

    }

        @Test
    public void type() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/dynamic_controls");
        WebElement element = driver.findElement(By.cssSelector("input[disabled]"));
        JavascriptExecutor jse = (JavascriptExecutor) driver;
       String str = "hello";

//        element.sendKeys(str);
        Thread.sleep(2000);
        jse.executeScript("arguments[0].setAttribute('value', '" + str +"')", element);

     }
    @Test
    public void type2() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/radio_buttons");
        WebElement element = driver.findElement(By.xpath("//label[.='Green']"));
        JavascriptExecutor Jse = (JavascriptExecutor) driver;
        String st = "Red";
        Thread.sleep(2000);

        Jse.executeScript("arguments[0].setAttribute('value', '" + st +"')", element);
    }


    /**
     * JavascriptExecutor
     * Used to send js commands to browser using selenium
     * JavascriptExecutor js = (JavascriptExecutor) driver;
     * js.executeScript(Script,Arguments);
     * Script – This is the JavaScript that needs to execute.
     * Arguments – It is the arguments to the script. It's optional.
     */

    @Test
    public void scroll() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/infinite_scroll");

        JavascriptExecutor jse = (JavascriptExecutor) driver;

        for (int i = 0; i < 5; i++) {
            jse.executeScript("scroll(0, 10000);");
            Thread.sleep(2000);

        }

    }


}