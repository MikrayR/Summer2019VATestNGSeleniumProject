package com.cybertek.tests.d10_synchronization;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ExplicitWaitTests {

    WebDriver driver;
    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");

    }

    @AfterMethod
    public void teardownMethod() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
    @Test
    public void test1WaitForVisible() {
        driver.get("http://practice.cybertekschool.com/dynamic_loading/1");
        //This waits for elements to be found in HTML.
        // It only works when we call the findElement method.
        // Implicitly wait only waits until the element is located.
        //click on start
        driver.findElement(By.tagName("button")).click();
        // click on start that will display the input field ( using firefox Webbrowser)
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        // enter username
        //  driver.findElement(By.id("username")).sendKeys("Hi extremely fast!");
        // finding element that is not visible
        WebElement username = driver.findElement(By.id("username"));

        // click on the elment that is not visible
        //   username.sendKeys("Hi extremely fast!(yes it is");
        // enter username but element is not visible we get ElementNotInteractableException
        // is this case we have to wait until it is visible
        // sometimes we wait for element to be enabled, element to have certain, element dissapear, title to have some text.
        //when we wait for specific things to happen we use Explicit wait.

        //Create explicit wait object
        WebDriverWait wait = new WebDriverWait(driver, 10);
        //  WebDriverWait---> class used to explicit wait; it takes
        //actually: this wait for the specific element to be visible
        wait.until(ExpectedConditions.visibilityOf(username));

        username.sendKeys("Hi extremely fast!(yes it is)");
    }
      @Test
      public void test2TobeEnabled(){
          driver.get("http://practice.cybertekschool.com/dynamic_dynamic_controls");
          driver.findElement(By.cssSelector("button[onclick='swapInput()']"));
          WebElement input=driver.findElement(By.cssSelector("input[type='text'"));

          WebDriverWait wait=new WebDriverWait(driver,10);

          // wait for element to be clickable/enabled
          // depending what condition we are using, we pass weblement by locator or text to the expected conditions
          //in expilicit wait, wait happens when we call the wait.until method
          // explicit wait only waits for certain  condition to complete, once the condition is met it will  stop waiting
          // if the condition is not met and the time runs out we get TimeoutException.
          wait.until(ExpectedConditions.elementToBeClickable(input));
                                        // this is the part only change


          input.sendKeys("slowdown little bit");


    }

}
